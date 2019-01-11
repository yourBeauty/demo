package com.example.demo.web.dao.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: You
 * Date: 2018-08-14
 * Time: 18:29
 */
@Entity
@Table(name = "department_entity")
public class DepartmentEntity extends BaseEntity{

    private String name;

    private String post;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "departmentEntity")
    private List<UserAccountEntity> userAccountEntityList;

    public List<UserAccountEntity> getUserAccountEntityList() {
        return userAccountEntityList;
    }

    public void setUserAccountEntityList(List<UserAccountEntity> userAccountEntityList) {
        this.userAccountEntityList = userAccountEntityList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
}
