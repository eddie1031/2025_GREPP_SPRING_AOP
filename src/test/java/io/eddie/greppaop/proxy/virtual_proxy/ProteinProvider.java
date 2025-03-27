package io.eddie.greppaop.proxy.virtual_proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProteinProvider implements SupplementProvider{

    @Override
    public String provide() {
        log.info("생산자가 프로틴을 포장해서 보내줍니다!");
        return "SYNTHA-6";
    }

}
