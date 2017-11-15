package com.supervise.medicare.dao.impl;

import com.supervise.commons.core.sql.dto.DataRecord;
import com.supervise.commons.core.sql.dto.JavaBean;
import com.supervise.commons.core.util.JavaBeanMap;
import com.supervise.medicare.dao.UserInfoDao;
import com.supervise.medicare.pojo.UserInfo;
import com.supervise.commons.core.dao.impl.BaseDao;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xc.xiong on 2017/9/5.
 */
@Repository
public class UserInfoDaoImpl extends BaseDao<UserInfo, Long> implements UserInfoDao {

    @Autowired
    public UserInfoDaoImpl(SqlSessionFactory sqlSessionFactory) {
        super(sqlSessionFactory);
    }

    @Override
    public Class<UserInfo> getClz() {
        return UserInfo.class;
    }



    @Override
    public UserInfo queryByUserId(Long userId) {
        Map<String, Object> map = new HashMap<>();
        map.put("userId", userId);
        DataRecord dataRecord = super.selectForDataRecord("com.supervise.medicare.pojo.UserInfo.queryByUserId", map);
        UserInfo userInfo = (UserInfo) JavaBeanMap.convertMap2JavaBean(dataRecord, UserInfo.class);
        return userInfo;
    }

}
