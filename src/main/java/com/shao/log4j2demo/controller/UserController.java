package com.shao.log4j2demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * ${DESCRIPTION}
 *
 * @author Shao Zhen Jun
 * @created 2018-06-13-10:56
 **/
@RestController
@RequestMapping("/user")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);


    @RequestMapping(value = "/all")
    @ResponseBody
    public String getAllUsers(){

        for (int i = 0; i < 100; i++) {
            logger.info("[GET] /user/all getAllUsers {}",i);
            logger.debug("This is log of level of debug {}",i);
            logger.trace("log4j2 Demo {}",i);
            logger.error("log4j2 error!!!!~ {}",i);
        }

        return "user list";
    }
}
