package com.yeqifu;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.yeqifu.sys.service.IUserService;
import com.yeqifu.sys.vo.UserVo;

@SpringBootTest(classes = WarehouseApplication.class)
class WarehouseApplicationTests {
	
	@Autowired
	private IUserService userService;

	@Test
	void contextLoads() {
		UserVo user=new UserVo();
		user.setName("张三");
		user.setAddress("123");
		userService.save(user);
	}

}
