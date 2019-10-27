package com.exam.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.dao.PersonalDetailsDao;
import com.exam.model.PersonalDetails;
@Service
@Transactional
public class PersonalDetailsServiceImpl implements PersonalDetailsService{

	@Autowired
	PersonalDetailsDao personalDetailsDao;
	@Override
	public void storePersonalDetails(PersonalDetails personalDetails) {
		personalDetailsDao.storePersonalDetails(personalDetails);
		
	}
	@Override
	public PersonalDetails save(PersonalDetails entity) {
		return personalDetailsDao.save(entity);
	}
	@Override
	public PersonalDetails update(PersonalDetails entity) {
		return personalDetailsDao.update(entity);
	}
	@Override
	public boolean delete(long id) {
		return personalDetailsDao.delete(id);
	}
	@Override
	public PersonalDetails getById(long id) {
		return personalDetailsDao.getById(id);
	}
	@Override
	public List<PersonalDetails> getAll() {
		return personalDetailsDao.getAll();
	}

}
