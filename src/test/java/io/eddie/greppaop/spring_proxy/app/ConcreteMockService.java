package io.eddie.greppaop.spring_proxy.app;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConcreteMockService {

    public void logic1() {
        log.info("[SUBJECT] ConcreteMockService.logic1()");
    }

}
