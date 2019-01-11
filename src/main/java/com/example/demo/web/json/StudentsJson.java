package com.example.demo.web.json;


import com.example.demo.web.domain.Student;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: You
 * Date: 2018-08-27
 * Time: 23:04
 */
public class StudentsJson extends BaseJson{

    private List<Student> rows;

    public List<Student> getRows() {
        return rows;
    }

    public void setRows(List<Student> rows) {
        this.rows = rows;
    }
}
