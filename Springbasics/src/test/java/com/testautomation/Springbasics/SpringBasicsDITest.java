package com.testautomation.Springbasics;

import com.testautomation.Springbasics.dIUsingConstructor.UserViaConstructor;
import com.testautomation.Springbasics.dIUsingConstructor.UserViaField;
import com.testautomation.Springbasics.dIUsingConstructor.UserViaSetter;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SpringBasicsDITest {

    @Autowired
    private UserViaConstructor user;

    @Autowired
    private UserViaSetter userViaSetter;

    @Autowired
    private UserViaField userViaField;

    @Test
    void validateUserViaConstructorTest() {
        user.printUserDetails();
    }

    @Test
    void validateUserViaSetterTest() {
        userViaSetter.printUserDetails();
    }

    @Test
    void validateUserViaFieldTest() {
        userViaField.printUserDetails();
    }

}
