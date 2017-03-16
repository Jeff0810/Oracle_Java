package com.oaec.dvd.model;

public class Record {
	private int Id,uId,dId;
	private String lendTime;
	private String returnTime;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public String getLendTime() {
		return lendTime;
	}
	public void setLendTime(String lendTime) {
		this.lendTime = lendTime;
	}
	public String getReturnTime() {
		return returnTime;
	}
	public void setReturnTime(String returnTime) {
		this.returnTime = returnTime;
	}
	

	public Record(int uId, int dId, String lendTime, String returnTime) {
		this.uId = uId;
		this.dId = dId;
		this.lendTime = lendTime;
		this.returnTime = returnTime;
	}
	
	public Record(int id, int uId, int dId, String lendTime, String returnTime) {
		Id = id;
		this.uId = uId;
		this.dId = dId;
		this.lendTime = lendTime;
		this.returnTime = returnTime;
	}

	@Override
	public boolean equals(Object obj) {
		boolean result=false;
		if(obj==null||this.getClass()!=obj.getClass()){
			return false;
		}
		Record o=(Record)obj;
		if(this.Id==o.Id){
			result=true;
		}
		return result;
		
	}
	@Override
	public String toString() {
		return "Record [Id=" + Id + ", uId=" + uId + ", dId=" + dId + ", lendTime=" + lendTime + ", returnTime="
				+ returnTime + "]";
	}
	
	
}
