package com.qijiabin.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;

/**
 * ========================================================
 * 日 期：2016年3月28日 下午2:27:33
 * 作 者：jiabin.qi
 * 版 本：1.0.0
 * 类说明：带返回值的异步测试，包含对异步的处理
 * TODO
 * ========================================================
 * 修订日期     修订人    描述
 */
@Service  
@Async  
public class AsyncService {  
  
    public void throwException() {  
        throw new RuntimeException("执行发生异常。。。");  
    }  
    
    /**
     * 返回值必须是ListenableFuture/Future
     * @return
     */
    public ListenableFuture<String> asyncGet2() {  
//    	throwException();
    	try {
    		Thread.sleep(10000);
    	} catch (InterruptedException e) {
    		e.printStackTrace();
    	}
        return new AsyncResult<String>("123");  
    }  
  
}  

