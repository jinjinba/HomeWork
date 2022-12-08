package com.kh.java15_01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileHead {

	public static void main(String[] args) {
		try {
			int lineNum = Integer.parseInt(args[0]);
			String fileName = args[1];
			
			File f = new File(fileName);
			// �۾��� �ϱ⿡ �ռ� ����ڷκ��� �Է¹��� �̸��� ������ �����ϴ���, ���丮�� �ƴ��� Ȯ���ؾ���
			if (f.exists() && !f.isDirectory()) {
				BufferedReader br = new BufferedReader(new FileReader(fileName));
				// ������ ���δ����� �б� ���� BufferedReader�� readLine()�� ���
				String line = "";
				int i = 1;
				while ((line = br.readLine()) != null && i <= lineNum) {
					System.out.println(i + ":" + line);
					i++;
				}
			} else {
				throw new FileNotFoundException(fileName + "��/�� ���丮�̰ų�, �������� �ʴ� �����Դϴ�.");
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("USAGE: java FileHead 10 FILENAME");
		}
	} 

}
