package com.example.demo.web.security;

import com.example.demo.web.domain.Role;
import com.example.demo.web.domain.UserAccount;
import com.example.demo.web.service.UserAccountService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: You
 * Date: 2018-07-20
 * Time: 10:56
 */
@Service
public class CustomUserDetailsService  implements UserDetailsService{

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(CustomUserDetailsService.class);
    @Autowired
    UserAccountService userAccountService;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserInfo userInfo = null;

        try {
            UserAccount userAccount = userAccountService.findUserAccountByName(username);
            List<Role> roleList = userAccount.getRoleList();

            userInfo = new UserInfo(userAccount.getEmail(),userAccount.getPassword() == ""? null : userAccount.getPassword(),
                    true,true,true,true,getAuthority(roleList));
            userInfo.setUserId(userAccount.getId());
        } catch (Exception e) {
            if (logger.isErrorEnabled()) {
                logger.error("Exception", e);
            }
        }
        return userInfo;
    }

    public String getRole(List<Role> roleList){

        return null;
    }
    public Collection<GrantedAuthority> getAuthority(List<Role> roleList){
        List<GrantedAuthority> authorityList = new ArrayList<>();

        for (Role tempRole : roleList) {
            authorityList.add(new SimpleGrantedAuthority(tempRole.toString()));
        }
        return authorityList;
    }
}
