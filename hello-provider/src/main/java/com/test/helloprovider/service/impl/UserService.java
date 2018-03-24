package com.test.helloprovider.service.impl;


import com.test.hello.api.IUserService;

import java.util.Date;

public class UserService implements IUserService {
    @Override
    public String sayHi(String name) {
        return "Hi " + name + ", current date is: " + new Date();
    }
}
