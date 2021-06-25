package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.registrationapplication;

public interface UserRepo extends CrudRepository<registrationapplication, Long>
{

}
