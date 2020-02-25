package com.cn.robinli.strategy.component;

import com.cn.robinli.strategy.MessageBoxRequestParamDTO;
import com.cn.robinli.strategy.MessageBoxRsponseDTO;
import com.cn.robinli.strategy.MessageBoxStrategy;

import java.util.List;

/**
 * 空的实现是为了在增加新的方法的时候谁需要谁集成
 * Created by robin.Li on 2020/2/25.
 */
public class StrategyComponent implements MessageBoxStrategy {
    @Override
    public List<MessageBoxRsponseDTO> msgList(MessageBoxRequestParamDTO param) {
        return null;
    }

    @Override
    public Boolean insertMsg(MessageBoxRequestParamDTO param) {
        return null;
    }

    @Override
    public Boolean selectMsg(MessageBoxRequestParamDTO param) {
        return null;
    }
}
