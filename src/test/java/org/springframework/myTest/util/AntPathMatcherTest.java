package org.springframework.myTest.util;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.myTest.bean.TestBean;
import org.springframework.util.AntPathMatcher;

import java.util.Map;



//研究spring中的路劲匹配规则
/*
 * ？匹配一个字符
 * *匹配0个字符
 * **匹配0个或多个目录
 * 开搞  开搞
 * */
public class AntPathMatcherTest {


	@Test
	public void baseTest(){
		//如下
		ApplicationContext ctx = new ClassPathXmlApplicationContext("org/springframework/my/beans1.xml");
		TestBean testBean  = ctx.getBean(TestBean.class);
		System.out.println(testBean.getName());
	}

	@Test
	public void pathTest() {
		AntPathMatcher antPathMatcher = new AntPathMatcher();
		int i = 1;
		boolean isOk = antPathMatcher.match("/aa/bb/cc","/aa/bb/cc");
		System.out.println(i++ + "======" + isOk);
		isOk= antPathMatcher.match("/aa/b?/cc","/aa/bb/cc");
		System.out.println(i++ + "======" + isOk);
		isOk= antPathMatcher.match("/aa/*/cc","/aa/bb/cc");
		System.out.println(i++ + "======" + isOk);
		isOk= antPathMatcher.match("*/bb/cc/dd","bb/cc/dd");
		System.out.println(i++ + "======" + isOk);
		isOk= antPathMatcher.match("/**/cc","/aa/bb/cc");
		System.out.println(i++ + "======" + isOk);
		Map<String, String> stringStringMap = antPathMatcher.extractUriTemplateVariables("/aa/bb/{path1}/{path2}", "/aa/bb/cc/dd");
		System.out.println(stringStringMap);
	}

}
