package io.eddie.greppaop.controller;

import io.eddie.greppaop.app.AopService;
import io.eddie.greppaop.app.NonAopService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class AopController {

    private final AopService aopService;
    private final NonAopService nonAopService;

    @ResponseBody
    @GetMapping("/aop")
    public String aop() {

//        aopService.logic();
        nonAopService.specialLogic();

        return "OK";
    }


}
