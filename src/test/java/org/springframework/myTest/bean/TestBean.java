/*
 * Copyright 2002-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.myTest.bean;

import java.util.List;

/**
 * Scrap bean for use in tests.
 *
 * @author Colin Sampaleanu
 */
public class TestBean {

	private String name;

	private List<?> list;

	private TestBean2 testBean2;

	public TestBean() {
	}

	public TestBean(String name) {
		this.name = name;
	}
	/**
	 * @return Returns the name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name The name to set.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return Returns the list.
	 */
	public List<?> getList() {
		return list;
	}

	/**
	 * @param list The list to set.
	 */
	public void setList(List<?> list) {
		this.list = list;
	}


	public TestBean2 getTestBean2() {
		return testBean2;
	}

	public void setTestBean2(TestBean2 testBean2) {
		this.testBean2 = testBean2;
	}
}
