package com.dto.in;


public class DTOclass {
	
	public String UserName="mrt Prasad";
	public String CrushName;
	public String s1="Relangi"
	public void name() {
		
	}
	
	public DTOclass(String UserName, String CrushName) {
		 super();
		 this.UserName=UserName;
		 this.CrushName=CrushName;
		
		System.out.println("user ingo Hre");
	}
	
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getCrushName() {
		return CrushName;
	}
	public void setCrushName(String crushName) {
		CrushName = crushName;
	}
	@Override
	public String toString() {
		return "DTOclass [UserName=" + UserName + ", CrushName=" + CrushName + "]";
	}
	
}
