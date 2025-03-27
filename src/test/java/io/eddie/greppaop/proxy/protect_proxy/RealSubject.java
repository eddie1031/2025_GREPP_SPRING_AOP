package io.eddie.greppaop.proxy.protect_proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RealSubject implements Subject{

    @Override
    public void operation() {
        log.info("RealSubject.operation()");
        log.info("ACTION");
    }

}
