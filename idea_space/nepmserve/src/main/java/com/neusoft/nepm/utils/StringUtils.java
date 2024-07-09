package com.neusoft.nepm.utils;

import org.springframework.stereotype.Component;

import java.util.regex.Pattern;

@Component
public class StringUtils {
    //判断字符串为空
    public boolean isEmpty(String str){
        if(str==null||str.trim().length()==0){
            return true;
        }
        return false;
    }
    /**
     * 判断手机号格式是否正确
     * @param phone
     * @return
     */
    public boolean isRealPhone(String phone){
        String regex ="^1[3456789]\\d{9}$";
        if(Pattern.matches(regex,phone)){
            return true;
        }
        return false;
    }
    /**
     * 判断密码格式是否正确
     * 密码格式为英文+数字 长度6-12范围内
     * @param password
     * @return
     */
    public boolean isRealPassword(String password){
        String regex="^[A-Za-z0-9]{6,12}$";
        if(Pattern.matches(regex,password)){
            return  true;
        }
        return  false;
    }
}
