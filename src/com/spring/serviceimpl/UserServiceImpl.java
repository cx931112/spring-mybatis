package com.spring.serviceimpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.spring.dao.UserDao;
import com.spring.entity.User;
@Service
public class UserServiceImpl {
	@Resource
private UserDao userDao;
public User select(User user){
	List<User> list=(List<User>)userDao.select(user);
	return list.get(0);
}
public void setUserDao(UserDao userDao) {
	this.userDao = userDao;
}
public UserDao getUserDao() {
	return userDao;
}

}
