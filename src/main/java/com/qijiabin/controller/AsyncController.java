package com.qijiabin.controller;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qijiabin.service.AsyncService;

/**
 * ========================================================
 * 日 期：2016年3月28日 下午2:28:29
 * 作 者：jiabin.qi
 * 版 本：1.0.0
 * 类说明：带返回值的异步测试
 * TODO
 * ========================================================
 * 修订日期     修订人    描述
 */
@Controller
@RequestMapping("/async")
public class AsyncController {

	@Autowired
	private AsyncService asyncService;
	
	@RequestMapping({"/test","/"})
	public String list(Model model) throws InterruptedException, ExecutionException {
		System.out.println("start...");
		
		ListenableFuture<String> listenableFuture = asyncService.asyncGet2();  
        ListenableFutureCallback<String> listenableFutureCallback = new ListenableFutureCallback<String>() {
            @Override
            public void onFailure(Throwable throwable) {
                System.out.println("异步回调失败了, exception message : " + throwable.getMessage());
            }
            @Override
            public void onSuccess(String str) {
                System.out.println("异步回调成功了, return : " + str);
            }
        };
        listenableFuture.addCallback(listenableFutureCallback);
		
		System.out.println("end...");
		model.addAttribute("data", "async");
		return "async";
	}
	
}

