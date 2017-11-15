package com.supervise.medicare.controller;

import com.supervise.commons.core.message.Message;
import com.supervise.commons.core.message.SuccessMessage;
import com.supervise.medicare.service.UserInfoService;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/")
public class MainController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MainController.class);
    private static Gson gson = new Gson();
    @Resource
    private UserInfoService userInfoService;

    @GetMapping("/info")
    public String test() {
        System.out.println("invoke test");
        return " self-diagnosis 启动成功";
    }

    @RequestMapping(value = "userinfo/get", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Message getUserInfo(Long userId) {
        System.out.println("invoke test");
        return new SuccessMessage(userInfoService.queryByUserId(userId));
    }


}
