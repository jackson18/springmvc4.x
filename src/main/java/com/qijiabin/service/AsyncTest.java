package com.qijiabin.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * ========================================================
 * 日 期：2016年3月28日 下午2:26:46
 * 作 者：jiabin.qi
 * 版 本：1.0.0
 * 类说明：不带返回值的异步测试
 * TODO
 * ========================================================
 * 修订日期     修订人    描述
 */
@Component
public class AsyncTest {
    
    @Async
    public void testAsyncMethod(){
    	System.out.println("在做发送准备工作中");  
    	try {  
    		Thread.sleep(10000);  
    	} catch (InterruptedException e) {  
    		e.printStackTrace();  
    	}  
    	System.out.println("异步发送完毕");  
    }
    
}

