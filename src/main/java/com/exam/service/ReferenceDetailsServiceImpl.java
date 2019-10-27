package com.exam.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.dao.ReferenceDetailsDao;
import com.exam.model.ReferenceDetails;

@Service
@Transactional
public class ReferenceDetailsServiceImpl implements ReferenceDetailsService{

	@Autowired
	ReferenceDetailsDao referenceDetailsDao;
	@Override
	public void storeReferenceDetails(ReferenceDetails referenceDetails) {
		referenceDetailsDao.storeReferenceDetails(referenceDetails);
		
	}
	@Override
	public ReferenceDetails save(ReferenceDetails entity) {
		return referenceDetailsDao.save(entity);
	}
	@Override
	public ReferenceDetails update(ReferenceDetails entity) {
		return referenceDetailsDao.update(entity);
	}
	@Override
	public boolean delete(long id) {
		return referenceDetailsDao.delete(id);
	}
	@Override
	public ReferenceDetails getById(long id) {
		return referenceDetailsDao.getById(id);
	}
	@Override
	public List<ReferenceDetails> getAll() {
		return referenceDetailsDao.getAll();
	}

}
