package com.example.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecample.serviceif.BeanIOServiceIf;
import com.example.bean.TestObjectBean;

@Service
@Transactional
public class BeanIOService implements BeanIOServiceIf {
	
	
	/**
	 * beanの中身をコンソールに表示するだけの無駄
	 * @param bean
	 */
	public void outputBean(TestObjectBean bean) {
		
		System.out.println("testInteger = " + bean.getTestInteger());
		
		System.out.println("testString = " + bean.getTestString());

		System.out.println("testScndInteger = " + bean.getTestScndInteger());
		
		System.out.println("testScndString = " + bean.getTestScndString());
		
		System.out.println(bean);
	}
	
	/**
	 * beanの中身をコンソールに入力するだけの無駄
	 * @param bean
	 */
	public void inputBean(TestObjectBean bean) {
	
		bean.setPid(Integer.valueOf(1));
		
		bean.setTestInteger(Integer.valueOf(2));
		
		bean.setTestString("3");

		bean.setTestScndInteger(Integer.valueOf(4));
		
		bean.setTestScndString("5");
		
	}
}
