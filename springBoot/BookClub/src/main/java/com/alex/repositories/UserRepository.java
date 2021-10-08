package com.alex.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alex.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    
// get all users
    Optional<User> findByEmail(String email);
// get by id
    User getById(Long id);	
// delete user
    void deleteById(Long id);
}