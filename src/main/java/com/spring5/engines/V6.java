package com.spring5.engines;

import org.springframework.stereotype.Component;

import com.spring5.interfaces.Engine;

@Component("v6")
public class V6 implements Engine {
	public String type() {
		return "V6";
	}

	@Override
	public String toString() {
		return "V6 [type=" + type() + "]";
	}
}
