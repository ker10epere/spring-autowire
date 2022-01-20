package com.spring5.engines;

import org.springframework.stereotype.Component;

import com.spring5.interfaces.Engine;

@Component
public class V8 implements Engine {
	public String type() {
		return "V8";
	}

	@Override
	public String toString() {
		return "V8 [type=" + type() + "]";
	}
}
