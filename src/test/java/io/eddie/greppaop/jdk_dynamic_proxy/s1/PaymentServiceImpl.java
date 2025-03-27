package io.eddie.greppaop.jdk_dynamic_proxy.s1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PaymentServiceImpl implements PaymentService{
    @Override
    public void payment() {
        log.info("결제를 수행합니다!");
    }
}
