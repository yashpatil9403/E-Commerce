package com.data.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.data.Entity.User;

public interface UserRepository extends JpaRepository<User,Integer>{
	
	Optional<User> findByUserEmail(String useremail);

}
