package com.example.demo.web.dao.persistence;
import com.example.demo.web.dao.entity.UserAccountEntity;

import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: You
 * Date: 2018-07-20
 * Time: 15:57
 */
public interface UserAccountRepository extends JpaRepository<UserAccountEntity,Long> {

    UserAccountEntity findByEmail(String email);

}
