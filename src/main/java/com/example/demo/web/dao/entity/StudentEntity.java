package com.example.demo.web.dao.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: You
 * Date: 2018-07-27
 * Time: 17:58
 */
@Entity
@Table(name = "student_entity")
public class StudentEntity extends BaseEntity{

    private String name;

    private String candidateNumber;

    private String sex;

    @Temporal(TemporalType.TIMESTAMP)
    private Date birthday;

    private String address;

    private String phone;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "clazzId")
    private ClazzEntity clazzEntity;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "studentEntity")
    private List<SchoolReportCardEntity> schoolReportCardEntityList;

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

    public ClazzEntity getClazzEntity() {
        return clazzEntity;
    }

    public void setClazzEntity(ClazzEntity clazzEntity) {
        this.clazzEntity = clazzEntity;
    }

    public List<SchoolReportCardEntity> getSchoolReportCardEntityList() {
        return schoolReportCardEntityList;
    }

    public void setSchoolReportCardEntityList(List<SchoolReportCardEntity> schoolReportCardEntityList) {
        this.schoolReportCardEntityList = schoolReportCardEntityList;
    }
}
