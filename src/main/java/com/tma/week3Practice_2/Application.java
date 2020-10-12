package com.tma.week3Practice_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:BeanConfiguration.xml")
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		// Use annotation
		StudentBean student = context.getBean("studentBean", StudentBean.class);
		student.setName("Hai1");
		student.setAge(10);
		student.setProvince("Gia Lai");
		student.setClasses("12C1");
		System.out.println(student.toString());
		// Use BeanConfiguration.xml
		StudentBean student2 = context.getBean("studentBean2", StudentBean.class);
		System.out.println(student2.toString());

	}

}
