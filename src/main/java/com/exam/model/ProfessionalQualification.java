package com.exam.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class ProfessionalQualification {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String certificateTitle;
	private String institute;
	private String location;
	private String startDate;
	private String endDate;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCertificateTitle() {
		return certificateTitle;
	}
	public void setCertificateTitle(String certificateTitle) {
		this.certificateTitle = certificateTitle;
	}
	public String getInstitute() {
		return institute;
	}
	public void setInstitute(String institute) {
		this.institute = institute;
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
		return "ProfessionalQualification [id=" + id + ", certificateTitle=" + certificateTitle + ", institute="
				+ institute + ", location=" + location + ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}
	
	
}
