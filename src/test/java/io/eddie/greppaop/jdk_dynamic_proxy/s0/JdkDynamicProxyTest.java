package io.eddie.greppaop.jdk_dynamic_proxy.s0;

import io.eddie.greppaop.jdk_dynamic_proxy.s0.app.MockService;
import io.eddie.greppaop.jdk_dynamic_proxy.s0.app.MockServiceImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;

public class JdkDynamicProxyTest {

    @Test
    @DisplayName("언어차원(JDK, Reflection)에서 제공하는 프록시 패턴 테스트")
    void T1() throws Exception {

        MockServiceImpl targetObject = new MockServiceImpl();
        SubLogicInvocationHandler handler = new SubLogicInvocationHandler(targetObject);

        MockService proxy = (MockService) Proxy.newProxyInstance(
                MockService.class.getClassLoader()
                , new Class[]{MockService.class}
                , handler
        );

        proxy.logic1();
        proxy.logic2();

    }

}
