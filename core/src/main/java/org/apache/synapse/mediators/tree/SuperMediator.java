package org.apache.synapse.mediators.tree;

import java.util.ArrayList;
import java.util.List;

import org.apache.axiom.soap.SOAPEnvelope;
import org.apache.synapse.Mediator;
import org.apache.synapse.MessageContext;

public class SuperMediator {
	
	private String type;
	private String msgID;
	private String mediatorName;
	private String id;
	private String envelop;
	private String serviceName;
	private String rootType;
	private long startTime, endTime;
	private boolean success=true;
	 public  void copy(SuperMediator other){
		this.setType(new String(other.getType()));
		this.setId(new String(other.getId()));
		this.setMediatorName(new String(other.getMediatorName()));
	    this.setId(new String(other.getId()));
		this.setEnvelop(new String(other.getEnvelop()));
		this.setServiceName(new String(other.getServiceName()));
		this.setRootType(new String(other.getRootType()));
		this.setStartTime(new Long(other.getStartTime()));
		this.setEndTime(new Long(other.getEndTime()));
		this.setSuccess(new Boolean(other.isSuccess()));
		
	 }
	 @Override
	 protected Object clone() throws CloneNotSupportedException {
	     return super.clone();
	 }
	public String getRootType() {
		return rootType;
	}

	public void setRootType(String rootType) {
		this.rootType = rootType;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getEnvelop() {
		return envelop;
	}

	public void setEnvelop(String envelop) {
		this.envelop = envelop;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	private List<Mediator> children=new ArrayList<Mediator>(); 
	public String getMediatorName() {
		return mediatorName;
	}

	public void setMediatorName(String mediatorName) {
		this.mediatorName = mediatorName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	 public long getStartTime() {
			return startTime;
	}
	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}
	public long getEndTime(){
		return endTime;
	}
	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}
	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}
	 public String getMsgID() {
			return msgID;
	}
	 public void setMsgID(String msgID) {
			this.msgID = msgID;
	}

	public String printData(){
		String a="Name        : "+mediatorName+"\n";
		String b="Type        : "+type+"\n";
		String c="MsgID       : "+msgID+"\n";
		String d="Success     : "+success+"\n";
		String e="Start Time  : "+startTime+"\n";
		String f="End Time    : "+endTime+"\n";
		String g="Proxy/API   : "+serviceName+"\n";
		String h="Mediator id : "+id+"\n";
		String i="envelop     : "+envelop+"\n";
		String j="Root Name   : "+rootType+"\n";
		return a+b+c+d+e+f+g+h+i+j;

	}
	
}
