package com.exam.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.dao.EmploymentHistoryDao;
import com.exam.model.EmploymentHistory;
@Service
@Transactional
public class EmploymentHistoryServiceImpl implements EmploymentHistoryService{

	@Autowired
	EmploymentHistoryDao employmentHistoryDao;
	@Override
	public void storeEmploymentHistory(EmploymentHistory employmentHistory) {
		employmentHistoryDao.storeEmploymentHistory(employmentHistory);
		
	}
	@Override
	public EmploymentHistory save(EmploymentHistory entity) {
		return employmentHistoryDao.save(entity);
	}
	@Override
	public EmploymentHistory update(EmploymentHistory entity) {
		return employmentHistoryDao.update(entity);
	}
	@Override
	public boolean delete(long id) {
		return employmentHistoryDao.delete(id);
	}
	@Override
	public EmploymentHistory getById(long id) {
		return employmentHistoryDao.getById(id); 
	}
	@Override
	public List<EmploymentHistory> getAll() {
		return employmentHistoryDao.getAll();
	}
	
}
