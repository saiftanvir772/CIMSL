package com.exam.dao;

import com.exam.model.UserInfo;

public interface UserInfoDao extends CommonDao<UserInfo> {
public UserInfo save(UserInfo userInfo);
	
	UserInfo loadUserByUsername(String username);
}
