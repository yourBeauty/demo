package com.example.demo.web.dao.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: You
 * Date: 2018-08-20
 * Time: 0:09
 */
@Entity
@Table(name = "grade_entity")
public class GradeEntity extends BaseEntity {

    private String name;

    private String property;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "gradeEntity")
    private List<ClazzEntity> clazzEntityList;

    public List<ClazzEntity> getClazzEntityList() {
        return clazzEntityList;
    }

    public void setClazzEntityList(List<ClazzEntity> clazzEntityList) {
        this.clazzEntityList = clazzEntityList;
    }

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
}
