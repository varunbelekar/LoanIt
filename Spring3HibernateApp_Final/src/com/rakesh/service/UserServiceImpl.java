package com.rakesh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.rakesh.dao.UserDao;

@Service("userService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public boolean checkLogin(String userName, String userPassword) throws Exception {
		boolean check = false;
		try
		{
			check = userDao.checkLogin(userName, userPassword);
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return check;
	}

}
