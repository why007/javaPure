package com.array;
/**
 * 	数组：
 * 		存储同一类型元素的集合（类型 [ 基本数据类型 | 引用数据类型 ] ）
 * 	数组定义：数据类型【】 数据名称 = null；对象句柄
 * 	数据初始化：
 * 	数组遍历方式：
 * 	数组长度：
 * 	数组拷贝：
 * 	多维数组：
 * @author Rain
 *
 */
@SuppressWarnings({ "unused" })
public class Demo1 {
	public static void main(String[] args) {
		String[] nmStrings = null;  // 数组句柄
		///////////////////数组初始化//////////////////////
		nmStrings = new String[3]; // 33 代表数组的可容纳的元素个数
		int ages[] = new int[3];
		int[] age = new int[3];
		
		/**
		 * 	二维数组
		 * 
		 */
		int[][] table = new int[3][4];
		
		int[][] table1 = {{1,2,3},{2,3,4},{3,4,5}};
		for (int i = 0; i < table1.length; i++) {
			for (int j = 0; j < table1.length; j++) {
				System.out.print(table1[i][j]);
			}
			System.out.println(" ");
		}
		
	}
}	
