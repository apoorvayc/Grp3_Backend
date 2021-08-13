package com.rkit.jpaproject.controllers;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rkit.jpaproject.entities.Hashtag;
import com.rkit.jpaproject.service.HashtagService;

@RestController
public class HashtagController {
	@Autowired
	HashtagService service;
	
	@PostMapping("/createhashtag")
	public Hashtag createHashtag(@RequestBody Hashtag hashtag) {
		return service.createHashtag(hashtag);
	}

}
