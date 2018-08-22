package com.spring.service;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class AuthService {

	private HibernateTemplate hibernateTemplate;
	
	private AuthService() {}
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	public boolean findUser(String uname, String upwd) {
		boolean isValidUser = false;
		String sqlQuery = "from User u where u.name=? and u.password=?" ;
		try {
			List userObj = (List) hibernateTemplate.find(sqlQuery, uname,upwd);
			if(userObj!=null && userObj.size()>0) {
				isValidUser = true;
			}
		}catch(Exception ex) {
			isValidUser = false;
			ex.printStackTrace();
		}
		return isValidUser;
	}
}
