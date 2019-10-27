package com.exam.dao;

import java.util.List;

import com.exam.model.Training;

public interface TrainingDao {
	public void storeTraining(Training training);
	public Training save(Training entity);
	public Training update(Training entity);
	public boolean delete(long id);
	public Training getById(long id);
	public List<Training> getAll(); 
}
