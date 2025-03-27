package io.eddie.greppaop.jdk_dynamic_proxy.s0.app;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MockServiceImpl implements MockService{

    @Override
    public void logic1() {
        log.info("MockServiceImpl.logic1()");
    }

    @Override
    public void logic2() {
        log.info("MockServiceImpl.logic2()");
    }

}
