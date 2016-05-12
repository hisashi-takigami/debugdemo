package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.bean.TestObjectBean;
import com.example.service.BeanIOService;
import com.example.service.TestService;

@Controller
@RequestMapping("testController")
public class TestController {
	@Autowired
	TestService testService;

	@Autowired
	BeanIOService beanIOService;

	@RequestMapping("/")
	public String test() {
		return testService.testMethod();

	}

	@RequestMapping("/view")
	public void view() {
		TestObjectBean bean = new TestObjectBean();
		
		for (int i = 0;i < 10; i++) {
			beanIOService.inputBean(bean);
		}
		beanIOService.outputBean(bean);
		
	}
	
	@RequestMapping("/npe")
	public void npe() {
		
		
		if (nullPointer() == 0) {
			System.out.println("ぬるぽ回避");
		}
	}
	
	public Integer nullPointer() {
		
		return 0;
	}
	
	@RequestMapping("/ex")
	public void ex() {
		
		try {
			// ここで例外を発声させる
			System.out.println("ただただ表示するだけ");
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}
}
