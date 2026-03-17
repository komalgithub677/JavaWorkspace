package com.tka;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectClass {
//           @Before("execution (* com.tka.Recharge.*.*(..)")
//           public void beforeMain() {
//        	   System.out.println("U r Pack is Expiring Soon Plz Recharge.... !");
//           }
	
//	         @Before("execution(public void myRecharge())")
//	         public void beforeMain() {
//	        	 System.out.println("Ur pack is expiring soon plz recharge.....");
//	         }
	
//    @After("execution(public void myRecharge())")
//    public void afterMain() {
//   	 System.out.println("Ur pack is expiring soon plz recharge.....");
//    }
	
	 @Around("execution(public void myRecharge())")
	    public void aroundMain(ProceedingJoinPoint p) {
	   	 System.out.println("Ur pack is expiring soon plz recharge.....");
	   	 try {
			p.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println("Enjoy ur Data Pack.....");
	 }
	 

}



