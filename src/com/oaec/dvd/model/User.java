package com.oaec.dvd.model;

public class User {
	private int Id,type;
	private String uName,uPass;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuPass() {
		return uPass;
	}
	public void setuPass(String uPass) {
		this.uPass = uPass;
	}
	
	public User(int type, String uName, String uPass) {
		super();
		this.type = type;
		this.uName = uName;
		this.uPass = uPass;
	}
	public User(int id, int type, String uName, String uPass) {
		Id = id;
		this.type = type;
		this.uName = uName;
		this.uPass = uPass;
	}

	@Override
	public boolean equals(Object obj) {
		boolean result=false;
		if(obj==null||this.getClass()!=obj.getClass()){
			return false;
		}
		User o=(User)obj;
		if(this.Id==o.Id){
			result=true;
		}
		return result;
		
	}
	
	

}
