package com.app.service.impl;

import org.springframework.stereotype.Service;

import com.app.dao.IUserDao;
import com.app.model.User;
import com.app.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{

	private IUserDao dao;
	@Override
	public int saveUser(User u) {
		return dao.saveUser(u);
	}

	
}
