package com.example.demo.controller;

import com.example.demo.utils.LogHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017-11-26.
 */
@RestController()
@RequestMapping("/log")
public class LogController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/write")
    public Object writeLog() {
        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");
        new LogHelper().helpMethod();
        return "OK";
    }
}
