package com.example.demo.web.controller;

import com.example.demo.web.domain.Role;
import com.example.demo.web.domain.UserAccount;
import com.example.demo.web.form.UserAccountForm;
import com.example.demo.web.security.CustomUserDetailsService;
import com.example.demo.web.service.UserAccountService;
import com.example.demo.web.utils.CopyUtil;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: You
 * Date: 2018-08-27
 * Time: 21:49
 */
@Controller
public class UserController {
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(CustomUserDetailsService.class);

    @Autowired
    UserAccountService userAccountService;

    @PostMapping(name = "/userMessage/addUserMessage")
    @ResponseBody
    public UserAccount addUserMessage(@RequestBody UserAccountForm userAccountForm){

        if (userAccountForm != null){
            UserAccount userAccount = new UserAccount();
            try {
                CopyUtil.getBeanUtilsBean().copyProperties(userAccount,userAccountForm);
                userAccountService.addUserAccount(userAccount);
                userAccount.setRoleList( addRoles(userAccountForm));
            } catch (Exception e) {
                if (logger.isErrorEnabled()) {
                    logger.error("Exception", e);
                }
            }
        }

        System.out.println(userAccountForm.toString());

        String roles[] = userAccountForm.getRoles();

        String role = roles[0];
        return null;
    }


    public List<Role> addRoles(UserAccountForm userAccountForm){

        String roles[] = userAccountForm.getRoles();

        Role role = new Role();

        List<Role> roleList = new ArrayList<>();

        for (String item: roles) {
            role.setRole(item);
            roleList.add(role);
        }
        return roleList;
    }
}
