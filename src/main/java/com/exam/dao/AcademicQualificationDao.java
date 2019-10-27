package com.exam.dao;

import java.util.List;

import com.exam.model.AcademicQualifications;



public interface AcademicQualificationDao  extends CommonDao<AcademicQualifications>{
	public void storeAcademicQualifications(AcademicQualifications academicQualifications);
	public AcademicQualifications save(AcademicQualifications entity);
	public AcademicQualifications update(AcademicQualifications entity);
	public boolean delete(long id);
	public AcademicQualifications getById(long id);
	public List<AcademicQualifications> getAll();
}
