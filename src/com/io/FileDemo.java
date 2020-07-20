package com.io;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class FileDemo {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// 创建文件对象
		File file = new File("E:\\javaPro\\javaPure\\file\\test.txt");
		File file1 = new File("E:/javaPro/javaPure/test.txt");
		System.out.println(file.getName());
		// 获取文件父目录
		String parentPath = file.getParent();
		System.out.println("父目录：" + parentPath);
		File saveDirectory = new File(parentPath);
		// 目录是否存在，不存在，进行创建
		if (!saveDirectory.exists()) {
			saveDirectory.mkdirs();// 多级目录 去掉 S 是一级
		}
		try {
			// 文件不存在，进行文件创建，放入磁盘中
			boolean flag = file.createNewFile();
			System.out.println(flag);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 获取目录下面的所有文件
		File[] fileList = saveDirectory.listFiles();
		System.out.println("当前文件夹的文件：" + Arrays.toString(fileList));
		// 获取文件内容大小
		System.out.println("文件大小：" + file.length());
		// 获取文件所在路径
		System.out.println("文件的绝对路径：" + file.getAbsolutePath());
		// 文件磁盘的大小
		System.out.println("文件磁盘大小：" + file.getTotalSpace() / (1024 * 1024 * 1024) + " G");
		// 磁盘剩余空间
		System.out.println("文件磁盘剩余大小：" + file.getFreeSpace() / (1024 * 1024 * 1024) + " G");
		// 文件编辑时间
		System.out.println("文件编辑日期：" + new Date(file.lastModified()));
		// 文件的可读
		System.out.println("文件是否可都写：" + file.canRead() + " " + file.canWrite());
		
	}
}
