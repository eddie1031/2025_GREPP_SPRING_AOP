package io.eddie.greppaop.proxy.virtual_proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProteinDistributor implements SupplementProvider{

    private SupplementProvider provider;
    private String protein;

    public ProteinDistributor(SupplementProvider provider) {
        this.provider = provider;
    }

    @Override
    public String provide() {

        log.info("유통업체가 주문을 받았습니다!");

        if ( protein == null ) {
            log.info("보유하고 있는 재고가 없습니다!");
            protein = provider.provide();
        }

        log.info("재고를 송부합니다!");

        return protein;
    }

}
