package com.codewithsudharsun.fullstackbackend.repository;


import com.codewithsudharsun.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Long>{
}
