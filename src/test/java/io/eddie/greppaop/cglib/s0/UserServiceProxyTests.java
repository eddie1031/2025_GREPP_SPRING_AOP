package io.eddie.greppaop.cglib.s0;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UserServiceProxyTests {

    @Test
    @DisplayName("상속 방식의 프록시 테스트 1")
    void test1() throws Exception {

        UserService proxy = new ProxyUserService();
        proxy.createUser();

    }

}
