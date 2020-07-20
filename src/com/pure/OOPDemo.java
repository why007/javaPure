package com.pure;

import java.util.UUID;

/**
 * 面向对象实例 -> 类和对象
 * @author Rain
 *
 * java 源文件中可包含多个类
 * 单 只能有一个类是主类（public 修饰）
 * 并且主类名称必须和文件名称一致
 */
public class OOPDemo {
	public static void main(String[] args) {
		//实例化  创建电话对象
		Phone phone =  new Phone();
		//操作电话对象的属性
		phone.color = "red";
		phone.price = 1212F;
		phone.kind = "华为";
		phone.call();
		System.out.println(UUID.randomUUID().toString());
	}
}

class Phone {
	//定义类中成员变量活成员属性
	String kind;
	
	float price;
	
	String color;
	
	String shade;
	
	//定义类中成员方法
	void call(){
		System.out.println("打电话哦嗖嗖嗖嗖嗖嗖");
	}
	
	//定义发送短信
	void sendMsg(){
		System.out.println("发送邮件");
	}
}