package com.example.demo.model;

//@Entity
//@Table(name = "studio_table")
public class Studio {

	//スタジオid
	private long studioId;
	//スタジオ名
	private String studioName;
	
	public long getStudioId() {
		return studioId;
	}
	public void setStudioId(long studioId) {
		this.studioId = studioId;
	}
	public String getStudioName() {
		return studioName;
	}
	public void setStudioName(String studioName) {
		this.studioName = studioName;
	}
	
	
}
