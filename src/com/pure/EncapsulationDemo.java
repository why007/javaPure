package com.pure;

public class EncapsulationDemo {
	/**
	 * 封装的意思：
	 * 		定义：隐藏类中功能实现的细节
	 * 		作用：保证类中成员方法或属性的安全
	 * 			限制对类中属性的直接操作
	 * 
	 * 封装：
	 * 		将类中的属性私有化
	 * 		提供对应属性的getter、setter方法
	 * 		共享类中外部可以使用的方法
	 */
	
	public static void main(String[] args) {
		
	}
	
}
class People{
	private String name;
	
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * 设置供外部设置名称的方法
	 * 
	 */
	
	public void Strgin(String name) {
		
	}
}
