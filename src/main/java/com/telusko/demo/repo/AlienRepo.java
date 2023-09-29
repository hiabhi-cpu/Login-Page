package com.telusko.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.telusko.demo.model.Alien;

public interface AlienRepo extends CrudRepository<Alien, String>{

}
