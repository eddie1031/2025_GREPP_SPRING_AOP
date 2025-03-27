package io.eddie.greppaop.proxy.virtual_proxy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SupplementTests {

    @Test
    @DisplayName("프록시 패턴 예제 1")
    void test1() throws Exception {

        ProteinProvider realSubject = new ProteinProvider();
        ProteinDistributor proxy = new ProteinDistributor(realSubject);

        // Client
        proxy.provide(); //
        proxy.provide(); //
        proxy.provide(); //

    }

}
