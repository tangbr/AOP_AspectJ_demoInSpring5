package com.atguigu.spring5.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class PersonProxy {

	//相同切入点抽取
	@Pointcut(value = "execution(* com.atguigu.spring5.aopanno.User.add(..))")
	public void pointdemo() {
		
	}
	
	//前置通知
	@Before(value = "pointdemo()")
	public void before() {
		System.out.println("Person before.....");
	}
	
}
