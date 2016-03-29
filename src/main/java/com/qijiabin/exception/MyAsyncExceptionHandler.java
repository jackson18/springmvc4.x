package com.qijiabin.exception;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;

import java.lang.reflect.Method;

/**
 * ========================================================
 * 日 期：2016年3月28日 下午2:28:05
 * 作 者：jiabin.qi
 * 版 本：1.0.0
 * 类说明：异步处理类
 * TODO
 * ========================================================
 * 修订日期     修订人    描述
 */
public class MyAsyncExceptionHandler implements AsyncUncaughtExceptionHandler {

    @Override
    public void handleUncaughtException(Throwable throwable, Method method, Object... args) {
        System.out.println("调用异步任务出错了, message : " + throwable.getMessage());
    }
}