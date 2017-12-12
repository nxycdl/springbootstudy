package com.example.demo;

import com.example.demo.utils.Constant;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@MapperScan("com.example.demo.mybatis.mapper")
@EnableCaching
public class ChapterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChapterApplication.class, args);
		init();
	}

	public static void init(){
		System.out.println(Constant.map.get("310"));
		Constant.map.put("340","340Value");
		Constant.map.put("510","510Value");
	}
}
