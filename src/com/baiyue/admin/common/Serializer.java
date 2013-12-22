package com.baiyue.admin.common;

public interface Serializer {

	public String marsh(Object obj);
	
	public <T> T unmarsh(String xml);
}
