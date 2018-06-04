package com.ch3;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

//@Service
public class AsyncTaskService {
	
	//@Async
	public void exacuteAsyncTask(Integer i) {
		System.out.println(Thread.currentThread().getName()+"执行异步任务1: "+i);
	}
	
	//@Async
	public void executeAsyncPlus(Integer integer) {
		System.out.println(Thread.currentThread().getName()+"执行异步任务2:"+(integer+1));
	}
}
