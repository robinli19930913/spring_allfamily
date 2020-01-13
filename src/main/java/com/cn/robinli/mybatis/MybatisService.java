package com.cn.robinli.mybatis;

import com.cn.robinli.mapper.CoreUserMapperExt;
import com.cn.robinli.model.CoreUserDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by robin.Li on 2019/12/29.
 */
@Service
public class MybatisService {
    @Resource
    private CoreUserMapperExt coreUserMapperExt;

    @Transactional
    public String mybatisinsert() {
        System.out.println("开始");
        Integer r1 = coreUserMapperExt.insert(System.currentTimeMillis()+"AAA");
        System.out.println("影响行数："+r1);
        CoreUserDTO coreUserDTO = new  CoreUserDTO();
        coreUserDTO.setName(System.currentTimeMillis() + "BBB");
        Integer r2 = coreUserMapperExt.insertOfKey(coreUserDTO);
        System.out.println("当前主键："+coreUserDTO.getUserId());
        r2 = coreUserMapperExt.insertOfKey2(coreUserDTO);
        System.out.println("当前主键："+coreUserDTO.getUserId());

        return "结束";
    }

    public String mmm(String qwe) {
        System.out.println(qwe);
        return "return";
    }
}
