package com.example.demo.web.dao.persistence;

import com.example.demo.web.dao.entity.RoleEntity;
import com.example.demo.web.dao.entity.SchoolReportCardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: You
 * Date: 2018-08-21
 * Time: 20:49
 */
public interface RoleRepository extends JpaRepository<RoleEntity,Long> {
}
