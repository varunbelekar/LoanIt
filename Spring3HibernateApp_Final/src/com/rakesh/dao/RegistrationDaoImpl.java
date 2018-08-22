package com.rakesh.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.rakesh.model.Users;

public class RegistrationDaoImpl implements RegistrationDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addUsers(Users user) throws Exception {
		sessionFactory.getCurrentSession().saveOrUpdate(user);
		
	}
}
