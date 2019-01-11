package com.example.demo.web.json;

import com.example.demo.web.domain.Department;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: You
 * Date: 2018-08-27
 * Time: 23:21
 */
public class DepartmentsJson extends BaseJson {

    private List<Department> rows;

    public List<Department> getRows() {
        return rows;
    }

    public void setRows(List<Department> rows) {
        this.rows = rows;
    }
}
