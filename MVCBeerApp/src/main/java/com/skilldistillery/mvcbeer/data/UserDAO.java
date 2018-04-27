package com.skilldistillery.mvcbeer.data;

import java.util.List;

import com.skilldistillery.jpabeer.entities.User;


public interface UserDAO {
	
	public User retrieveById(int id); 
	
	public User create(User user);
	
	public List<User> retrieveAllUsers();
	
	public User updateUser(int id, User user);
	
	public boolean deleteUser(int id);
	

}