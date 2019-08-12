package com.sreekar.autowire;

public class Employee {

	private int empId;
	private String empName;
	private String empDesignation;
	private PanCard panCard;
	
	

	public Employee(int empId, String empName, String empDesignation, PanCard panCard) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDesignation = empDesignation;
		this.panCard = panCard;
	}

	public PanCard getPanCard() {
		return panCard;
	}

	public void setPanCard(PanCard panCard) {
		this.panCard = panCard;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDesignation=" + empDesignation + ", panCard="
				+ panCard + "]";
	}

}
