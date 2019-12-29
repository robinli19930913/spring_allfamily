package com.cn.robinli.transactiontest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 事务传播方式与隔离级别
 *
 * Created by robin.Li on 2019/12/29.
 */
@RestController
public class TransactionApi {
    @Resource
    private TransactionService transactionService;

    /**
     * 默认
     * 当前有事务，就加入这个事务，没有事务，就新建一个事务
     * REQUIRED(TransactionDefinition.PROPAGATION_REQUIRED),
     * @return
     */
    @RequestMapping("/test1")
    public String test1(){
        String result = transactionService.PROPAGATION_REQUIRED();
        return result;
    }
}
