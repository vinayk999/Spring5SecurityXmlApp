package com.app.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.app.dao.IUserDao;
import com.app.model.User;

public class UserDaoImpl implements IUserDao {

	@Autowired
	private HibernateTemplate ht;

	@Override
	public int saveUser(User u) {
		return (Integer)ht.save(u);
	}
	
}
