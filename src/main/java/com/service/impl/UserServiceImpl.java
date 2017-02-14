package com.service.impl;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.dao.IUserDao;
import com.model.User;
import com.service.IUserService;

@Transactional(readOnly=false)
@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	IUserDao userDao;

	//private  Logger logger =Logger.getLogger(getClass());
	
	@Override
	public User addUser(User user) {
		userDao.Save(user);
		return user;
	}

	@Override
	public List<User> UserList() {
		return userDao.find("from User u");
	}

	@Override
	public User DelUserByName(String UserName) {
		User user = userDao.find("from User u where u.name ='"+UserName+"'").get(0);
		userDao.Delete(user);
		return user;
	}

	@Override
	public User UpdatePassword(String UserName,String password) {
		User user = userDao.find("from User u where u.name ='"+UserName+"'").get(0);
		user.setPassword(password);
		userDao.Save(user);
		return user;
	}
	
}
