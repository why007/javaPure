package com.io.btyestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 字节流
 * 
 * @author Rain
 *
 */
public class StreamDemo {
	public static void main(String[] args) {
		writeFile();
		readFile();
	}

	private static void readFile() {
		InputStream input = null;
		try {
			//  创建文件输入流对象
			input = new FileInputStream("E:\\javaPro\\javaPure\\file\\test.txt");
			//  获取当前文件的可用大小
			int len = input.available();
			//  读取文件内容
			//  定义存储读取文件内容的的缓冲区
			byte[] b = new byte[len];
			input.read(b, 0, b.length);
			//  把字节数组转换成字符串
			String contentString = new String(b);
			System.out.println(contentString);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				input.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static void writeFile() {
		// 创建文件对象
//		File file = new File("E:\\javaPro\\javaPure\\file\\test.txt");
		OutputStream out = null;
		try {
			out = new FileOutputStream("E:\\javaPro\\javaPure\\file\\test.txt");
			String string = "学会使用文件输出流aa";
			// 把一个字符串转换成一个字节数组
			byte[] b = string.getBytes();
			out.write(b, 0, b.length);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 关闭文件流
			try {
				out.flush();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
