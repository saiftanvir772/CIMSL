package com.exam.dao;

import java.util.List;

import com.exam.model.Job;

public interface JobDao {
	public void storeJob(Job job);
	public Job save(Job entity);
	public Job update(Job entity);
	public boolean delete(long id);
	public Job getById(long id);
	public List<Job> getAll();
}
