package com.app.mybatis.project;

//import org.apache.ibatis.annotations.Mapper;
//import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//@MapperScan(basePackages = "org.mybatis.spring.mapper")
//@Mapper
@SpringBootApplication
public class ProjectMyBatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectMyBatisApplication.class, args);
	}

}
