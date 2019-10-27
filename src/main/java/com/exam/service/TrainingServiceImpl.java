package com.exam.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.dao.TrainingDao;
import com.exam.model.Training;

@Service
@Transactional
public class TrainingServiceImpl implements TrainingService{

	@Autowired
	TrainingDao trainingDao;
	@Override
	public void storeTraining(Training training) {
		trainingDao.storeTraining(training);
		
	}
	@Override
	public Training save(Training entity) {
		return trainingDao.save(entity);
	}
	@Override
	public Training update(Training entity) {
		return trainingDao.update(entity);
	}
	@Override
	public boolean delete(long id) {
		return trainingDao.delete(id);
	}
	@Override
	public Training getById(long id) {
		return trainingDao.getById(id);
	}
	@Override
	public List<Training> getAll() {
		return trainingDao.getAll();
	}

}
