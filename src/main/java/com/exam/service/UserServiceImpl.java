package com.exam.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.dao.UserDao;
import com.exam.model.User;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	@Autowired
	UserDao userDao;
	@Override
	public void storeUser(User user) {
		userDao.storeUser(user);
		
	}
	@Override
	public User save(User entity) {
		return userDao.save(entity);
	}
	@Override
	public User update(User entity) {
		return userDao.update(entity);
	}
	@Override
	public boolean delete(long id) {
		return userDao.delete(id);
	}
	@Override
	public User getById(long id) {
		return userDao.getById(id);
	}
	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}
}
