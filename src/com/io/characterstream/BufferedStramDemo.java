package com.io.characterstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStramDemo {
	final static String filePath = "E:/javaPro/javaPure/file/test.txt";
	public static void main(String[] args) {
		writer();
		read();
	}
	private static void writer() {
		try {
			//  创建字符串缓冲输入输出流对象
			BufferedWriter bWriter = new BufferedWriter(new FileWriter(filePath));
			bWriter.write("Jintian       sssssss");
			bWriter.newLine();
			bWriter.write("换行学习  ！！！！！！！！sss");
			bWriter.flush();
			bWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void read()  {
		BufferedReader bReader;
		try {
			bReader = new BufferedReader(new FileReader(filePath));
//			bReader.readLine();
			System.out.println(bReader.readLine());
			System.out.println(bReader.readLine());
			bReader.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
