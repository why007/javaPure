package com.pure;

import java.util.UUID;

/**
 * 
 * 类中构造函数
 * 定义 与类的名称同名
 * 构造函数的作用：
 * 		初始化类中成员变量
 * 
 * @author Rain
 *
 */
public class OOP_Class_Contruc {
	public static void main(String[] args) {

		System.out.println(UUID.randomUUID().toString());
		//实例化  创建电话对象
		TelPhone phone =  new TelPhone();
		//操作电话对象的属性
		phone.color = "red";
		phone.price = 1212F;
		phone.kind = "华为";
		phone.call();

	}
}

class TelPhone {
	//定义类中成员变量活成员属性
	String kind;
	
	float price;
	
	String color;
	
	String shade;
	
	//当前定义一个类的时候会默认创建一个无参的构造函数
	TelPhone(){
		System.out.println("无参的构造函数");
	}
	
	void call(){
		System.out.println("打电话哦嗖嗖嗖");
	}
	
	//定义发送短信
	void sendMsg(){
		System.out.println("发送邮件");
	}
}