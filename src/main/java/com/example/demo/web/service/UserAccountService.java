package com.example.demo.web.service;

import com.example.demo.web.domain.UserAccount;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: You
 * Date: 2018-08-21
 * Time: 22:32
 */
public interface UserAccountService {

    UserAccount addUserAccount(UserAccount userAccount);

    String deleteUserAccountById(Long id);

    String deleteUserAccountByName(String name);

    UserAccount updateUserAccount(UserAccount userAccount);

    UserAccount findUserAccountById(Long id);

    List<UserAccount> findUserAccountByParams(int pageNum,int maxNum,String name,String department,String role,Date comeDate);

    UserAccount findUserAccountByName(String name);

    List<UserAccount> findAll();

}
