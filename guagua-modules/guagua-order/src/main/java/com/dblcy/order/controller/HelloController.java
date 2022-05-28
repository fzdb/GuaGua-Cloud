package com.dblcy.order.controller;

import com.dblcy.api.dto.UserInfoDTO;
import com.dblcy.api.service.UserInfoApiService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author daibing
 * @since 2022/5/26
 */
@RestController
@RequestMapping("/test")
public class HelloController {
    @DubboReference
    private UserInfoApiService userInfoApiService;

    @GetMapping("/getById")
    public UserInfoDTO getById(@RequestParam("userId") Long userId) {
        return userInfoApiService.getById(userId);
    }
}
