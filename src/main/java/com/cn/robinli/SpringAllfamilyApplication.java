package com.cn.robinli;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.cn.robinli.transactiontest.mapper")
@EnableTransactionManagement
public class SpringAllfamilyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAllfamilyApplication.class, args);
		System.out.println("启动成功！");
	}

}
