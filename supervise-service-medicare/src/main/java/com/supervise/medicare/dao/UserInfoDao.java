package com.supervise.medicare.dao;

import com.supervise.medicare.pojo.UserInfo;
import com.supervise.commons.core.dao.IBaseDao;
import org.springframework.stereotype.Component;

/**
 * Created by xc.xiong on 2017/9/5.
 */
@Component
public interface UserInfoDao extends IBaseDao<UserInfo, Long> {


    UserInfo queryByUserId(Long userId);

}
