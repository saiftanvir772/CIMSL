package com.exam.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exam.model.ProfessionalQualification;
import com.exam.model.ProfessionalQualification;
@Repository
public class ProfessionalQualificationDaoImpl implements ProfessionalQualificationDao{

	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void storeProfessionalQualification(ProfessionalQualification professionalQualification) {
		sessionFactory.getCurrentSession().save(professionalQualification);
		
	}
	@Override
	public ProfessionalQualification save(ProfessionalQualification entity) {
		try {
			sessionFactory.getCurrentSession().save(entity);
			return (entity) ;
		} catch (HibernateException e) {
			return null;
		}
	}
	@Override
	public ProfessionalQualification update(ProfessionalQualification entity) {
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
			ProfessionalQualification entity = sessionFactory.getCurrentSession().get(ProfessionalQualification.class, id);
			sessionFactory.getCurrentSession().delete(entity);
			return true;
		} catch (HibernateException e) {
			return false;
		}
	}
	@Override
	public ProfessionalQualification getById(long id) {
		try {
			ProfessionalQualification entity = sessionFactory.getCurrentSession().get(ProfessionalQualification.class, id);
			return entity;
		} catch (HibernateException e) {
			return null;
		}
	}
	@Override
	public List<ProfessionalQualification> getAll() {
		try {
			List<ProfessionalQualification> entityList = (List<ProfessionalQualification>) sessionFactory.getCurrentSession().createQuery("FROM ProfessionalQualification").setFetchSize(50).list();
			return entityList;
		} catch (HibernateException e) {
			return null;
		}
	}

}
