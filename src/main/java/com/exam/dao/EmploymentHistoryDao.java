package com.exam.dao;

import java.util.List;


import com.exam.model.EmploymentHistory;

public interface EmploymentHistoryDao {
	public void storeEmploymentHistory(EmploymentHistory employmentHistory);
	public EmploymentHistory save(EmploymentHistory entity);
	public EmploymentHistory update(EmploymentHistory entity);
	public boolean delete(long id);
	public EmploymentHistory getById(long id);
	public List<EmploymentHistory> getAll();
}
