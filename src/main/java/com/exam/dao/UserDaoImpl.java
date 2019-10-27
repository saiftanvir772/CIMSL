package com.exam.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exam.model.User;


@Repository
public class UserDaoImpl implements UserDao{
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void storeUser(User user) {
		sessionFactory.getCurrentSession().save(user);
		
	}

	@Override
	public User save(User entity) {
		try {
			sessionFactory.getCurrentSession().save(entity);
			return (entity) ;
		} catch (HibernateException e) {
			return null;
		}
	}

	@Override
	public User update(User entity) {
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
			User entity = sessionFactory.getCurrentSession().get(User.class, id);
			sessionFactory.getCurrentSession().delete(entity);
			return true;
		} catch (HibernateException e) {
			return false;
		}
	}

	@Override
	public User getById(long id) {
		try {
			User entity = sessionFactory.getCurrentSession().get(User.class, id);
			return entity;
		} catch (HibernateException e) {
			return null;
		}
	}

	@Override
	public List<User> getAll() {
		try {
			List<User> entityList = (List<User>) sessionFactory.getCurrentSession().createQuery("FROM User").setFetchSize(50).list();
			return entityList;
		} catch (HibernateException e) {
			return null;
		}
	}
}
