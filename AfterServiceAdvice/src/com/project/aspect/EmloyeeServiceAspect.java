package com.project.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;



public class EmloyeeServiceAspect {
	
	
	public void afterAdvice() {
		System.out.println("After Executing method called After Advice....");
	}
	

}
