package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring5.cars.Corolla;
import com.spring5.cars.Swift;
import com.spring5.engines.V6;
import com.spring5.engines.V8;
import com.spring5.interfaces.Car;
import com.spring5.interfaces.Engine;

@Configuration
@ComponentScan("com")
public class AppConfig {
	@Bean("corolla")
	public Car corolla() {
		return new Corolla();
	}

	@Bean("swift")
	public Car swift() {
		return new Swift();
	}

	@Bean("v6")
	public Engine v6() {
		return new V6();
	}

	@Bean("v8")
	public Engine v8() {
		return new V8();
	}
}
