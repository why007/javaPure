package com.arrays;

import java.util.*;

import org.junit.Test;

/**
 * Arrays常用方法
 * asList				//把数组转换为一个 List 的集合
 * binarySearch
 * copyOf
 * copyOfRange
 * sort
 * toString
 * deepToString
 * equals
 * deepEquals
 * fill
 * @author Rain
 *
 */
public class ArraysDemo {
	@SuppressWarnings("rawtypes")
	@Test
	public void testAsList() {
		// TODO Auto-generated method stub
		// 通过类名.方法（） 调用的方法是静态方法
		List list = Arrays.asList("AA","bb");
		System.out.println(list);
	}
	
	@Test
	public void testBinarySearch() {
		// 通过类名.方法（） 调用的方法是静态方法
		// Double.valueOf(3.4) 装箱为一个 double 类
		String[] list = {"BBB","ssss","111","asda"};
		// 检索整个数组查询元素的所在的索引
		System.out.println(list[1]);
		int index = Arrays.binarySearch(list, "111");
		System.out.println(index);
	}
	@Test
	public void testCopyOf() {
		// TODO Auto-generated method stub
		String[] list = {"BBB","ssss","111","asda"};
		String[] copyOf = Arrays.copyOf(list, 6);
		System.out.println(Arrays.toString(copyOf));
	}
}
