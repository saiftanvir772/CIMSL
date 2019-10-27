package com.exam.dao;

import java.util.List;


import com.exam.model.LanguageSkillAndSpecialization;

public interface LanguageSkillAndSpecializationDao {
	public void storeLanguageSkillAndSpecialization(LanguageSkillAndSpecialization languageSkillAndSpecialization);
	public LanguageSkillAndSpecialization save(LanguageSkillAndSpecialization entity);
	public LanguageSkillAndSpecialization update(LanguageSkillAndSpecialization entity);
	public boolean delete(long id);
	public LanguageSkillAndSpecialization getById(long id);
	public List<LanguageSkillAndSpecialization> getAll();
}
