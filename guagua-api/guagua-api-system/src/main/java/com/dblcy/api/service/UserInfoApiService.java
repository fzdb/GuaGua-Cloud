package com.dblcy.api.service;

import com.dblcy.api.dto.UserInfoDTO;

/**
 * 用户信息远程服务接口
 *
 * @author daibing
 * @since 2022/5/23
 */
public interface UserInfoApiService {
    UserInfoDTO getById(Long userId);
}
