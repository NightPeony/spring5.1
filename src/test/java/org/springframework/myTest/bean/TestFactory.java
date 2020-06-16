package org.springframework.myTest.bean;

public class TestFactory {

	public static TestBean createTestBean(){
		TestBean testBean = new TestBean();
		testBean.setName("create by factory!!!");
		return testBean;
	}

	public static TestBean2 createTestBean2(){
		TestBean2 testBean2 = new TestBean2();
		testBean2.setName("create by factory");
		return testBean2;
	}
}
