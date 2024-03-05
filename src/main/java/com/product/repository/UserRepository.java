package com.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.entity.UserDtls;

@Repository
public interface UserRepository extends JpaRepository<UserDtls, Integer>{
	
	

}
