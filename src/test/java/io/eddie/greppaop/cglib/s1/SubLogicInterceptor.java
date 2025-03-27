package io.eddie.greppaop.cglib.s1;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

@Slf4j
@RequiredArgsConstructor
public class SubLogicInterceptor implements MethodInterceptor {

    private final Object target;

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {

        log.info("[BEFORE] 호출 전 적용!");
        Object result = proxy.invoke(target, args);
        log.info("[AFTER] 호출 후 적용!");

        return result;
    }


}
