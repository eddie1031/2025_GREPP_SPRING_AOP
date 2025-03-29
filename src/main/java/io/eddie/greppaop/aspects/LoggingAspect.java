package io.eddie.greppaop.aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class LoggingAspect {

//    @Around("execution(public void io.eddie.greppaop.app.AopService.logic())")
//    @Around("execution(public void io.eddie.greppaop.app.AopService.logic(String,String))")
    @Around("@annotation(io.eddie.greppaop.config.Logging)")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {

        log.info("[LoggingAspect] 횡단 관심사 로깅 시작");
        Object result = joinPoint.proceed();
        log.info("[LoggingAspect] 횡단 관심사 로깅 종료");

        return result;
    }


}
