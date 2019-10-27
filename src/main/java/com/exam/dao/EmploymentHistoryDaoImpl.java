package com.exam.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exam.model.AcademicQualifications;
import com.exam.model.EmploymentHistory;
@Repository
public class EmploymentHistoryDaoImpl implements EmploymentHistoryDao{

	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void storeEmploymentHistory(EmploymentHistory employmentHistory) {
		sessionFactory.getCurrentSession().save(employmentHistory);		
	}
	@Override
	public EmploymentHistory save(EmploymentHistory entity) {
		try {
			sessionFactory.getCurrentSession().save(entity);
			return (entity) ;
		} catch (HibernateException e) {
			return null;
		}
	}
	@Override
	public EmploymentHistory update(EmploymentHistory entity) {
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
			EmploymentHistory entity = sessionFactory.getCurrentSession().get(EmploymentHistory.class, id);
			sessionFactory.getCurrentSession().delete(entity);
			return true;
		} catch (HibernateException e) {
			return false;
		}
	}
	@Override
	public EmploymentHistory getById(long id) {
		try {
			EmploymentHistory entity = sessionFactory.getCurrentSession().get(EmploymentHistory.class, id);
			return entity;
		} catch (HibernateException e) {
			return null;
		}
	}
	@Override
	public List<EmploymentHistory> getAll() {
		try {
			List<EmploymentHistory> entityList = (List<EmploymentHistory>) sessionFactory.getCurrentSession().createQuery("FROM EmploymentHistory").setFetchSize(50).list();
			return entityList;
		} catch (HibernateException e) {
			return null;
		}
	}
	
}
