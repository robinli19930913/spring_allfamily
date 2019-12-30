package com.cn.robinli.mapper;

import com.cn.robinli.model.CoreUserDTO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;

/**
 * Created by robin.Li on 2019/12/29.
 */
public interface CoreUserMapperExt {
    /*直接添加返回影响行数*/
    @Insert({"insert into core_user (nick_name,update_at) values (#{name},now())"})
    Integer insert(@Param("name") String name);

    /*添加返回当前主键*/
    @Insert({"insert into core_user (nick_name,update_at) values (#{name},now())"})
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "userId",keyColumn = "user_id",resultType = Long.class, before = false)
    //@Options(useGeneratedKeys = true, keyProperty = "userId", keyColumn = "user_id")
    Integer insertOfKey(CoreUserDTO coreUserDTO);

    /*添加返回当前主键*/
    @Insert({"insert into core_user (nick_name,update_at) values (#{name},now())"})
    @Options(useGeneratedKeys = true, keyProperty = "userId", keyColumn = "user_id")
    Integer insertOfKey2(CoreUserDTO coreUserDTO);
}
