package com.cn.robinli.strategy;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by robin.Li on 2020/2/25.
 */
@Data
public class MessageBoxRequestParamDTO implements Serializable {
    private Integer msgType;
    private Integer type;
}
