package com.cn.robinli.strategy;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by robin.Li on 2020/2/25.
 */
@Service
public class MessageBoxContext {
    @Resource
    private final Map<String, MessageBoxStrategy> messageBoxStrategyMap = new ConcurrentHashMap<>();

    public MessageBoxContext(Map<String, MessageBoxStrategy> messageBoxStrategyMap){
        messageBoxStrategyMap.clear();
        messageBoxStrategyMap.forEach((k, v) -> this.messageBoxStrategyMap.put(k,v));
    }

    public MessageBoxStrategy getMessageBoxStrategy(String msgcomponent){
        return this.messageBoxStrategyMap.get(msgcomponent);
    }
}
