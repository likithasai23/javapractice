package com.epsilon.Project;

public class Publisher {
	
	
	int Publisherid;
	String Publishername;
	String Publisherlocation;
	public int getPublisherid() {
		return Publisherid;
	}
	public void setPublisherid(int publisherid) {
		Publisherid = publisherid;
	}
	public String getPublishername() {
		return Publishername;
	}
	public void setPublishername(String publishername) {
		Publishername = publishername;
	}
	public String getPublisherlocation() {
		return Publisherlocation;
	}
	public void setPublisherlocation(String publisherlocation) {
		Publisherlocation = publisherlocation;
	}
	@Override
	public String toString() {
		return "Publisher [Publisherid=" + Publisherid + ", Publishername=" + Publishername + ", Publisherlocation="
				+ Publisherlocation + "]";
	}
	
	

}
