package com.appsdeveloperblog.photoapp.api.users.service;

import com.appsdeveloperblog.photoapp.api.users.shared.UserDto;

public interface UsersService{
	UserDto createUser(UserDto userDetails);
	UserDto getUserDetailsByEmail(String email);
	UserDto getUserByUserId(String userId);
}
