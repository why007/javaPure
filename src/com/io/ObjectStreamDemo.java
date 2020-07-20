package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

/**
 * 对象流：
 * 	序列化流：
 * 		
 * 	反序列化流：
 * @author Rain
 *
 */
public class ObjectStreamDemo {
	final static String filePath = "E:/javaPro/javaPure/file/text.txt";
	@SuppressWarnings({ "unchecked", "unused" })
	public static void main(String[] args) {
		//////////////// 序列化  //////////////////
		//  创建  Person 对象
		Person person = new Person("张三",20);
		//  创建集合
		List<Person> listPersons = new ArrayList<Person>();
		listPersons.add(new Person("ssss",30));
		listPersons.add(new Person("李四",39));
		try {
			//  创建对象的输出流---序列化流
			ObjectOutput out = new ObjectOutputStream(new FileOutputStream(filePath));
			//  序列化对象
			//  java.io.NotSerializableException 
//			out.writeObject(person);
			out.writeObject(listPersons);
			out.flush();
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//////////////// 反序列化  //////////////////
	//  创建  Person 对象
		try {
			//  创建对象的输出流---序列化流
			ObjectInput out = new ObjectInputStream(new FileInputStream(filePath));
			//  序列化对象
			//  java.io.NotSerializableException 
//			Person person1 = (Person) out.readObject();
//			System.out.println(person1.getName() + "::" + person1.getAge());
			List<Person> list = (List<Person>) out.readObject();
			for (Person person2 : list) {
				System.out.println(person2.getName() + "::" + person2.getAge());
				
			}
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}

@SuppressWarnings("serial")
class Person implements Serializable{
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
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
}