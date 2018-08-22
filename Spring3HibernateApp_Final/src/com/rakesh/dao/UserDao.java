package com.rakesh.dao;



public interface UserDao {
	
	public boolean checkLogin(String userName, String userPassword) throws Exception;
}
