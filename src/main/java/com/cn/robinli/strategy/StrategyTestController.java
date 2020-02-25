package com.cn.robinli.strategy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * 策略模式设计
 * Created by robin.Li on 2020/2/25.
 */
@Controller
public class StrategyTestController {
    @Resource
    private MessageBoxContext messageBoxContext;

    @ResponseBody
    @GetMapping("/strategyTest")
    public String strategyTest(@RequestParam String msgcomponent){
        MessageBoxStrategy messageBoxStrategy = messageBoxContext.getMessageBoxStrategy(msgcomponent);
        List<MessageBoxRsponseDTO> messageBoxRsponseDTOS = messageBoxStrategy.msgList(null);
        return messageBoxRsponseDTOS.get(0).toString();
    }
}
