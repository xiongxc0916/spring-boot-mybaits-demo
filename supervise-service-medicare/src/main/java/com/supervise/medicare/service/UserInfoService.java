package com.supervise.medicare.service;

import com.supervise.medicare.pojo.UserInfo;

public interface UserInfoService {


    /**
     * 根据用户id查询用户基础信息
     *
     * @param userId
     * @return
     */
    UserInfo queryByUserId(Long userId);

}
