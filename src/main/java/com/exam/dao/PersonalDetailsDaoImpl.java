package com.exam.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exam.model.PersonalDetails;
import com.exam.model.PersonalDetails;

@Repository
public class PersonalDetailsDaoImpl implements PersonalDetailsDao{

	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void storePersonalDetails(PersonalDetails personalDetails) {
		sessionFactory.getCurrentSession().save(personalDetails);
		
	}
	@Override
	public PersonalDetails save(PersonalDetails entity) {
		try {
			sessionFactory.getCurrentSession().save(entity);
			return (entity) ;
		} catch (HibernateException e) {
			return null;
		}
	}
	@Override
	public PersonalDetails update(PersonalDetails entity) {
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
			PersonalDetails entity = sessionFactory.getCurrentSession().get(PersonalDetails.class, id);
			sessionFactory.getCurrentSession().delete(entity);
			return true;
		} catch (HibernateException e) {
			return false;
		}
	}
	@Override
	public PersonalDetails getById(long id) {
		try {
			PersonalDetails entity = sessionFactory.getCurrentSession().get(PersonalDetails.class, id);
			return entity;
		} catch (HibernateException e) {
			return null;
		}
	}
	@Override
	public List<PersonalDetails> getAll() {
		try {
			List<PersonalDetails> entityList = (List<PersonalDetails>) sessionFactory.getCurrentSession().createQuery("FROM PersonalDetails").setFetchSize(50).list();
			return entityList;
		} catch (HibernateException e) {
			return null;
		}
	}
	
}
