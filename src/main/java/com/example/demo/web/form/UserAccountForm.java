package com.example.demo.web.form;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: You
 * Date: 2018-08-21
 * Time: 22:59
 */
public class UserAccountForm extends BaseForm{

    private String username;

    private int age;

    private String sex;

    private String email;

    private String phone;

    private String[] roles;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String[] getRoles() {
        return roles;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }
}
