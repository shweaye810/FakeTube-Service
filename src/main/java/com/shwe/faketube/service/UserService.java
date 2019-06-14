package com.shwe.faketube.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(url="localhost:9000/users", name="userService")
public interface UserService {

}
