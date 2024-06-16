package com.testautomation.Springbasics;

import com.testautomation.Springbasics.beanlifecycle.Television;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBasicsBeanTest {

	@Autowired
	private Television television;

	@Test
	void validateTelevision() {
		television.playChannel();
	}

}
