package com.spring5.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.spring5.interfaces.Car;
import com.spring5.interfaces.Engine;

public class Corolla implements Car {

	@Qualifier("v6")
	@Autowired(required = false)
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
