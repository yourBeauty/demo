package com.example.demo.web.utils;

import org.apache.commons.beanutils.BeanUtilsBean;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: You
 * Date: 2018-09-01
 * Time: 22:13
 */
public class CopyUtil {

    public static BeanUtilsBean getBeanUtilsBean(){
        BeanUtilsBean beanUtilsBean = BeanUtilsBean.getInstance();
        return beanUtilsBean;
    }
}
