package com.liyu.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.liyu.dao.UserDao;
import com.liyu.entity.User;

/**
 * 用户登陆控制器
 * @author liyu
 * @version 1.0 2017-12-07
 */

@Controller
public class UserLoginController {
	
    @Autowired
	private UserDao userDao;
	
    @RequestMapping(value="/login.do")
    public String login(HttpServletRequest request,User user){
    	
    	User u = userDao.findByUsernameAndPassword(user);
    	
    	if( u == null || u.equals("")){
    		request.setAttribute("errorMsg", "用户名或密码错误！");
    		return "login";
    	}else{
    		HttpSession session = request.getSession();
    		session.setAttribute("currentUser", u);
    		request.setAttribute("user", u);
    		return "index";
    	}
    }    	
    
}
