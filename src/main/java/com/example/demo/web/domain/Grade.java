package com.example.demo.web.domain;

import com.example.demo.web.dao.entity.ClazzEntity;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: You
 * Date: 2018-08-21
 * Time: 22:46
 */
public class Grade extends BaseDomin {

    private String name;

    private String property;

    private List<Clazz> clazzList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public List<Clazz> getClazzList() {
        return clazzList;
    }

    public void setClazzList(List<Clazz> clazzList) {
        this.clazzList = clazzList;
    }
}
