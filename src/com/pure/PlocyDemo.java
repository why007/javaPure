package com.pure;

/**
 * 	多态：
 * 		定义：一种事物的多种表现形态
 * 		表现：
 * 			方法的重写（overload）：子类重写父类中同名的方法【表现在继承中】
 * 			方法的重载（override）：在同一个类中存在同名，参数、个数和参数类型不同的方法，与返回值无关
 * @author Rain
 *
 */
public class PlocyDemo {
	public static void main(String[] args) {
		// 父类引用子类的实例
		Human stu = new Student();
		
		Human tea = new Teacher();
		
		sayHello(stu);
		
		sayHello(tea);
		
	}
	/**
	 * 	定义文号的方法
	 */
	public static void sayHello(Human human) {
		human.sayHello();
	}
}
