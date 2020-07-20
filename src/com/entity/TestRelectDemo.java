package com.entity;

import java.io.InputStream;
import java.util.UUID;

/**
 * 测试反射的引用
 * @author Rain
 *
 */
public class TestRelectDemo {
	@SuppressWarnings({ "unused", "rawtypes" })
	public static void main(String[] args) {
		System.out.println("ssssssssss");
		System.out.println(UUID.randomUUID());
		
		// 1、实例化对象 new
		UserInfo userInfo = new UserInfo();
		
		// 2、反射形式创建
		// forName方法参数为类的全路径
		try {
			UserInfo userInfo1 = (UserInfo) Class.forName("com.entity.UserInfo").newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 3、文件加载
		InputStream inputStream = TestRelectDemo.class.getClassLoader().getResourceAsStream("jdbc.properties");
		System.out.println(inputStream);
		///////////////////////获取类对象////////////////////////////////
		//创建对象
		UserInfo uInfo = new UserInfo();
		// UserInfo 的类对象
		Class class1 = UserInfo.class;
		Class class2 = uInfo.getClass();
		
		
	}
}
