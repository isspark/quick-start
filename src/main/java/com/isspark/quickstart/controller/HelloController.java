package com.isspark.quickstart.controller;

import com.isspark.quickstart.common.Result;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Desperado
 */
@RestController("/hello")
public class HelloController {

    private static Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/pathvar/{name}")
    public Result hello(@PathVariable String name) {
        logger.info(name);
        return StringUtils.isEmpty(name) ? Result.FAILURE : Result.SUCCESS;
    }

    @GetMapping("/name")
    public Result hello2(String name) {
        return StringUtils.isEmpty(name) ? Result.FAILURE : Result.SUCCESS(name);
    }
}
