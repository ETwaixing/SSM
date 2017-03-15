package com.cn.yonglang.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cn.yonglang.model.User;
import com.cn.yonglang.service.imp.UserServiceImp;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  

public class UserTest {

    @Autowired  
    private UserServiceImp userService = null;   	
	
	@Test
	public void test(){
		User u = new User();
		u.setId("1");
		User user = userService.getModel(u);
		System.out.println(user);
	}
	
}
