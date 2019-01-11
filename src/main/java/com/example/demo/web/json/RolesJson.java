package com.example.demo.web.json;

import com.example.demo.web.domain.Role;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: You
 * Date: 2018-08-27
 * Time: 23:18
 */
public class RolesJson extends BaseJson {

    private List<Role> rows;

    public List<Role> getRows() {
        return rows;
    }

    public void setRows(List<Role> rows) {
        this.rows = rows;
    }
}
