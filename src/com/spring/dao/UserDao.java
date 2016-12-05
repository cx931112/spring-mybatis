package com.spring.dao;

import java.util.List;

import com.spring.entity.User;

public interface UserDao {
	//如果返回是集合，这边返回类型一定要写list
public List<User> select(User user);
}
