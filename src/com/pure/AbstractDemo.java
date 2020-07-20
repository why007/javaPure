package com.pure;
/**
 * 	抽象：
 * 		就是一种想法或者概念的抽象而生成的类
 * 		抽象类和具体类是类似的
 * 		抽象类是不能被实例化的
 * 
 * 		注意：抽象方法决定类是抽象的
 * 
 * 		具体类和抽象类的区别：
 * 			抽象类不能被实例化，具体类可以实例
 * 			抽象类中可以有方法的，一个可以定义抽象的声明，具体类中只能有方法的实现，不能包括抽象的方法
 * 			抽象类中具体实现的方法必须有子类进行调用
 * @author Rain
 *
 */
public  class AbstractDemo {
	public static void main(String[] args) {
		//抽象类不可实例化
		
		Student1  student1 = new Student1();
		student1.make();
	}
}

abstract class AbstractClass{
	//属性
	//getter
	//setter
	public AbstractClass() {
		System.out.println("aaaaaaaaaaaaa  抽象类中的构造函数");
	}
	//抽象方法：在抽象类中不知道具体实现的行为
	public abstract void make() ;
}

class Student1 extends AbstractClass{

	//实现抽象类中的方法
	public void make() {
		// TODO Auto-generated method stub
		System.out.println("抽象类中方法的实现，抽象类中方法无具体实现行为");
	}
	
}