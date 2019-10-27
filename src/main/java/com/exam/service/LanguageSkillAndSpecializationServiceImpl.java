package com.exam.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.dao.LanguageSkillAndSpecializationDao;
import com.exam.model.LanguageSkillAndSpecialization;
@Service
@Transactional
public class LanguageSkillAndSpecializationServiceImpl implements LanguageSkillAndSpecializationService{

	@Autowired
	LanguageSkillAndSpecializationDao languageSkillAndSpecializationDao;
	@Override
	public void storeLanguageSkillAndSpecialization(LanguageSkillAndSpecialization languageSkillAndSpecialization) {
		languageSkillAndSpecializationDao.storeLanguageSkillAndSpecialization(languageSkillAndSpecialization);
		
	}
	@Override
	public LanguageSkillAndSpecialization save(LanguageSkillAndSpecialization entity) {
		return languageSkillAndSpecializationDao.save(entity);
	}
	@Override
	public LanguageSkillAndSpecialization update(LanguageSkillAndSpecialization entity) {
		return languageSkillAndSpecializationDao.update(entity);
	}
	@Override
	public boolean delete(long id) {
		return languageSkillAndSpecializationDao.delete(id);
	}
	@Override
	public LanguageSkillAndSpecialization getById(long id) {
		return languageSkillAndSpecializationDao.getById(id);
	}
	@Override
	public List<LanguageSkillAndSpecialization> getAll() {
		return languageSkillAndSpecializationDao.getAll();
	}

}
