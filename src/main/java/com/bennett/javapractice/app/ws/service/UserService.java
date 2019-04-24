package com.bennett.javapractice.app.ws.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.bennett.javapractice.app.ws.shared.dto.UserDto;

public interface UserService extends UserDetailsService{

	public UserDto createUser(UserDto userDto);
	public UserDto getUser(String email);
	public UserDto getUserByUserId(String id);
	public UserDto updateUser(String id, UserDto userDto);
	public void deleteUser(String Userid);
	public List<UserDto> getUsers(int page, int limit);
}
