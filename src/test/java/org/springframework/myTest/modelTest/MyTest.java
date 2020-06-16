package org.springframework.myTest.modelTest;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.myTest.bean.TestBean;


public class MyTest {

	@Test
	public void getBeanName(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("org/springframework/my/beans1.xml");
		TestBean testBean  = (TestBean) ctx.getBean("testBean");
		System.out.println(testBean.getName());
	}
}
