package com.spring5.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.spring5.interfaces.Car;
import com.spring5.interfaces.Engine;

@Primary
@Service
@Component("corolla")
public class Corolla implements Car {

	@Autowired
	Engine engine;
	String specs = "Corolla";

	public String getSpecs() {
		return specs;
	}

	public void setSpecs(String specs) {
		this.specs = specs;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String toString() {
		return "Corolla [engine=" + engine + ", specs=" + specs + "]";
	}
}
