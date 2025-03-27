package io.eddie.greppaop.jdk_dynamic_proxy.s1;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

@Slf4j
@RequiredArgsConstructor
public class PaymentHandler implements InvocationHandler {

    private final Object targetObject;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        log.info("결제 전에 로깅을 수행하겠습니다!");
        Object result = method.invoke(targetObject, args);
        log.info("결제 후에 로깅을 수행하겠습니다!");

        return result;
    }

}
