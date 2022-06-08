package com.coches.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coches.model.coches;

public interface ICochesRepo extends JpaRepository<coches, Integer> {

}
