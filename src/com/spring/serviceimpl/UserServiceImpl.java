package com.spring.serviceimpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.spring.dao.UserDao;
import com.spring.entity.User;
@Service
public class UserServiceImpl {
	@Resource
private UserDao userDao;
public User select(User user){
	User userGet=userDao.select(user);
	return userGet;
}
public void setUserDao(UserDao userDao) {
	this.userDao = userDao;
}
public UserDao getUserDao() {
	return userDao;
}

}
