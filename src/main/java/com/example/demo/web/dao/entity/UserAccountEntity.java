package com.example.demo.web.dao.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: You
 * Date: 2018-07-20
 * Time: 15:44
 */

@Entity
@Table(name = "user_account_entity",uniqueConstraints = @UniqueConstraint(columnNames = {"username"}))
public class UserAccountEntity extends BaseEntity{

    private String username;

    private String password;

    private String email;

    private String nickname;

    private Date createDate;

    private int sex;

    private int phone;


    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "departmentEntityId")
    private DepartmentEntity departmentEntity;

    @ManyToMany
    @JoinTable(name = "u_r_entity",joinColumns = {@JoinColumn(name = "userId",referencedColumnName = "id")},inverseJoinColumns = {@JoinColumn(name = "roleId",referencedColumnName = "id")})
    private List<RoleEntity> roleEntityList;

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public DepartmentEntity getDepartmentEntity() {
        return departmentEntity;
    }

    public void setDepartmentEntity(DepartmentEntity departmentEntity) {
        this.departmentEntity = departmentEntity;
    }

    public List<RoleEntity> getRoleEntityList() {
        return roleEntityList;
    }

    public void setRoleEntityList(List<RoleEntity> roleEntityList) {
        this.roleEntityList = roleEntityList;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

}
