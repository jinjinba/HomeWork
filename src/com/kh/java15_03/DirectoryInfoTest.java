package com.kh.java15_03;

import java.io.File;

public class DirectoryInfoTest {
	static int totalFiles = 0;
	static int totalDirs = 0;
	static int totalSize = 0;

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("USAGE : java DirectoryInfoTest DIRECTORY");
			System.exit(0);
		}

		File dir = new File(args[0]);

		if (!dir.exists() || !dir.isDirectory()) {
			System.out.println("��ȿ���� ���� ���丮�Դϴ�.");
			System.exit(0);
		}

		countFiles(dir);
		System.out.println();
		System.out.println("�� " + totalFiles + "���� ����");
		System.out.println("�� " + totalDirs + "���� ���丮");
		System.out.println("ũ�� " + totalSize + " bytes");
	} 

	////////////////////// Ǯ�� //////////////////////////
	public static void countFiles(File dir) {		// countFiles
//		  	1. dir�� ���ϸ��(File[])�� ���´�
		File[] files = dir.listFiles();

		for (int i = 0; i < files.length; i++) {
//			2. ���� ���ϸ���� ���� �߿��� ���丮�̸� totalDirs�� ���� ������Ű�� countFiles()�� ���ȣ���Ѵ�.
			if (files[i].isDirectory()) {
				totalDirs++;
				countFiles(files[i]);
			} else if (files[i].isFile()) {
//			3.�����̸� totalFiles�� ������Ű�� ������ ũ�⸦ titakSize�� ���Ѵ�.
				totalFiles++;
				totalSize += files[i].length();
			}
		}
	} 
}
