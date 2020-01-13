package com.cn.robinli.joda;

import org.joda.time.DateTime;

/**
 * Joda-Time，最好我还是选择它。因为它提供更优雅的编程，更简洁的代码，和更强大的时间处理。总而言之，它是非常好用的
 * Created by robin.Li on 2020/1/1.
 */
public class JodaTime {
    public static void main(String[] args) {
        DateTime dateTime = new DateTime();
        System.out.println(dateTime.toString("yyyy-MM-dd"));
    }
}
