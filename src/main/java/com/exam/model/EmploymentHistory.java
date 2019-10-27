package com.exam.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmploymentHistory {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String companyName;
	private String businessType;
	private String designation;
	private String department;
	private String expertise;
	private String responsibilities;
	private String location;
	private String startDate;
	private String endDate;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getBusinessType() {
		return businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getExpertise() {
		return expertise;
	}
	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}
	public String getResponsibilities() {
		return responsibilities;
	}
	public void setResponsibilities(String responsibilities) {
		this.responsibilities = responsibilities;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	@Override
	public String toString() {
		return "EmploymentHistory [id=" + id + ", companyName=" + companyName + ", businessType=" + businessType
				+ ", designation=" + designation + ", department=" + department + ", expertise=" + expertise
				+ ", responsibilities=" + responsibilities + ", location=" + location + ", startDate=" + startDate
				+ ", endDate=" + endDate + "]";
	}
	
	
}
