package com.cn.robinli.transactiontest.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

/**
 * Created by robin.Li on 2019/12/29.
 */
public interface CoreUserMapperExt {
    @Insert({"insert into core_user (nick_name,update_at) values (#{name},now())"})
    Integer insert(@Param("name") String name);
}
