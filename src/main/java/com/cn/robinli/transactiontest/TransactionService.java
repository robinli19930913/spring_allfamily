package com.cn.robinli.transactiontest;

import com.cn.robinli.transactiontest.mapper.CoreUserMapperExt;
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
    private TransactionService transactionService;

    @Transactional(propagation = Propagation.REQUIRED)
    public String PROPAGATION_REQUIRED() {
        System.out.println("开始");
        Integer r1 = coreUserMapperExt.insert("赵六");
        try {
            this.transactionService.PROPAGATION_REQUIRED2(r1);
        }catch(RuntimeException e){
            //throw new RuntimeException("内层方法出现异常回滚");
        }

        return "结束";
    }
    @Transactional(propagation = Propagation.REQUIRED)
    private void PROPAGATION_REQUIRED2(Integer r1) {
        Integer ee = coreUserMapperExt.insert("123");
        System.out.println("kaishi2");
        throw new RuntimeException("内层方法出现异常回滚");
    }
}
