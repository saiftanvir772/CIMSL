package com.exam.service;

import java.util.List;

import com.exam.model.ProfessionalQualification;

public interface ProfessionalQualificationService {
	public void storeProfessionalQualification(ProfessionalQualification professionalQualification);
	public ProfessionalQualification save(ProfessionalQualification entity);
	public ProfessionalQualification update(ProfessionalQualification entity);
	public boolean delete(long id);
	public ProfessionalQualification getById(long id);
	public List<ProfessionalQualification> getAll();
}
