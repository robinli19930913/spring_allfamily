package com.cn.robinli;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan({"com.cn.robinli.mapper"})
@EnableTransactionManagement
@EnableCaching
@EnableAspectJAutoProxy
public class SpringAllfamilyApplication {
	@Cacheable
	public static void main(String[] args) {
		SpringApplication.run(SpringAllfamilyApplication.class, args);
		System.out.println("启动成功！");
	}

}
