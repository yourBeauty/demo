package com.example.demo.web.dao.persistence;

import com.example.demo.web.dao.entity.ClazzEntity;
import com.example.demo.web.dao.entity.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: You
 * Date: 2018-08-21
 * Time: 20:49
 */
public interface ClazzRepository extends JpaRepository<ClazzEntity,Long> {
}
