package com.testautomation.Springbasics;

import com.testautomation.Springbasics.pages.LoginPage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbasicsApplicationTests {

	@Autowired
	private LoginPage loginPage;

	@Test
	void doLoginTest() {
		loginPage.doLogin();
	}

}
