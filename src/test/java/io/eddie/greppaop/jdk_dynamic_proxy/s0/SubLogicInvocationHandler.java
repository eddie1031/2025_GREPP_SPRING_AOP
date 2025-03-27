package io.eddie.greppaop.jdk_dynamic_proxy.s0;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

@Slf4j
public class SubLogicInvocationHandler implements InvocationHandler {

    private final Object target;

    public SubLogicInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy,
                         Method method,
                         Object[] args) throws Throwable {

        log.info("[BEFORE] 로직 실행 전!");
        Object result = method.invoke(target, args);
        log.info("[AFTER] 로직 실행 후!");

        return result;

    }

}
