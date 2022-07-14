package kr.ac.kopo.controller;

import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;


public class HandlerMapping {

	private Map<String, Controller> mappings = new HashMap<>();
	
	
	
	public HandlerMapping(String propLocation) {
		
		Properties prop = new Properties();
		
		
		try {
//			InputStream is = new FileInputStream("D:\\Lecture\\web-workspace\\Mission-MVC\\bean.properties");
			InputStream is = new FileInputStream(propLocation);
			prop.load(is);
			
//			System.out.println(prop.getProperty("board/list.do"));
			
			
			
			Set<Object> keys = prop.keySet();
			
			
			for(Object key : keys) {
				System.out.println(key);
				String className = prop.getProperty(key.toString());
//				System.out.println(className);
				
				Class<?> clz = Class.forName(className);
				Constructor<?> constructor = clz.getConstructor();
				mappings.put(key.toString(), (Controller)constructor.newInstance());
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		/*
		mappings.put("/board/list.do", new BoardListController());
		mappings.put("/board/writeForm.do", new BoardWriteFormController());
		mappings.put("/board/write.do", new BoardWriteController());
		mappings.put("/board/detail.do" , new BoardDetailController());
		*/
	}


	public Controller getController(String uri) {
		
		return mappings.get(uri);
		
	}
	
	public static void main(String[] args) throws Exception{
		
		Class<?> clz = Class.forName("kr.ac.kopo.controller.BoardListController");
		BoardListController obj = (BoardListController)clz.newInstance();
		System.out.println(obj.handleRequest(null, null));
		
		
		/*
		Class<?> clz = Class.forName("java.util.Random");
		java.util.Random r = (java.util.Random) clz.newInstance();
		int random = r.nextInt(10) + 1;
		System.out.println(random);
		*/
		
		/*
		java.util.Random r = new java.util.Random();
		int random = r.nextInt(10) + 1;
		System.out.println(random);
		 */
	}
}
