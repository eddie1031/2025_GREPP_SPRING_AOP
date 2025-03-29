package io.eddie.greppaop.spring_proxy.app;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MockServiceImpl implements MockService{
    @Override
    public void logic() {
        log.info("[SUBJECT] MockServiceImpl.logic1()");

    }
}
