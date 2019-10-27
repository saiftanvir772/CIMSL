package com.exam.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exam.model.AcademicQualifications;

@Repository
public class AcademicQualificationDaoImpl implements AcademicQualificationDao{
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void storeAcademicQualifications(AcademicQualifications academicQualifications) {
		sessionFactory.getCurrentSession().save(academicQualifications);
		
	}
	@Override
	public AcademicQualifications save(AcademicQualifications entity) {
		try {
			sessionFactory.getCurrentSession().save(entity);
			return (entity) ;
		} catch (HibernateException e) {
			return null;
		}
	}
	@Override
	public AcademicQualifications update(AcademicQualifications entity) {
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
			AcademicQualifications entity = sessionFactory.getCurrentSession().get(AcademicQualifications.class, id);
			sessionFactory.getCurrentSession().delete(entity);
			return true;
		} catch (HibernateException e) {
			return false;
		}
	}
	@Override
	public AcademicQualifications getById(long id) {
		try {
			AcademicQualifications entity = sessionFactory.getCurrentSession().get(AcademicQualifications.class, id);
			return entity;
		} catch (HibernateException e) {
			return null;
		}
	}
	@Override
	public List<AcademicQualifications> getAll() {
		try {
			List<AcademicQualifications> entityList = (List<AcademicQualifications>) sessionFactory.getCurrentSession().createQuery("FROM AcademicQualifications").setFetchSize(50).list();
			return entityList;
		} catch (HibernateException e) {
			return null;
		}
	}
}
