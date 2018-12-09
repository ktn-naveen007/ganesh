package com.jaiganesh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jaiganesh.entities.Hero;
import com.jaiganesh.repositories.HeroRepository;

@Service
public class HeroService {
	@Autowired
	HeroRepository repo;
	
	
	public List<Hero> getRecords(){
		return repo.getHerosName();
	}
}
