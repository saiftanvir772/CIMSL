package com.exam.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AcademicQualifications {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String educationLevel;
	private String examTitle;
	private String concentration;
	private String institute;
	private String resultType;
	private String result;
	private String scale;
	private String yearOfPassing;
	private String duration;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEducationLevel() {
		return educationLevel;
	}
	public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}
	public String getExamTitle() {
		return examTitle;
	}
	public void setExamTitle(String examTitle) {
		this.examTitle = examTitle;
	}
	public String getConcentration() {
		return concentration;
	}
	public void setConcentration(String concentration) {
		this.concentration = concentration;
	}
	public String getInstitute() {
		return institute;
	}
	public void setInstitute(String institute) {
		this.institute = institute;
	}
	public String getResultType() {
		return resultType;
	}
	public void setResultType(String resultType) {
		this.resultType = resultType;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getScale() {
		return scale;
	}
	public void setScale(String scale) {
		this.scale = scale;
	}
	public String getYearOfPassing() {
		return yearOfPassing;
	}
	public void setYearOfPassing(String yearOfPassing) {
		this.yearOfPassing = yearOfPassing;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "AcademicQualifications [id=" + id + ", educationLevel=" + educationLevel + ", examTitle=" + examTitle
				+ ", concentration=" + concentration + ", institute=" + institute + ", resultType=" + resultType
				+ ", result=" + result + ", scale=" + scale + ", yearOfPassing=" + yearOfPassing + ", duration="
				+ duration + "]";
	}
	
	
}
