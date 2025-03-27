package io.eddie.greppaop.cglib.s1;

import io.eddie.greppaop.cglib.s1.app.MockService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.cglib.proxy.Enhancer;

@Slf4j
public class CglibTests {

    @Test
    @DisplayName("CGLIB 방식 프록시 테스트")
    void test1() throws Exception {

        MockService mockService = new MockService();

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(MockService.class);
        enhancer.setCallback(new SubLogicInterceptor(mockService));

        MockService proxy = (MockService) enhancer.create();

        proxy.logic1();

    }

}
