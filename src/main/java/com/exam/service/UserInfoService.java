package com.exam.service;

import com.exam.model.UserInfo;

public interface UserInfoService extends CommonService<UserInfo>{
	public UserInfo save(UserInfo userInfo);
}
