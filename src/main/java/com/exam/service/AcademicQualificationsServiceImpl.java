package com.exam.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.dao.AcademicQualificationDao;
import com.exam.model.AcademicQualifications;
@Service
@Transactional
public class AcademicQualificationsServiceImpl implements AcademicQualificationsService{

	@Autowired
	AcademicQualificationDao academicQualificationDao;
	@Override
	public void storeAcademicQualifications(AcademicQualifications academicQualifications) {
		academicQualificationDao.storeAcademicQualifications(academicQualifications);
		
	}
	@Override
	public AcademicQualifications save(AcademicQualifications entity) {
		return academicQualificationDao.save(entity);
		}
	@Override
	public AcademicQualifications update(AcademicQualifications entity) {
		return academicQualificationDao.update(entity);
	}
	@Override
	public boolean delete(long id) {
		return academicQualificationDao.delete(id);
	}
	@Override
	public AcademicQualifications getById(long id) {
		return academicQualificationDao.getById(id);
	}
	@Override
	public List<AcademicQualifications> getAll() {
		return academicQualificationDao.getAll();
	}

}
