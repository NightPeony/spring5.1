package org.springframework.myTest.bean;

public class TestBean2 {

	private String name;
	private String age;
	private TestBean testBean;

	public TestBean2() {
	}

	public TestBean2(String name, String age) {
		this.name = name;
		this.age = age;
	}

	public TestBean getTestBean() {
		return testBean;
	}

	public void setTestBean(TestBean testBean) {
		this.testBean = testBean;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void initMethond(){
		System.out.println("testBean2 is initMethod run!!!");
	}

	public void destoryMethod(){
		System.out.println("testBean2 is destoryMethod run!!!");
	}
}
