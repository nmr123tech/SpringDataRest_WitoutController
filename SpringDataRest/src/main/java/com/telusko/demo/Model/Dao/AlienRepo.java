package com.telusko.demo.Model.Dao;

import org.springframework.boot.autoconfigure.data.ConditionalOnRepositoryType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.telusko.demo.Model.Alien;


@RepositoryRestResource(collectionResourceRel = "aliens",path="aliens")
public interface AlienRepo extends JpaRepository<Alien, Integer>
{

	
}
