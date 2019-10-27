package com.exam.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exam.model.Job;

@Repository
public class JobDaoImpl implements JobDao{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void storeJob(Job job) {
		sessionFactory.getCurrentSession().save(job);
		
	}

	@Override
	public Job save(Job entity) {
		try {
			sessionFactory.getCurrentSession().save(entity);
			return (entity) ;
		} catch (HibernateException e) {
			return null;
		}
	}

	@Override
	public Job update(Job entity) {
		try {
			sessionFactory.getCurrentSession().update(entity);
			return (entity) ;
		} catch (HibernateException e) {
			return null;
		}
	}

	@Override
	public boolean delete(long id) {
		try {
			Job entity = sessionFactory.getCurrentSession().get(Job.class, id);
			sessionFactory.getCurrentSession().delete(entity);
			return true;
		} catch (HibernateException e) {
			return false;
		}
	}

	@Override
	public Job getById(long id) {
		try {
			Job entity = sessionFactory.getCurrentSession().get(Job.class, id);
			return entity;
		} catch (HibernateException e) {
			return null;
		}
	}

	@Override
	public List<Job> getAll() {
		try {
			List<Job> entityList = (List<Job>) sessionFactory.getCurrentSession().createQuery("FROM Job").setFetchSize(50).list();
			return entityList;
		} catch (HibernateException e) {
			return null;
		}
	}

}
