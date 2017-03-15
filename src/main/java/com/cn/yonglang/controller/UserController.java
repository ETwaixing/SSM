package com.cn.yonglang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cn.yonglang.model.User;
import com.cn.yonglang.service.imp.UserServiceImp;

@Controller
public class UserController {
	
	@Autowired
	UserServiceImp userService;
	
	@RequestMapping(value="user",method=RequestMethod.GET)
	public String test(){
		return "Test";
	}
	
	@RequestMapping(value="get",method=RequestMethod.GET)
	@ResponseBody
	public User testJson(){
		User u = new User();
		u.setId("1");
		User user = userService.getModel(u);		
		return user;
	}
	
	
}
