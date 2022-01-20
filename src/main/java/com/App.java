package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring5.interfaces.Car;

public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Car swift = context.getBean("corolla", Car.class);
		context.close();
		System.out.println(swift);
	}

}
