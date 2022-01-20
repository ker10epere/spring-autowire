package com.spring5.engines;

import com.spring5.interfaces.Engine;

public class V8 implements Engine {
	public String type() {
		return "V8";
	}

	public String toString() {
		return "V8 [type=" + type() + "]";
	}
}
