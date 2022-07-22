package kr.ac.kopo.framework;

import java.lang.reflect.Method;

public class CtrlAndMethod {
	


	public CtrlAndMethod() {
		super();
		// TODO Auto-generated constructor stub
	}

	private Object target;
	private Method method;
	
	public CtrlAndMethod(Object target, Method method) {
		super();
		this.target = target;
		this.method = method;
	}

	public Object getTarget() {
		return target;
	}
	
	public Method getMethod() {
		return method;
	}

	

}
