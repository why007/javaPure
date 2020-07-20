package com.map;

import java.util.*;

/**
 * 	collection
 * @author Rain
 *
 */
/**
 * List 底层是数组，且元素是有序的可重复的
 * ArrayList （用于查询操作）-- 底层是数组
 * LinkedList（主要用于添加和删除操作）--底层是链表
 * 
 * @author Rain
 *
 */
public class MapDemo {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// 创建一个collection 对象
		Collection collection = new ArrayList();
		// 添加单一元素
		// 集合中只能引用数据类型，不能直接使用基本数据类型
		collection.add(new Integer(1000));
		collection.add("BBB");

		// 使用Arrays工具类构建一个集合
		Collection newCollection = Arrays.asList("VVV", 45.5F);
		// 添加一个集合对象到集合中
		collection.addAll(newCollection);
		System.out.println(collection);
		// 遍历
//		for (int i = 0; i < collection.size(); i++) {
//			System.out.println(collection);
//		}
		System.out.println("=====================");
		for (Object object : collection) {
			System.out.println(object);
		}
		System.out.println("=====================");
		// 迭代器 遍历
		Iterator iterator = collection.iterator();
		while (iterator.hasNext()) {
			Object obj = iterator.next();
			System.out.println(obj);
		}
		System.out.println("LIST");
		List list = new ArrayList();
		list.add("first");
		list.add(0, "AAA");
		list.addAll(Arrays.asList("ssss", "asdasd"));
		list.addAll(2, Arrays.asList("ssss", "asdasd"));
		System.out.println("LIST  for");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("LIST  for   object");
		for (Object object : list) {
			System.out.println(object);
		}
		Iterator llIterator = list.iterator();
		while (llIterator.hasNext()) {
			Object object = llIterator.next();
			System.out.println("Iterator：" + object);

		}
		System.out.println(list);

		List list2 = new LinkedList();
		list2.add("ssssss");
		list2.addAll(0, Arrays.asList("ssss", "asdasd"));
		list2.addAll(2, Arrays.asList("ssss", "asdasd"));
		System.out.println(list2);

	}
}
