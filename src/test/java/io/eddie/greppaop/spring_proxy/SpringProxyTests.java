package io.eddie.greppaop.spring_proxy;

import io.eddie.greppaop.spring_proxy.app.ConcreteMockService;
import io.eddie.greppaop.spring_proxy.app.MockService;
import io.eddie.greppaop.spring_proxy.app.MockServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

@Slf4j
public class SpringProxyTests {

    @Test
    @DisplayName("스프링 프록시 팩토리에서는 프록시 대상 객체가 인터페이스를 구현한 구체 클래스라면, JDK를 사용한다.")
    void proxy_test_1() throws Exception {

        MockService target = new MockServiceImpl();

        ProxyFactory proxyFactory = new ProxyFactory(target);
        proxyFactory.addAdvice(new SubLogicInterceptor());

        MockService proxy = (MockService) proxyFactory.getProxy();

        log.info("target.getClass() = {}", target.getClass());
        log.info("proxy.getClass() = {}", proxy.getClass());

        proxy.logic();

    }

    static class SubLogicInterceptor implements MethodInterceptor {

        @Override
        public Object invoke(MethodInvocation invocation) throws Throwable {

            log.info("[INTERCEPTOR] 전처리!");
            Object result = invocation.proceed();
            log.info("[INTERCEPTOR] 후처리!");


            return result;
        }

    }

    @Test
    @DisplayName("구상 클래스(Concrete Class)라면, 스프링 프록시 팩토리는 CGLIB 방식으로 프록시 객체를 생성한다.")
    void proxy_test_2() throws Exception {

        ConcreteMockService mockService = new ConcreteMockService();

        ProxyFactory proxyFactory = new ProxyFactory(mockService);
        proxyFactory.addAdvice(new SubLogicInterceptor());

        ConcreteMockService proxy = (ConcreteMockService) proxyFactory.getProxy();

        log.info("mockService.getClass() = {}", mockService.getClass());
        log.info("proxy.getClass() = {}", proxy.getClass());

        proxy.logic1();

    }

    @Test
    void proxy_test_3() throws Exception {

        MockService target = new MockServiceImpl();

        ProxyFactory proxyFactory = new ProxyFactory(target);
        proxyFactory.setProxyTargetClass(true);
        proxyFactory.addAdvice(new SubLogicInterceptor());

        MockService proxy = (MockService) proxyFactory.getProxy();

        log.info("target.getClass() = {}", target.getClass());
        log.info("proxy.getClass() = {}", proxy.getClass());

        proxy.logic();


    }



}
