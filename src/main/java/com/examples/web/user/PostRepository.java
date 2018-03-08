package com.examples.web.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author Sandhya
 * Spring Data Respository JPA for the H2 Post table
 *
 */

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {

}
