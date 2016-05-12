package com.example.entity;

/**
 * @author takigami
 * TestObjectエンティティ
 */
public class TestObject {

	/* pid */
	private Integer pid;

	/* Integerテストフィールド */
	private Integer testInteger;

	/* Stringテストフィールド */
	private String testString;

	/**
	 * @return pid
	 */
	public Integer getPid() {
		return pid;
	}

	/**
	 * @param pid
	 *            セットする pid
	 */
	public void setPid(Integer pid) {
		this.pid = pid;
	}

	/**
	 * @return testInteger
	 */
	public Integer getTestInteger() {
		return testInteger;
	}

	/**
	 * @param testInteger
	 *            セットする testInteger
	 */
	public void setTestInteger(Integer testInteger) {
		this.testInteger = testInteger;
	}

	/**
	 * @return testString
	 */
	public String getTestString() {
		return testString;
	}

	/**
	 * @param testString
	 *            セットする testString
	 */
	public void setTestString(String testString) {
		this.testString = testString;
	}

}
