package com.exam.service;

import java.util.List;

import com.exam.model.Training;

public interface TrainingService {
	public void storeTraining(Training training);
	public Training save(Training entity);
	public Training update(Training entity);
	public boolean delete(long id);
	public Training getById(long id);
	public List<Training> getAll(); 
}
