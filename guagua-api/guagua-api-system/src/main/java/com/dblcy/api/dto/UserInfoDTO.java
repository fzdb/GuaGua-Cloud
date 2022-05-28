package com.dblcy.api.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * 用户参数
 *
 * @author daibing
 * @since 2022/5/23
 */
@Builder
@Data
public class UserInfoDTO implements Serializable {
    /**
     * 用户主键id
     */
    private Long id;
    /**
     * 昵称
     */
    private String nickName;
}
