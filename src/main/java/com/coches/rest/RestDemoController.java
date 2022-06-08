package com.coches.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.coches.model.coches;
import com.coches.repo.ICochesRepo;


@RestController
@RequestMapping("/coches")
public class RestDemoController {

	@Autowired
	private ICochesRepo repo;
	
	@GetMapping
	public List<coches> listar(){
		return repo.findAll();
	}
	
	@PostMapping
	public void insertar(@RequestBody coches co){
		repo.save(co);
	}
}
