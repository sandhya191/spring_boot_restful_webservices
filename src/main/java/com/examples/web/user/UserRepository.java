package com.examples.web.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * 
 * @author Sandhya
 * Spring Data Respository for the H2 User table
 *
 */

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	Optional<User> findById(int id);

	

	void deleteById(int id);




	

}
