package com.ntt.Test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.ntt.comp.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		
		System.out.println("SetterInjection.main()");

//		Locate and Hold Spring bean cfg file
		FileSystemResource res = new FileSystemResource("src/com/ntt/cfgs/applicationContext.xml");
//		create IOC container
		XmlBeanFactory factory = new XmlBeanFactory(res);
//		get Target Bean obj
		Object obj = factory.getBean("wmg");
//		typecasting
		WishMessageGenerator generator = (WishMessageGenerator)obj;
//		invoke method
		String result = generator.wishMessageGenerator("Shivani");
		System.out.println(result);
	}

}
