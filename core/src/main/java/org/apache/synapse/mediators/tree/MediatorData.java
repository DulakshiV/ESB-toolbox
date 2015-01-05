package org.apache.synapse.mediators.tree;

import java.util.ArrayList;

import org.apache.axiom.util.UIDGenerator;
import org.apache.synapse.Mediator;
import org.apache.synapse.MessageContext;
import org.apache.synapse.SequenceType;
import org.apache.synapse.SynapseConstants;
import org.apache.synapse.SynapseLog;
import org.apache.synapse.core.axis2.ProxyService;
import org.apache.synapse.mediators.FlowContinuableMediator;
import org.apache.synapse.mediators.ListMediator;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.apache.synapse.rest.RESTConstants;

public class MediatorData {

	public static   boolean hasList(Mediator m) {
		if (m instanceof FlowContinuableMediator || m instanceof ListMediator)
			return true;

		else
			return false;
	}

	public static   void addNestedMediator(MessageContext synCtx,
			SequenceType sequenceType, Mediator m) {
		TreeNode checkForRoot = synCtx.getCurrent();
		if (checkForRoot == null || "".equals(checkForRoot)
				|| sequenceType.toString().contains("FAULT"))
			addToRoot(synCtx, sequenceType, m);
		else{
	     
			createNewMediator(synCtx, m);
		}
	}

	public static   TreeNode addToRoot(MessageContext synCtx,
		SequenceType sequenceType, Mediator mediator) {
		TreeNode root;
		SuperMediator newMediator = new SuperMediator();
		ArrayList<TreeNode> children = new ArrayList<TreeNode>();

		newMediator.setMediatorName(sequenceType.toString());
		newMediator.setStartTime(System.currentTimeMillis());
		newMediator.setType("nested");
		newMediator.setEnvelop(synCtx.getEnvelope().getBody().toString());
		newMediator.setMsgID((String) synCtx.getProperty("CommonMessageID"));
		newMediator.setRootType(sequenceType.toString());
		newMediator.setId("0");
		root = new TreeNode(null, newMediator, children);
		synCtx.setProperty("Root", root);

		switch (sequenceType) {

		case PROXY_INSEQ: {
		
			synCtx.setProperty("NonFaultRoot", root);
			newMediator.setServiceName(synCtx.getProperty(
					SynapseConstants.PROXY_SERVICE).toString());
			break;
		}
		case PROXY_OUTSEQ: {
			synCtx.setProperty("NonFaultRoot", root);
			newMediator.setServiceName(synCtx.getProperty(
					SynapseConstants.PROXY_SERVICE).toString());
			break;
		}
		case PROXY_FAULTSEQ: {
	
			newMediator.setServiceName(synCtx.getProperty(
					SynapseConstants.PROXY_SERVICE).toString());

			break;
		}
		case API_INSEQ: {
			newMediator.setServiceName(synCtx.getProperty(
					RESTConstants.SYNAPSE_REST_API).toString());

			synCtx.setProperty("NonFaultRoot", root);
			break;
		}
		case API_OUTSEQ: {
			synCtx.setProperty("NonFaultRoot", root);
			newMediator.setServiceName(synCtx.getProperty(
					RESTConstants.SYNAPSE_REST_API).toString());

			break;
		}
		case API_FAULTSEQ: {
			newMediator.setServiceName(synCtx.getProperty(
					RESTConstants.SYNAPSE_REST_API).toString());

			break;
		}
		default: {
			SequenceMediator seqMediator = (SequenceMediator) mediator;
			newMediator.setMediatorName(seqMediator.getType() + " "
					+ seqMediator.getName());
			
			newMediator.setRootType(seqMediator.getType() + " "
					+ seqMediator.getName());

			synCtx.setProperty("NonFaultRoot", root);
			break;
		}
		}

		synCtx.setCurrent(root);

		return root;
	}

	public static   TreeNode createNewMediator(MessageContext synCtx,
			Mediator mediator) {

		SuperMediator newMediator = new NestedMediator();
		ArrayList<TreeNode> children = new ArrayList<TreeNode>();

		if (mediator instanceof SequenceMediator)
			newMediator.setMediatorName(((SequenceMediator) mediator).getType()
					+ " " + ((SequenceMediator) mediator).getName());

		else
			newMediator.setMediatorName(mediator.getType().toString());

		newMediator.setType("nested");
		newMediator.setStartTime(System.currentTimeMillis());
		newMediator.setEnvelop(synCtx.getEnvelope().getBody().toString());
		newMediator
		.setRootType(synCtx.getCurrent().getContents().getRootType());
		newMediator.setMsgID((String) synCtx.getProperty("CommonMessageID"));

		newMediator.setServiceName(synCtx.getCurrent().getContents()
				.getServiceName());
		
		TreeNode nonroot = new TreeNode(synCtx.getCurrent(), newMediator, children);
		try {
	       
			synCtx.getCurrent().addChildTreeNodeMediator(nonroot);
		
			newMediator.setId(synCtx.getCurrent().getContents().getId()+"-"+(synCtx.getCurrent().getChildren().size()-1));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		synCtx.setCurrent(nonroot);

		return synCtx.getCurrent();
	}
	
	public static   void createNewSingleMediator(MessageContext synCtx,
			Mediator child) {
		SuperMediator newMediator = new SingleMediator();
		ArrayList<TreeNode> children = new ArrayList<TreeNode>();
		newMediator.setMediatorName(child.getType());
		newMediator.setStartTime(System.currentTimeMillis());
		newMediator.setMsgID((String) synCtx.getProperty("CommonMessageID"));
		newMediator.setType("single");
		newMediator.setEnvelop(synCtx.getEnvelope().getBody().toString());
		newMediator.setServiceName(synCtx.getCurrent().getContents()
				.getServiceName());
		
		TreeNode nonroot = new TreeNode(synCtx.getCurrent(),newMediator, children); // adding the new
		// node to the
		// tree
		try {
	      synCtx.getCurrent().addChildTreeNodeMediator(nonroot);
			newMediator.setId(synCtx.getCurrent().getContents().getId()+"-"+(synCtx.getCurrent().getChildren().size()-1));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		newMediator
		.setRootType(synCtx.getCurrent().getContents().getRootType());

	}

	public static  void setEndingTime(TreeNode node) {
		node.getContents().setEndTime(System.currentTimeMillis());

	}

	public static  void toTheList(TreeNode node) {
		System.out.println("To the list");
		MediatorData.setEndingTime(node);
		node.printChildren(node);
		node.printTree(node);
	}
	public static boolean test(MessageContext synCtx) {
		return !synCtx.isResponse();
	}

	/*public static TreeNode cloneTree(MessageContext newCtx, MessageContext synCtx){
//	newCtx.setCurrent(synCtx.getCurrent())	;
	TreeNode root= (TreeNode)synCtx.getProperty("Root");
	System.out.println("***********************"+synCtx.getProperty("Root"));
	//String id=UIDGenerator.generateURNString();
	
	newCtx.setProperty("CommonMessageID", UIDGenerator.generateURNString());
	
	System.out.println("*********************id"+newCtx.getProperty("CommonMessageID"));
	TreeNode newRoot=MediatorData.copyTreeData(root,(String)newCtx.getProperty("CommonMessageID"));
	newCtx.setRoot(newRoot);
	System.out.println("************************newRoot"+newRoot);
	newRoot.getContents().setMsgID((String)newCtx.getProperty("CommonMessageID"));
	
	newCtx.setProperty("Root", newRoot);
	
	//System.out.println("*************************Copying tree Data");
	//
	System.out.println("@@@@@@@@@@@Printing iinitial tree");
	newCtx.getRoot().printChildren(newCtx.getRoot());
	newCtx.getRoot().printTree(newCtx.getRoot());
	System.out.println("@@@@@@@@@@@End Printing iinitial tree");
	MediatorData.getLastCurrentMediator(newRoot,newCtx);
	System.out.println("#####################################*************************newCtx.id"+((TreeNode)newCtx.getProperty("Root")).getContents().getMsgID());
	return newCtx.getCurrent();
	}

	private static void getLastCurrentMediator(TreeNode node,MessageContext synCtx) {
		// TODO Auto-generated method stub
		System.out.println("*******************Node"+node.getContents().getMediatorName());
		TreeNode lastAddedNode;

		
		 if(node.getChildren()!=null && node.getChildren().size()>0){
				System.out.println("*************2nd if loop");
				 lastAddedNode=node.getLastChild(node);
					System.out.println("*******************Last AddedNode  "+lastAddedNode.getContents().getMediatorName());

			 getLastCurrentMediator(lastAddedNode,synCtx);
		 }
		else{
			lastAddedNode=node;
			synCtx.setCurrent(lastAddedNode);
			System.out.println("***************************************Last Current Node Reference"+lastAddedNode.getContents().getMediatorName());
			}
		
	}

	public static TreeNode copyTreeData(TreeNode node, String messageID) {
		// TODO Auto-generated method stub
		
		ArrayList<TreeNode> children = new ArrayList<TreeNode> ();
		int i = 0;
		node.getContents().setMsgID(messageID);
		System.out.println("*******************Node"+node.getContents().getMediatorName());
		if(node.getChildren()!=null){
			while (i < node.getChildren().size()) {
				 TreeNode newTreeNode = copyTreeData(node.getChildren().get(i),messageID);
				 System.out.println("****************************NewNode"+newTreeNode.getContents().getMediatorName());
				 System.out.println("****************************Setting msgid"+messageID);
				 newTreeNode.getContents().setMsgID(messageID);
			//	 children=new ArrayList<TreeNode> ();
				 children.add(newTreeNode);
				 i++;
			}
		}
		
		return new TreeNode(node.getParent(),node.getContents(),children);
		
		
	}*/

}
