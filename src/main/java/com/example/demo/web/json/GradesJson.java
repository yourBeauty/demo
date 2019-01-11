package com.example.demo.web.json;

import com.example.demo.web.domain.Grade;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: You
 * Date: 2018-08-27
 * Time: 23:19
 */
public class GradesJson extends BaseJson {

    private List<Grade> rows;

    public List<Grade> getRows() {
        return rows;
    }

    public void setRows(List<Grade> rows) {
        this.rows = rows;
    }
}
