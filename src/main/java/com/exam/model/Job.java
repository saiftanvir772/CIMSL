package com.exam.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Job {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String jobTitle;
	private String jobType;
	private String organizationType;
	private String noOfVacancy;
	private String jobLocation;
	private String salary;
	private String jobDescription;
	private String requirements;
	private String benefits;
	private String facilities;
	private String others;
	private String jobResponsibilities;
	private String educationalRequirements;
	private String experienceRequirements;
	private String applicationDeadline;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getJobType() {
		return jobType;
	}
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}
	public String getOrganizationType() {
		return organizationType;
	}
	public void setOrganizationType(String organizationType) {
		this.organizationType = organizationType;
	}
	public String getNoOfVacancy() {
		return noOfVacancy;
	}
	public void setNoOfVacancy(String noOfVacancy) {
		this.noOfVacancy = noOfVacancy;
	}
	public String getJobLocation() {
		return jobLocation;
	}
	public void setJobLocation(String jobLocation) {
		this.jobLocation = jobLocation;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getJobDescription() {
		return jobDescription;
	}
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}
	public String getRequirements() {
		return requirements;
	}
	public void setRequirements(String requirements) {
		this.requirements = requirements;
	}
	public String getBenefits() {
		return benefits;
	}
	public void setBenefits(String benefits) {
		this.benefits = benefits;
	}
	public String getFacilities() {
		return facilities;
	}
	public void setFacilities(String facilities) {
		this.facilities = facilities;
	}
	public String getOthers() {
		return others;
	}
	public void setOthers(String others) {
		this.others = others;
	}
	public String getJobResponsibilities() {
		return jobResponsibilities;
	}
	public void setJobResponsibilities(String jobResponsibilities) {
		this.jobResponsibilities = jobResponsibilities;
	}
	public String getEducationalRequirements() {
		return educationalRequirements;
	}
	public void setEducationalRequirements(String educationalRequirements) {
		this.educationalRequirements = educationalRequirements;
	}
	public String getExperienceRequirements() {
		return experienceRequirements;
	}
	public void setExperienceRequirements(String experienceRequirements) {
		this.experienceRequirements = experienceRequirements;
	}
	public String getApplicationDeadline() {
		return applicationDeadline;
	}
	public void setApplicationDeadline(String applicationDeadline) {
		this.applicationDeadline = applicationDeadline;
	}
	@Override
	public String toString() {
		return "Job [id=" + id + ", jobTitle=" + jobTitle + ", jobType=" + jobType + ", organizationType="
				+ organizationType + ", noOfVacancy=" + noOfVacancy + ", jobLocation=" + jobLocation + ", salary="
				+ salary + ", jobDescription=" + jobDescription + ", requirements=" + requirements + ", benefits="
				+ benefits + ", facilities=" + facilities + ", others=" + others + ", jobResponsibilities="
				+ jobResponsibilities + ", educationalRequirements=" + educationalRequirements
				+ ", experienceRequirements=" + experienceRequirements + ", applicationDeadline=" + applicationDeadline
				+ "]";
	}
	
	
	
}
