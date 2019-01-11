package com.example.demo.web.dao.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: You
 * Date: 2018-07-20
 * Time: 15:54
 */
@Entity
@Table(name = "role_entity")
public class RoleEntity extends BaseEntity{

    private String role;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "u_r_entity",joinColumns = {
            @JoinColumn(name = "roleId",referencedColumnName = "Id")},
            inverseJoinColumns = {@JoinColumn(name = "userId")})
    List<UserAccountEntity> userAccountEntityList;

    public List<UserAccountEntity> getUserAccountEntityList() {
        return userAccountEntityList;
    }

    public void setUserAccountEntityList(List<UserAccountEntity> userAccountEntityList) {
        this.userAccountEntityList = userAccountEntityList;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
