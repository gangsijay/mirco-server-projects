package com.lg.provider.mapper;

import java.util.List;

import com.lg.api.entity.User;

public interface UserMapper {
	
	List<User> getAll();
	
	User getOne(Long id);

	void insert(User user);

	void update(User user);

	void delete(Long id);

}