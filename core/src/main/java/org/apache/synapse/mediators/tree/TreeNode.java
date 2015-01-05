package org.apache.synapse.mediators.tree;

import java.util.ArrayList;
import java.util.Iterator;

import org.apache.synapse.SynapseLog;

public class TreeNode implements Cloneable {

	private TreeNode parent;
	SuperMediator contents;
	private ArrayList<TreeNode> children;

	private int depth = 0;

	/*
	 * @Override protected Object clone() throws CloneNotSupportedException {
	 * TreeNode cloned = (TreeNode)super.clone(); TreeNode parent=
	 * cloned.getParent(); System.out.println(parent); if(parent!=null ||
	 * !"".equals(parent)){ if(!"".equals(parent)) {
	 * cloned.setParent((TreeNode)cloned.getParent().clone());
	 * System.out.println("Setting parent"); } } if(cloned.getContents()!=null
	 * || !"".equals(cloned.getContents()))
	 * cloned.setContents((SuperMediator)cloned.getContents().clone());
	 * System.out.println("Setting content");
	 * 
	 * return cloned;
	 * 
	 * }
	 */
	/*
	 * public static TreeNode copy(TreeNode other) throws
	 * CloneNotSupportedException{ // TreeNode tre= new
	 * TreeNode(other.parent,other.contents,other.children);
	 * System.out.println(other
	 * .getContents().getMediatorName()+"is to be copied"); ArrayList<TreeNode>
	 * originalList = other.children;
	 * 
	 * // Create new List with same capacity as original (for efficiency).
	 * ArrayList<TreeNode> copy1 = new ArrayList<TreeNode>(originalList.size());
	 * if(originalList!=null ||!"".equals(originalList)) for (TreeNode foo:
	 * originalList) { System.out.println("Setting children list to be cloned");
	 * 
	 * copy1.add((TreeNode)foo.clone()); } TreeNode cloned=(TreeNode)new
	 * TreeNode(other.parent,other.contents,copy1).clone();
	 * 
	 * System.out.println(
	 * "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@Checking for references:"
	 * +(cloned.parent==other.parent));
	 * System.out.println(cloned.parent+""+other.parent);
	 * System.out.println(cloned.contents+""+other.contents);
	 * System.out.println(cloned.children+""+other.children);
	 * 
	 * 
	 * return cloned;
	 * 
	 * }
	 */
	public static TreeNode copyTree(TreeNode node, String messageID,
			TreeNode parent) {
		TreeNode copy;
		SuperMediator contents = new SuperMediator();
		ArrayList<TreeNode> children = new ArrayList<TreeNode>();
		contents.copy(node.contents);
		contents.setMsgID(messageID);
		copy = new TreeNode(parent, contents, children);

		int i = 0;
		if (node.getChildren() != null) {
			while (i < node.getChildren().size()) {
				parent = copy;
				copy.children.add(copyTree(node.getChildren().get(i),
						messageID, parent));
				i++;
			}
		}
		return copy;
	}

	public TreeNode(TreeNode parent, SuperMediator contents,
			ArrayList<TreeNode> children) {
		this.parent = parent;
		this.contents = contents;
		this.children = children;
	}

	public TreeNode(SuperMediator contents, ArrayList<TreeNode> children) {
		this.contents = contents;
		this.children = children;
	}

	public void addChildTreeNodeMediator(TreeNode childMediator) {

		this.children.add(childMediator);
		int childPosition = children.size() - 1;
		children.get(childPosition).parent = this;

	}

	public TreeNode getParent() {
		return parent;
	}

	public void setParent(TreeNode parent) {
		this.parent = parent;
	}

	public SuperMediator getContents() {
		return contents;
	}

	public void setContents(SuperMediator contents) {
		this.contents = contents;
	}

	public ArrayList<TreeNode> getChildren() {
		return children;
	}

	public void setChildren(ArrayList<TreeNode> children) {
		this.children = children;
	}

/*public TreeNode getLastFaultChild(TreeNode current) {
		if (!current.getChildren().isEmpty())
			return current.getChildren().get(current.getChildren().size() - 1);
		else

			return current;
	}*/
	public TreeNode getLastFaultChild() {
		if (!this.getChildren().isEmpty())
			return this.getChildren().get(this.getChildren().size() - 1);
		else

			return this;
	}
/*	public TreeNode getLastChild(TreeNode current) {
		if (current.getChildren() != null) {
			if (current.getChildren().size() > 0) {

				return current.getChildren().get(
						current.getChildren().size() - 1);

			} else
				return null;
		} else
			return null;
	}*/
	public TreeNode getLastChild() {
		if (this.getChildren() != null) {
			if (this.getChildren().size() > 0) {

				return this.getChildren().get(
						this.getChildren().size() - 1);

			} else
				return null;
		} else
			return null;
	}
	public void printChildren(TreeNode node) {

		int i = 0, l = 0;

		System.out.println(node.getContents().printData());

		while (i < node.getChildren().size()) {
			l = 0;

			if (node.getChildren().get(i).getContents().getType()
					.equals("single")) {
				System.out.println(node.getChildren().get(i).getContents()
						.printData());
			}

			else {
				depth++;
				printChildren(node.getChildren().get(i));
				depth--;
			}
			i++;
		}

	}

	public synchronized void printTree(TreeNode node) {
		int i = 0;

		System.out.print(node.getContents().getId() + "  :  ");
		System.out.println(node.getContents().getMediatorName());
		while (i < node.getChildren().size()) {

			if (node.getChildren().get(i).getContents().getType()
					.equals("single")) {

				System.out.print(node.getChildren().get(i).getContents()
						.getId()
						+ " : ");

				System.out.println(node.getChildren().get(i).getContents()
						.getMediatorName());

			}

			else {

				printTree(node.getChildren().get(i));

			}
			i++;
		}
	}
}
