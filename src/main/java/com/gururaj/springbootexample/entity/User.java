package com.gururaj.springbootexample.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document(collection="User")
public class User {

  @Id
  String id;
  String name;
  String address;
  boolean status = false;


}
