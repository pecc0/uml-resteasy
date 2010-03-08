package com.musicShop.interceptors;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class ManagerControl {
	@AroundInvoke
	public Object checkManager(InvocationContext aInvocationContext) throws Exception {
		System.out.println("check the manager");
		return aInvocationContext.proceed();
	}
}