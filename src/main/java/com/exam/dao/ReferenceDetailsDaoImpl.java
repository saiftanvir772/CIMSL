package com.exam.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exam.model.ReferenceDetails;
import com.exam.model.ReferenceDetails;

@Repository
public class ReferenceDetailsDaoImpl implements ReferenceDetailsDao{

	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void storeReferenceDetails(ReferenceDetails referenceDetails) {
		sessionFactory.getCurrentSession().save(referenceDetails);	
		
	}
	@Override
	public ReferenceDetails save(ReferenceDetails entity) {
		try {
			sessionFactory.getCurrentSession().save(entity);
			return (entity) ;
		} catch (HibernateException e) {
			return null;
		}
	}
	@Override
	public ReferenceDetails update(ReferenceDetails entity) {
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
			ReferenceDetails entity = sessionFactory.getCurrentSession().get(ReferenceDetails.class, id);
			sessionFactory.getCurrentSession().delete(entity);
			return true;
		} catch (HibernateException e) {
			return false;
		}
	}
	@Override
	public ReferenceDetails getById(long id) {
		try {
			ReferenceDetails entity = sessionFactory.getCurrentSession().get(ReferenceDetails.class, id);
			return entity;
		} catch (HibernateException e) {
			return null;
		}
	}
	@Override
	public List<ReferenceDetails> getAll() {
		try {
			List<ReferenceDetails> entityList = (List<ReferenceDetails>) sessionFactory.getCurrentSession().createQuery("FROM ReferenceDetails").setFetchSize(50).list();
			return entityList;
		} catch (HibernateException e) {
			return null;
		}
	}

}
