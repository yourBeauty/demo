package com.example.demo.web.controller;

import com.example.demo.web.domain.Grade;
import com.example.demo.web.form.GradeForm;
import com.example.demo.web.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: You
 * Date: 2018-09-24
 * Time: 17:16
 */
public class GradeController extends BaseController {

    @Autowired
    GradeService gradeService;

    @PostMapping("/getGrade")
    public GradeForm getGradeForm(){

        List<Grade> gradeList = gradeService.findAll();

        for (Grade grades: gradeList) {

        }
        return null;
    }
}
