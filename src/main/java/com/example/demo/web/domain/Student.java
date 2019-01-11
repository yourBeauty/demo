package com.example.demo.web.domain;

import com.example.demo.web.dao.entity.ClazzEntity;
import com.example.demo.web.dao.entity.SchoolReportCardEntity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: You
 * Date: 2018-08-21
 * Time: 22:45
 */
public class Student extends BaseDomin{
    private String name;

    private String candidateNumber;

    private String sex;

    private Date birthday;

    private String address;

    private String phone;

    private Clazz clazz;

    private SchoolReportCard schoolReportCard;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCandidateNumber() {
        return candidateNumber;
    }

    public void setCandidateNumber(String candidateNumber) {
        this.candidateNumber = candidateNumber;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public SchoolReportCard getSchoolReportCard() {
        return schoolReportCard;
    }

    public void setSchoolReportCard(SchoolReportCard schoolReportCard) {
        this.schoolReportCard = schoolReportCard;
    }
}
