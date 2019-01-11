package com.example.demo.web.controller;

import com.example.demo.web.domain.Role;
import com.example.demo.web.domain.UserAccount;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: You
 * Date: 2018-08-25
 * Time: 22:40
 */
@Controller
public class LoginController {


    @PostMapping("/loginRoles/roles")
    @ResponseBody
    public Role getRoles(@RequestBody UserAccount userAccount){

        if (userAccount.getId()!=null){
            Role role = new Role();
            role.setRole("admin,superAdmin");
            return role;
        }
        return null;
    }
}
