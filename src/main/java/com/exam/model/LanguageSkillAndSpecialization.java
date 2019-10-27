package com.exam.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LanguageSkillAndSpecialization {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String languageName;
	private String reading;
	private String writing;
	private String speaking;
	private String specializationName;
	private String proficiency;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLanguageName() {
		return languageName;
	}
	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}
	public String getReading() {
		return reading;
	}
	public void setReading(String reading) {
		this.reading = reading;
	}
	public String getWriting() {
		return writing;
	}
	public void setWriting(String writing) {
		this.writing = writing;
	}
	public String getSpeaking() {
		return speaking;
	}
	public void setSpeaking(String speaking) {
		this.speaking = speaking;
	}
	public String getSpecializationName() {
		return specializationName;
	}
	public void setSpecializationName(String specializationName) {
		this.specializationName = specializationName;
	}
	public String getProficiency() {
		return proficiency;
	}
	public void setProficiency(String proficiency) {
		this.proficiency = proficiency;
	}
	@Override
	public String toString() {
		return "LanguageSkillAndSpecialization [id=" + id + ", languageName=" + languageName + ", reading=" + reading
				+ ", writing=" + writing + ", speaking=" + speaking + ", specializationName=" + specializationName
				+ ", proficiency=" + proficiency + "]";
	}
	
	
}
