package com.tts.TechTalentTwitter.service;

import java.util.List;

import com.tts.TechTalentTwitter.model.Tweet;
import com.tts.TechTalentTwitter.model.TweetDisplay;
import com.tts.TechTalentTwitter.model.User;

public interface TweetServiceI {

    public List<TweetDisplay> findAllWithTag(String tag);
    public List<TweetDisplay> findAll();
    public List<TweetDisplay> findAllByUser(User user);
    public List<TweetDisplay> findAllByUsers(List<User> users);
    public void save(Tweet tweet);
}
