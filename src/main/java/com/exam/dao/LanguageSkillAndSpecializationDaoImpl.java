package com.exam.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exam.model.AcademicQualifications;
import com.exam.model.LanguageSkillAndSpecialization;
@Repository
public class LanguageSkillAndSpecializationDaoImpl implements LanguageSkillAndSpecializationDao{

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void storeLanguageSkillAndSpecialization(LanguageSkillAndSpecialization languageSkillAndSpecialization) {
		sessionFactory.getCurrentSession().save(languageSkillAndSpecialization);
		
	}

	@Override
	public LanguageSkillAndSpecialization save(LanguageSkillAndSpecialization entity) {
		try {
			sessionFactory.getCurrentSession().save(entity);
			return (entity) ;
		} catch (HibernateException e) {
			return null;
		}
	}

	@Override
	public LanguageSkillAndSpecialization update(LanguageSkillAndSpecialization entity) {
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
			LanguageSkillAndSpecialization entity = sessionFactory.getCurrentSession().get(LanguageSkillAndSpecialization.class, id);
			sessionFactory.getCurrentSession().delete(entity);
			return true;
		} catch (HibernateException e) {
			return false;
		}
	}

	@Override
	public LanguageSkillAndSpecialization getById(long id) {
		try {
			LanguageSkillAndSpecialization entity = sessionFactory.getCurrentSession().get(LanguageSkillAndSpecialization.class, id);
			return entity;
		} catch (HibernateException e) {
			return null;
		}
	}

	@Override
	public List<LanguageSkillAndSpecialization> getAll() {
		try {
			List<LanguageSkillAndSpecialization> entityList = (List<LanguageSkillAndSpecialization>) sessionFactory.getCurrentSession().createQuery("FROM LanguageSkillAndSpecialization").setFetchSize(50).list();
			return entityList;
		} catch (HibernateException e) {
			return null;
		}
	}
	
	
	
}
