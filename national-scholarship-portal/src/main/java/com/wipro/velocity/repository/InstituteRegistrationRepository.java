package com.wipro.velocity.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.wipro.velocity.model.InstituteRegistration;

@RepositoryRestResource(collectionResourceRel = "Instituteregisterdata", 
path = "Instituteregisterdata")
public interface InstituteRegistrationRepository extends MongoRepository<InstituteRegistration,Integer> {

}
