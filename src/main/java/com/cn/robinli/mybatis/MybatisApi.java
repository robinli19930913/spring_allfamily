package com.cn.robinli.mybatis;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class MybatisApi {
    @Resource
    private MybatisService mybatisService;

    @RequestMapping("/mybatisinsert")
    public String mybatisinsert(){
        String result = mybatisService.mybatisinsert();
        return result;
    }

    @RequestMapping("/testaspect")
    public String mmm(){
        String result = mybatisService.mmm("qwe");
        return result;
    }
}
