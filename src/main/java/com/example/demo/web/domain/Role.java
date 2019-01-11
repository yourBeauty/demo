package com.example.demo.web.domain;

import com.example.demo.web.dao.entity.UserAccountEntity;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: You
 * Date: 2018-08-21
 * Time: 22:46
 */
public class Role extends BaseDomin{

    private String role;

    List<UserAccount> userAccount;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<UserAccount> getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(List<UserAccount> userAccount) {
        this.userAccount = userAccount;
    }
}
