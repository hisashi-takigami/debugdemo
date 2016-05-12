package com.example.bean;

import com.example.entity.TestObject;

/**
 * @author takigami
 * TestObject参照用Bean
 */
public class TestObjectBean extends TestObject {
	
	/* Integerテストフィールド2 */
	private Integer testScndInteger;

	/* Stringテストフィールド */
	private String testScndString;
	
	/**
	 * @return testInteger2
	 */
	public Integer getTestScndInteger() {
		return testScndInteger;
	}

	/**
	 * @param testInteger2 セットする testInteger2
	 */
	public void setTestScndInteger(Integer testScndInteger) {
		this.testScndInteger = testScndInteger;
	}

	/**
	 * @return testString2
	 */
	public String getTestScndString() {
		return testScndString;
	}

	/**
	 * @param testString2 セットする testString2
	 */
	public void setTestScndString(String testScndString) {
		this.testScndString = testScndString;
	}

	

}
