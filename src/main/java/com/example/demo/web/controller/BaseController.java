package com.example.demo.web.controller;

import com.example.demo.web.dao.entity.RoleEntity;
import com.example.demo.web.dao.entity.UserAccountEntity;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: You
 * Date: 2018-07-19
 * Time: 16:58
 */
@Controller
public class BaseController {

    @RequestMapping("/")
    public UserAccountEntity basePage(ModelMap modelMap){
        UserAccountEntity userAccountEntity = new UserAccountEntity();
        userAccountEntity.setId(123l);
        userAccountEntity.setUsername("校长");
        return userAccountEntity;
    }


    @PostMapping("/login")
    @ResponseBody
    public UserAccountEntity getMethod(@RequestBody UserAccountEntity data) {

        List<UserAccountEntity> accountEntityArrayList = new ArrayList<>();

        UserAccountEntity userAccountEntity = new UserAccountEntity();
        userAccountEntity.setId(123l);
        userAccountEntity.setUsername("校长");
        return userAccountEntity;
    }

}
