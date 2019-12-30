package com.cn.robinli.model;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by robin.Li on 2019/12/30.
 */
@Data
public class CoreUserDTO implements Serializable{
    private Long userId;
    private String name;
}
