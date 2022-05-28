package com.dblcy.system.service.impl;

import com.dblcy.api.dto.UserInfoDTO;
import com.dblcy.api.service.UserInfoApiService;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.UUID;

/**
 * 用户信息api实现类
 *
 * @author daibing
 * @since 2022/5/26
 */
@DubboService
public class UserInfoApiServiceImpl implements UserInfoApiService {

    @Override
    public UserInfoDTO getById(Long userId) {
        UserInfoDTO userInfoDTO = new UserInfoDTO();
        userInfoDTO.setId(userId);
        userInfoDTO.setNickName("用户" + UUID.randomUUID());
        return userInfoDTO;
    }
}
