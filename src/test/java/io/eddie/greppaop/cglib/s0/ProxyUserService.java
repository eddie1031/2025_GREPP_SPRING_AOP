package io.eddie.greppaop.cglib.s0;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProxyUserService extends UserService {

    @Override
    public void createUser() {
        log.info("프록시 - 유저 생성 전에 로그 출력!");
        super.createUser();
        log.info("프록시 - 유저 생성 후에 로그 출력!");
    }

}
