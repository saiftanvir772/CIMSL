package com.exam.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exam.model.Training;




@Repository
public class TrainingDaoImpl implements TrainingDao{
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void storeTraining(Training training) {
		sessionFactory.getCurrentSession().save(training);
		
	}

	@Override
	public Training save(Training entity) {
		try {
			sessionFactory.getCurrentSession().save(entity);
			return (entity) ;
		} catch (HibernateException e) {
			return null;
		}
	}

	@Override
	public Training update(Training entity) {
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
			Training entity = sessionFactory.getCurrentSession().get(Training.class, id);
			sessionFactory.getCurrentSession().delete(entity);
			return true;
		} catch (HibernateException e) {
			return false;
		}
	}

	@Override
	public Training getById(long id) {
		try {
			Training entity = sessionFactory.getCurrentSession().get(Training.class, id);
			return entity;
		} catch (HibernateException e) {
			return null;
		}
	}

	@Override
	public List<Training> getAll() {
		try {
			List<Training> entityList = (List<Training>) sessionFactory.getCurrentSession().createQuery("FROM Training").setFetchSize(50).list();
			return entityList;
		} catch (HibernateException e) {
			return null;
		}
	}
	
}
