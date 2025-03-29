package io.eddie.greppaop.app;

import io.eddie.greppaop.repository.AopRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class AopService {

    private final AopRepository aopRepository;

    public void logic() {
        log.info("[AopService] 서비스 로직 시작!");
        aopRepository.logic();
        log.info("[AopService] 서비스 로직 종료!");
    }

}
