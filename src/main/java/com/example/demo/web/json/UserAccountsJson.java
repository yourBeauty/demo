package com.example.demo.web.json;

import com.example.demo.web.domain.Department;
import com.example.demo.web.domain.Role;
import com.example.demo.web.domain.UserAccount;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: You
 * Date: 2018-08-27
 * Time: 22:30
 */
public class UserAccountsJson extends BaseJson{

   private List<UserAccount> rows;

    public List<UserAccount> getRows() {
        return rows;
    }

    public void setRows(List<UserAccount> rows) {
        this.rows = rows;
    }
}
