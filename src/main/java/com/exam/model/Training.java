package com.exam.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Training {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String trainingTitle;
	private String topic;
	private String institute;
	private String location;
	private String country;
	private String year;
	private String duration;
	private String certificate;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTrainingTitle() {
		return trainingTitle;
	}
	public void setTrainingTitle(String trainingTitle) {
		this.trainingTitle = trainingTitle;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getCertificate() {
		return certificate;
	}
	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}
	@Override
	public String toString() {
		return "Training [id=" + id + ", trainingTitle=" + trainingTitle + ", topic=" + topic + ", institute="
				+ institute + ", location=" + location + ", country=" + country + ", year=" + year + ", duration="
				+ duration + ", certificate=" + certificate + "]";
	}
	
	
}
