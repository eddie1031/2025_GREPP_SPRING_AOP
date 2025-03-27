package io.eddie.greppaop.proxy.protect_proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Proxy implements Subject{

    private Subject targetObject;

    public Proxy(Subject targetObject) {
        this.targetObject = targetObject;
    }

    @Override
    public void operation() {
        // 전처리 로직
        log.info("[prefix] Proxy.operation()");
        targetObject.operation();
        log.info("[postfix] Proxy.operation()");
        // 후처리 로직
    }

}
