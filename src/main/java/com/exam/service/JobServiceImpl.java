package com.exam.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.dao.JobDao;
import com.exam.model.Job;
@Service
@Transactional
public class JobServiceImpl implements JobService{

	@Autowired
	JobDao jobDao;
	
	@Override
	public void storeJob(Job job) {
		jobDao.storeJob(job);
		
	}

	@Override
	public Job save(Job entity) {
		return jobDao.save(entity);
	}

	@Override
	public Job update(Job entity) {
		return jobDao.update(entity);
	}

	@Override
	public boolean delete(long id) {
		return jobDao.delete(id);
	}

	@Override
	public Job getById(long id) {
		return jobDao.getById(id);
	}

	@Override
	public List<Job> getAll() {
		return jobDao.getAll();
	}

}
