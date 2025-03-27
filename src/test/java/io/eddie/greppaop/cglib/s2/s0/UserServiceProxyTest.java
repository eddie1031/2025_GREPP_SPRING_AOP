package io.eddie.greppaop.cglib.s2.s0;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.cglib.proxy.Enhancer;

@Slf4j
public class UserServiceProxyTest {

    @Test
    @DisplayName("CGLIB 적용!")
    void test1() throws Exception {

        UserService userService = new UserService();


        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserService.class);
        enhancer.setCallback(new UserServiceInterceptor(userService));

        UserService proxy = (UserService) enhancer.create();
        proxy.createUser();

    }

}
