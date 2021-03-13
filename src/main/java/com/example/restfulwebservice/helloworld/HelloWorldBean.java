package com.example.restfulwebservice.helloworld;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data //setter getter constructor toString..
@AllArgsConstructor //field constructor
@NoArgsConstructor //default constructor
public class HelloWorldBean {
    private String message;


}
