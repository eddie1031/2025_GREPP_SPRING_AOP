package io.eddie.greppaop.app;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class AopServiceTests {

    @Autowired
    AopService aopService;

    @Autowired
    NonAopService nonAopService;

    @Test
    @DisplayName("AopTest가 진짜로 주입 되었나요?")
    void spring_aop_test_1() throws Exception {

        aopService.logic();
//        log.info("=======================");
//        nonAopService.logic1();

    }


}