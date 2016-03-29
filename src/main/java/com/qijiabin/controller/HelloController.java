package com.qijiabin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qijiabin.service.AsyncTest;

/**
 * ========================================================
 * 日 期：2016年3月28日 上午11:35:54
 * 作 者：jiabin.qi
 * 版 本：1.0.0
 * 类说明：不带返回值的异步测试
 * TODO
 * ========================================================
 * 修订日期     修订人    描述
 */
@Controller
@RequestMapping("/hello")
public class HelloController {
	
	@Autowired
	private AsyncTest test;

	@RequestMapping({"/test","/"})
	public String list(Model model) {
		System.out.println("start...");
		test.testAsyncMethod();
		System.out.println("end...");
		model.addAttribute("data","hello world");
		return "test";
	}
	
}

