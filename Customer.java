package com.epsilon.Project;

public class Customer {
	
	
	int Customerid;
	String Customername;
	public int getCustomerid() {
		return Customerid;
	}
	public void setCustomerid(int customerid) {
		Customerid = customerid;
	}
	public String getCustomername() {
		return Customername;
	}
	public void setCustomername(String customername) {
		Customername = customername;
	}
	@Override
	public String toString() {
		return "Customer [Customerid=" + Customerid + ", Customername=" + Customername + "]";
	}
	
	
	

}
