package com.example.demo.web.service.impl;

import com.example.demo.web.dao.entity.*;
import com.example.demo.web.dao.persistence.*;
import com.example.demo.web.domain.Department;
import com.example.demo.web.domain.Role;
import com.example.demo.web.domain.UserAccount;
import com.example.demo.web.security.CustomUserDetailsService;
import com.example.demo.web.service.UserAccountService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: You
 * Date: 2018-08-24
 * Time: 23:11
 */
@Service
public class UserAccountServiceImpl extends BaseService implements UserAccountService {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(CustomUserDetailsService.class);



    @Autowired
    UserAccountRepository userAccountRepository;

    /*
    * 添加数据
    * 1.角色：admin superAdmin ...
    * 2.部门：校长办公室 副校长 教务处 财务处 政教处 后勤处 在职教师
    *
    * */

    @Autowired
    DepartmentRepository departmentRepository;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    GradeRepository gradeRepository;

    @Autowired
    ClazzRepository clazzRepository;

    @Autowired
    SchoolReportCardRepository schoolReportCardRepository;

    @Autowired
    StudentRepository studentRepository;

    @Override
    public UserAccount addUserAccount(UserAccount userAccount) {

        /*
        * 测试添加
        * */

        DepartmentEntity departmentEntity = new DepartmentEntity();

        departmentEntity.setName("教学部1");
        departmentEntity.setDateCreated(new Date());

        departmentRepository.save(departmentEntity);

        //添加年级
        String str = "";
        for (int i = 0; i < 3; i++) {
            GradeEntity gradeEntity = new GradeEntity();
            if (i==0){
                str = "一";
            }
            if (i==1){
                str = "二";
            }
            if (i==2){
                str = "三";
            }
            gradeEntity.setName("初中"+ str+"年级");
            gradeEntity.setProperty("初中");
            gradeRepository.save(gradeEntity);
        }

        //添加班级
        String strClass = "";
        for (int i = 0; i < 14; i++) {
            ClazzEntity clazzEntity = new ClazzEntity();

            clazzEntity.setName("九"+(i+1)+"班");

            clazzRepository.save(clazzEntity);
        }

        //添加角色


        if (userAccount != null){
            UserAccountEntity userAccountEntity = new UserAccountEntity();

            try {
                beanUtilsBean.copyProperties(userAccountEntity,userAccount);

                System.out.println(userAccountEntity.toString());

/*
                userAccountRepository.save(userAccountEntity);
*/
            } catch (Exception e) {
                if (logger.isErrorEnabled()) {
                    logger.error("Exception", e);
                }
            }

        }
        return null;
    }

    @Override
    public String deleteUserAccountById(Long id) {
        return null;
    }

    @Override
    public String deleteUserAccountByName(String name) {
        return null;
    }

    @Override
    public UserAccount updateUserAccount(UserAccount userAccount) {
        return null;
    }

    @Override
    public UserAccount findUserAccountById(Long id) {
        return null;
    }

    @Override
    public List<UserAccount> findUserAccountByParams(int pageNum, int maxNum, String name, String department, String role, Date comeDate) {
        return null;
    }

    @Override
    public UserAccount findUserAccountByName(String email) {

        UserAccountEntity userAccountEntity = userAccountRepository.findByEmail(email);

        if (userAccountEntity != null){
            UserAccount userAccount = new UserAccount();
            try {
                    beanUtilsBean.copyProperties(userAccount,userAccountEntity);
                    return userAccount;
            } catch (Exception e) {
                if (logger.isErrorEnabled()) {
                    logger.error("Exception", "userAccount is exception");
                }
            }
        }

        return null;
    }

    @Override
    public List<UserAccount> findAll() {
        return null;
    }

    public DepartmentEntity copyDepartment(UserAccount userAccount){

        DepartmentEntity departmentEntity = new DepartmentEntity();
        Department department = userAccount.getDepartment();
        try {
            beanUtilsBean.copyProperties(departmentEntity,department);
            return departmentEntity;
        } catch (Exception e) {
            if (logger.isErrorEnabled()) {
                logger.error("Exception", e);
            }
        }
        return null;
    }

    public List<RoleEntity> copyRoleList(UserAccount userAccount){

        RoleEntity roleEntity = new RoleEntity();

        List<Role> roleList = userAccount.getRoleList();

        return null;
    }
}
