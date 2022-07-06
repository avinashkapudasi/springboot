package com.wipro.velocity.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.wipro.velocity.model.Studentregistration;

@RepositoryRestResource(collectionResourceRel = "studentregisterdata", 
path = "studentregisterdata")
public interface StudentregisterRepository extends MongoRepository<Studentregistration,Integer> {

}
