package com.example.demo.web.service;

import com.example.demo.web.domain.Grade;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: You
 * Date: 2018-08-21
 * Time: 23:08
 */
public interface GradeService {

    GradeService addGrade(Grade grade);

    String deleteGradeById(Long id);

    String deleteGradeByName(String name);

    GradeService updateGrade(Grade grade);

    Grade findGradeById(Long id);

    List<Grade> findGradeByParams(int pageNum, int maxNum, String name, String department, String role, Date comeDate);

    Grade findGradeByName(String name);

    List<Grade> findAll();
}
