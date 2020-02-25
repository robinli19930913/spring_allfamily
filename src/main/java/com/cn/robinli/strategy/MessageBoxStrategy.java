package com.cn.robinli.strategy;

import java.util.List;

/**
 * Created by robin.Li on 2020/2/25.
 */
public interface MessageBoxStrategy {
    List<MessageBoxRsponseDTO> msgList(MessageBoxRequestParamDTO param);

    Boolean insertMsg(MessageBoxRequestParamDTO param);

    Boolean selectMsg(MessageBoxRequestParamDTO param);
}
