package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring5.interfaces.Car;

public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Car swift = context.getBean("swift", Car.class);
		System.out.println(swift);
		
		Car corolla = context.getBean("corolla", Car.class);
		System.out.println(corolla);
		
		context.close();
		
	}

}
