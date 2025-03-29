package io.eddie.greppaop.app;

import io.eddie.greppaop.config.Logging;
import io.eddie.greppaop.repository.AopRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class NonAopService {

    private final AopRepository aopRepository;

    public void logic1() {
        log.info("[NonAopService] 서비스 로직 시작!");
        aopRepository.logic();
        log.info("[NonAopService] 서비스 로직 종료!");
    }

    @Logging
    public void specialLogic() {
        log.info("[NonAopService] 스패셜 로직 시작!");
        aopRepository.logic();
        log.info("[NonAopService] 스패셜 로직 종료!");
    }

}
