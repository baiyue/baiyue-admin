package com.baiyue.admin.common;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class XStreamSerializer implements Serializer {

	private final Class clazz;
	public XStreamSerializer(Class clazz){
		this.clazz = clazz;
	}
	
	@Override
	public String marsh(Object obj) {
		XStream stream = new XStream(new DomDriver("UTF-8"));
		stream.processAnnotations(clazz);
		return stream.toXML(obj);
	}
	
	@Override
	public <T> T unmarsh(String xml) {
		XStream stream = new XStream(new DomDriver("UTF-8"));
		stream.processAnnotations(clazz);
		return (T) stream.fromXML(xml);
	}
}
