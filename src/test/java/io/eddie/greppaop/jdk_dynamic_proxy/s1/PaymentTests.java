package io.eddie.greppaop.jdk_dynamic_proxy.s1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;

public class PaymentTests {

    @Test
    @DisplayName("")
    void payment_test() throws Exception {

        PaymentServiceImpl target = new PaymentServiceImpl();
        PaymentHandler paymentHandler = new PaymentHandler(target);

        PaymentService proxy = (PaymentService) Proxy.newProxyInstance(
                PaymentService.class.getClassLoader(),
                new Class[]{PaymentService.class},
                paymentHandler
        );

        proxy.payment();


    }

}
