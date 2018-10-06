package com.gururaj.springbootexample;

import com.gururaj.springbootexample.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRespository extends MongoRepository<User, String> {

}
