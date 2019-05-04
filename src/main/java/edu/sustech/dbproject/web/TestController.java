package edu.sustech.dbproject.web;


import edu.sustech.dbproject.dao.UserDao;
import edu.sustech.dbproject.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    UserDao userDao;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    private List<User> getMessage(){
        return userDao.findAll(1);
    }

}
