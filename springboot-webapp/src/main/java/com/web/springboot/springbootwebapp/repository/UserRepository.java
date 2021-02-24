package com.web.springboot.springbootwebapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.web.springboot.springbootwebapp.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
