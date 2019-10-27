package com.exam.dao;

import com.exam.model.User;

public interface UserDao extends CommonDao<User>{
	public void storeUser(User user);
}
