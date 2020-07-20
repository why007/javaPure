package com.pure;
/**
 * 
 * 
 * 	接口：
 * 		限制规范实现类中必须实现的方法
 * 			接口不可实例化
 * 			接口中没有构造函数
 * 			接口所有定义的属性或者方法都是 public 
 * @author Rain
 *
 */
public interface InterfaceDemo {
	public void add();
}
/**
 * 	常量：不能被更改
 * @author Rain
 *
 */
class Constant implements InterfaceDemo{
	
	public static void main(String[] args) {
		System.out.println("saaaaaaaaaaaaaaaaaaaaaaaaaaq");
	}

	public void add() {
		// TODO Auto-generated method stub
		
	}
	
}