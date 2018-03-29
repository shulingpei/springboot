package com.hua;

import com.hua.pojo.User;
import com.hua.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisApplicationTests {

	@Autowired
	private UserService userService;
	@Test
	public void contextLoads() {
		List<User> u = userService.getAll();
		for (User user : u) {
			System.out.println("姓名:"+user.getName()+"密码:"+user.getPwd()+"时间:"+user.getDate_time());
		}

	}

}
