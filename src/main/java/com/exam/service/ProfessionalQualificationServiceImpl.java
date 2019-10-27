package com.exam.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.dao.ProfessionalQualificationDao;
import com.exam.model.ProfessionalQualification;
@Service
@Transactional
public class ProfessionalQualificationServiceImpl implements ProfessionalQualificationService{

	@Autowired
	ProfessionalQualificationDao professionalQualificationDao;
	@Override
	public void storeProfessionalQualification(ProfessionalQualification professionalQualification) {
		professionalQualificationDao.storeProfessionalQualification(professionalQualification);
		
	}
	@Override
	public ProfessionalQualification save(ProfessionalQualification entity) {
		return professionalQualificationDao.save(entity);
	}
	@Override
	public ProfessionalQualification update(ProfessionalQualification entity) {
		return professionalQualificationDao.update(entity);
	}
	@Override
	public boolean delete(long id) {
		return professionalQualificationDao.delete(id);
	}
	@Override
	public ProfessionalQualification getById(long id) {
		return professionalQualificationDao.getById(id);
	}
	@Override
	public List<ProfessionalQualification> getAll() {
		return professionalQualificationDao.getAll();
	}

}
