package com.supervise.medicare.service.impl;

import com.supervise.medicare.dao.UserInfoDao;
import com.supervise.medicare.pojo.UserInfo;
import com.supervise.medicare.service.UserInfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private UserInfoDao userInfoDao;

    @Override
    public UserInfo queryByUserId(Long userId) {
        return userInfoDao.queryByUserId(userId);
    }

}
