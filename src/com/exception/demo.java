package com.exception;
/**
 * 常见异常：
 * 		1、NullPointerException 空指针
 * 			1）空对象调用了该对象的方法导致空指针，解决方案为 判断调用方法的对象是否为  null
 * 		2、ArithmeticException  算术异常
 * 		3、ClassNotFoundException 类不存在
 * 		4、
 * @author Rain
 *
 */
public class demo {
	@SuppressWarnings({ "null", "unused" })
	public static void main(String[] args)  {
		String nameString = null;
		int a = 1;
		try {
			System.out.println(nameString.toString());
			int b = a / 0;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			e.printStackTrace();
		} finally {
			
			System.out.println("sssssssss");
		}
	}

}
