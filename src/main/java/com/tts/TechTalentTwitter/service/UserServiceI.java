package com.tts.TechTalentTwitter.service;

import java.util.List;

import com.tts.TechTalentTwitter.model.User;

public interface UserServiceI {
	
	public User findByUsername(String username);
    public List<User> findAll();
    public void save(User user);
    public User saveNewUser(User user);
    public User getLoggedInUser();
}
