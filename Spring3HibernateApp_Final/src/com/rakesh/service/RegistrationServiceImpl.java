package com.rakesh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.rakesh.dao.RegistrationDao;
import com.rakesh.model.Users;



@Service("registrationService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class RegistrationServiceImpl implements RegistrationService {

	@Autowired
	private RegistrationDao registrationDao;
	
	public void setRegistrationDao(RegistrationDao registrationDao) {
		this.registrationDao = registrationDao;
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addUsers(Users user) throws Exception {
		try
		{
			registrationDao.addUsers(user);
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}
