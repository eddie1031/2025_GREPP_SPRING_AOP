package io.eddie.greppaop.cglib.s2.s0;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

@Slf4j
@RequiredArgsConstructor
public class UserServiceInterceptor implements MethodInterceptor {

    private final Object target;

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {

        log.info("유저 생성 전 !");
        Object result = proxy.invoke(target, args);
        log.info("유저 생성 후 !");

        return result;
    }

}
