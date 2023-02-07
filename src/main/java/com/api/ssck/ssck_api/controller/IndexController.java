package com.api.ssck.ssck_api.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController extends BaseController {

    @GetMapping("/")
    public Map<String, Object> index() {
        return setResponseObject("index controller");
    }
}
