package com.cg.task2;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, Integer> {
	 
	Optional<Student> findById(String id);
 
	void deleteById(String id);
 
}