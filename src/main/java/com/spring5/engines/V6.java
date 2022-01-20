package com.spring5.engines;

import com.spring5.interfaces.Engine;

public class V6 implements Engine {
	public String type() {
		return "V6";
	}

	public String toString() {
		return "V6 [type=" + type() + "]";
	}
}
