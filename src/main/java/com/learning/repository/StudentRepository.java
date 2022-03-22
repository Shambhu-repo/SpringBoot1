package com.learning.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface StudentRepository extends CrudRepository<StudentEntity,Integer> {
	
	
	@Query("Select t from StudentEntity t where t.email=:pEmail and t.password=:pPassword")
	public StudentEntity authenticate(@Param("pEmail") String email, @Param("pPassword") String password);
	
	
	/* This is the one way to write custom method  // * this method is used in service  
	 * controller works for authentication  */
	public Optional<StudentEntity> findByEmailAndPassword(String email,String password);
	
	
	// This is the other way to write custom method // Here only studentEntity column should be mathched
	public StudentEntity findByMobile(String mobile);
	
	
	

}
