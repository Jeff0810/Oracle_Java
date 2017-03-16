package com.oaec.dvd.model;

public class DVD {
	private int Id,status,dCount;
	private String dName;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	public int getdCount() {
		return dCount;
	}
	public void setdCount(int dCount) {
		this.dCount = dCount;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	
	public DVD() {
		
	}
	public DVD(int status, int dCount, String dName) {
		this.status = status;
		this.dCount = dCount;
		this.dName = dName;
	}
	public DVD(int id, int status, int dCount, String dName) {
		Id = id;
		this.status = status;
		this.dCount = dCount;
		this.dName = dName;
	}

	@Override
	public boolean equals(Object obj) {
		boolean result=false;
		if(obj==null||this.getClass()!=obj.getClass()){
			return false;
		}
		DVD o=(DVD)obj;
		if(this.Id==o.Id){
			result=true;
		}
		return result;
		
	}
	
	
	
}
