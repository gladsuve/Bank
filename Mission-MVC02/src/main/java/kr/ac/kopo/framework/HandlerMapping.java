package kr.ac.kopo.framework;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import kr.ac.kopo.framework.annotation.RequestMapping;

public class HandlerMapping {
	
	private Map<String, CtrlAndMethod> mappings;

	public HandlerMapping(String ctrlNames) throws Exception {
		
		/*
		  kr.ac.kopo.board.controller.BoardController
		  kr.ac.kopo.login,controller.LoginController
		 */
		
		mappings = new HashMap<>();
		
		System.out.println(ctrlNames);
		String[] ctrls = ctrlNames.split("\\|");
		for(String ctrl : ctrls) {
//			System.out.println(ctrl);
			Class<?> clz = Class.forName(ctrl);
			Constructor<?> constructor = clz.getConstructor();
			Object target = constructor.newInstance();
			
			Method[] methods = clz.getMethods();
			for(Method method : methods) {
//				System.out.println(method);
				
				RequestMapping reqAnno = method.getAnnotation(RequestMapping.class);
//				System.out.println("reqAnno : " + reqAnno);
				
				if(reqAnno != null) {
//					System.out.println(method);
					String uri = reqAnno.value();
//					System.out.println(uri);
					mappings.put(uri, new CtrlAndMethod(target, method));
				}
			}
			
		
		}
	}
	
	public CtrlAndMethod getCtrlAndMethod(String uri){
		return mappings.get(uri);
		
	}
}
