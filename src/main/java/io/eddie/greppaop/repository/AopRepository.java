package io.eddie.greppaop.repository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
public class AopRepository {

    public void logic() {
        log.info("[AopRepository] 리포지터리 로직 시작! ");
        log.info("[AopRepository] 리포지터리 로직 종료! ");
    }

}
