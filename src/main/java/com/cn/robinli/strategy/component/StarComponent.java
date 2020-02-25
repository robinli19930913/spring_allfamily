package com.cn.robinli.strategy.component;

import com.cn.robinli.strategy.MessageBoxRequestParamDTO;
import com.cn.robinli.strategy.MessageBoxRsponseDTO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by robin.Li on 2020/2/25.
 */
@Component("starcomponent")
public class StarComponent extends StrategyComponent {
    @Override
    public List<MessageBoxRsponseDTO> msgList(MessageBoxRequestParamDTO param) {
        List<MessageBoxRsponseDTO> list = new ArrayList<>();
        MessageBoxRsponseDTO dto = new MessageBoxRsponseDTO();
        dto.setMsgType(1);
        dto.setType(2);
        dto.setMsg("starcomponent");
        list.add(dto);
        return list;
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
