package com.supervise.commons.core.mapper;

import com.supervise.commons.core.pojo.SysSequence;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface SysSequenceMapper {

    SysSequence getSequence(@Param("sequenceKey") String sequenceKey);

    int updateCurrentValue(Map<String, Object> map);


}
