package com.project.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import com.project.service.EmployeeService;

@Aspect
public class NewAspect {

	
	
	@After("within(com.project.service.EmployeeService)")
	public void afterAdvice(JoinPoint joinPoint) {
		System.out.println("After Executing method called set After Advice...."+joinPoint.toString());
	}
	
	@AfterReturning(pointcut = "execution(public String getEmpName())", returning="returnString")
	public void afterAdvice1() {
		System.out.println("After Executing method called get After Advice.... ");
	}
	
	@AfterThrowing(value = "execution(public void throwException())")
	public void afterAdvice2() {
		System.out.println("After Throwing Exception ");
	}
}
