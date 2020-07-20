package com.pure;

/**
 * 继承：
 * 		子类继承父类所有的属性和方法
 * 	注意：java 类的继承是单一的继承，可支持多重继承A -> B -> C
 * 	super() 调用父类中 空构造函数 初始化 父类中的 成员变量
 * 
 * 	super（）必须放置在子类的构造函数的第一行
 * @author Rain
 *
 */
public class ExtendsDemo {
	public static void main(String[] args) {
		//测试继承
		Student student = new Student();
		student.name = "张三";
		student.sayHello();
		student.printName("李四");
		student.study();
	}
}

class Human{
	protected String name;
	
	protected String sex;
	
	public void sayHello() {
		System.out.println("sssssssssssssssss");
	}
	
	public void printName (String name) {
		System.out.println(name+" ，Hello!");
	}
}

/**
 * 学生继承  Human 类
 * @author Rain
 *
 */
class Student extends Human{
	private String stuNo;
	
	public String getStuNo() {
		return stuNo;
	}

	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}

	public void study() {
		System.out.println("ssssssssssssssss，开始学习");
	}
	
	public void sayHello() {
		System.out.println("您能女女女女女女女女女女女");
	}
}
/**
 * 老师继承  Human 类
 * @author Rain
 *
 */
class Teacher extends Human{
	private String teaId;
	
	public String getTeaId() {
		return teaId;
	}

	public void setTeaId(String teaId) {
		this.teaId = teaId;
	}

	public void teach() {
		System.out.println("ssssssssssssssss，开始上课");
	}
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("老师好");
	}
}