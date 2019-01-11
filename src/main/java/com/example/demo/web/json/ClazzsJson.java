package com.example.demo.web.json;

import com.example.demo.web.domain.Clazz;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: You
 * Date: 2018-08-27
 * Time: 23:23
 */
public class ClazzsJson extends BaseJson {

    private List<Clazz> rows;

    public List<Clazz> getRows() {
        return rows;
    }

    public void setRows(List<Clazz> rows) {
        this.rows = rows;
    }
}
