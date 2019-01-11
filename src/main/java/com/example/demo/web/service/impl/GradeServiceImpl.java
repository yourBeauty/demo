package com.example.demo.web.service.impl;

import com.example.demo.web.domain.Grade;
import com.example.demo.web.service.GradeService;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: You
 * Date: 2018-09-24
 * Time: 17:31
 */
public class GradeServiceImpl  extends BaseService implements GradeService{

    @Override
    public GradeService addGrade(Grade grade) {
        return null;
    }

    @Override
    public String deleteGradeById(Long id) {
        return null;
    }

    @Override
    public String deleteGradeByName(String name) {
        return null;
    }

    @Override
    public GradeService updateGrade(Grade grade) {
        return null;
    }

    @Override
    public Grade findGradeById(Long id) {
        return null;
    }

    @Override
    public List<Grade> findGradeByParams(int pageNum, int maxNum, String name, String department, String role, Date comeDate) {
        return null;
    }

    @Override
    public Grade findGradeByName(String name) {
        return null;
    }

    @Override
    public List<Grade> findAll() {
        return null;
    }

}
