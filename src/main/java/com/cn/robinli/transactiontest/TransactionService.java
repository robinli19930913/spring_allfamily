package com.cn.robinli.transactiontest;

import com.cn.robinli.mapper.CoreUserMapperExt;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by robin.Li on 2019/12/29.
 */
@Service
public class TransactionService {
    @Resource
    private CoreUserMapperExt coreUserMapperExt;

    @Resource
    TransactionService transactionService;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public String PROPAGATION_REQUIRED() {
        System.out.println("开始");
        Integer r1 = coreUserMapperExt.insert(System.currentTimeMillis()+"AAA");
        //transactionService.PROPAGATION_REQUIRED2(r1);
        try {
            this.transactionService.PROPAGATION_REQUIRED2(r1);
        }catch(RuntimeException e){
            //throw new RuntimeException("内层方法出现异常回滚");
        }
        //throw new RuntimeException("内层方法出现异常回滚");
        return "结束";
    }
    @Transactional(propagation = Propagation.REQUIRED)
    public void PROPAGATION_REQUIRED2(Integer r1) {
        System.out.println("------------");
        Integer ee = coreUserMapperExt.insert(System.currentTimeMillis()+"BBB");
        System.out.println("kaishi2");
        throw new RuntimeException("内层方法出现异常回滚");
    }
}
