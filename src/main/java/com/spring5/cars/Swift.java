package com.spring5.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.spring5.interfaces.Car;
import com.spring5.interfaces.Engine;

public class Swift implements Car {
	@Qualifier("v8")
	@Autowired
	Engine engine;
	private String specs = "Swift";

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
		return "Swift [engine=" + engine + ", specs=" + specs + "]";
	}

}
