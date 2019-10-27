package com.exam.dao;

import java.util.List;


import com.exam.model.PersonalDetails;

public interface PersonalDetailsDao {
	public void storePersonalDetails(PersonalDetails personalDetails);
	public PersonalDetails save(PersonalDetails entity);
	public PersonalDetails update(PersonalDetails entity);
	public boolean delete(long id);
	public PersonalDetails getById(long id);
	public List<PersonalDetails> getAll();
}
