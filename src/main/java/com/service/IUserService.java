package com.service;

import java.util.List;

import com.model.User;

public interface IUserService{
	public User addUser(User user);
	public List<User> UserList();
	public User DelUserByName(String UserName);
	public User UpdatePassword(String UserName,String password);
}
