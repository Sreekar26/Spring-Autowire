package com.sreekar.autowire;

public class PanCard {
	
	private String panName;
	private String panNumber;
	public String getPanName() {
		return panName;
	}
	public void setPanName(String panName) {
		this.panName = panName;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	@Override
	public String toString() {
		return "PanCard [panName=" + panName + ", panNumber=" + panNumber + "]";
	}
	
	

}
