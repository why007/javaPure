package com.io.characterstream;

import java.io.*;

/**
 * 字符流
 * 
 * @author Rain
 *
 */
public class CharcterDemo {
	public static void main(String[] args) {
		readFile();
		writeFile();
	}

	private static void writeFile() {
		Reader reader = null;
		
		try {
			File file = new File("E:/javaPro/javaPure/file/test.txt");
			int len = (int) file.length();
			reader = new FileReader("E:/javaPro/javaPure/file/test.txt");
			//  获取读取文件内容大小
			//  定义一个 存储读取文件内容的缓冲区
			char[] cbuf = new char[len];
			reader.read(cbuf, 0, cbuf.length);
			String contentString = new String(cbuf);
			
			System.out.println(contentString);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static void readFile() {
		// 创建文件的输出流
		Writer reader = null;
		try {
			reader = new FileWriter("E:/javaPro/javaPure/file/test.txt");
			reader.write("sssssssssss阿萨德啊\n看升级打开嗖嗖嗖嗖嗖嗖");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
