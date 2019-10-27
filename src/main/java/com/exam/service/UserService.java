package com.exam.service;

import com.exam.model.User;

public interface UserService extends CommonService<User>{
	public void storeUser(User user);
}
