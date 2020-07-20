package com.generic;
/**
 * 	泛型集合：
 * 
 * @author Rain
 *
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class GenericDemo {
	@Test
	public void testNoGeneric() {
		// TODO Auto-generated method stub
		// 
//		List list = new ArrayList();
//		list.add("AA");
//		list.add("BB");
//		for (int i = 0; i < list.size(); i++) {
//			Object obj = list.get(i);
//			String value = (String) obj;
//			System.out.println(value);
//		}
//		
//		for (Object object : list) {
//			System.out.println(object);
//		}
		//  泛型集合： 可变长度的类型数组
		List<String> list = new ArrayList<String>();
		list.add("AA");
		list.add("BB");
		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			String value = (String) obj;
			System.out.println(value);
		}
		
		for (Object object : list) {
			System.out.println(object);
		}
		//			泛型  map 集合
		Map<String, String> map  = new HashMap<String, String>();
		map.put("one", "aaaaaaaaa");
		map.put("two", "bbbbbbbb");
		
		//增强 for 循环遍历，
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry);	
			System.out.println("key="+entry.getKey());			
			System.out.println("value="+entry.getValue());			
		}
	}
}
