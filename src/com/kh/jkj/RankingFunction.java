package com.kh.jkj;

import java.util.Scanner;

public class RankingFunction {
	Ranking [] rankings;	// �迭����
	
	public RankingFunction() {
		rankings = new Ranking[3];	// �迭�Ҵ�
	}
	
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== �̿� ��ȸ ��� Ȯ�� ���α׷� =====");
		System.out.println("1. �̿�� ���� �Է�");
		System.out.println("2. �̿�� ���� ���");
		System.out.println("3. ��� Ȯ��");
		System.out.println("4. ���α׷� ����");
		System.out.println("�޴� �Է� : ");
		int menu = sc.nextInt();
		return menu;
	}
	public void inputScore() {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < rankings.length; i++) {
			System.out.println("=====" + (i+1) + " ��° �̿�� ���� �Է� =====");
			System.out.println("�̿�� �̸� �Է� : ");
			String name = sc.next();
			System.out.println(name + "�̿���� 1�� ���� �Է� : ");
			int firstScore = sc.nextInt();
			System.out.println(name + "�̿���� 2�� ���� �Է� : ");
			int secondScore = sc.nextInt();
			System.out.println(name + "�̿���� 3ġ ���� �Է� : ");
			int thirdScore = sc.nextInt();
			rankings[i] = new Ranking();
			rankings[i].setName(name);
			rankings[i].setFirstScore(firstScore);
			rankings[i].setSecondScore(secondScore);
			rankings[i].setThirdScore(thirdScore);
		}	
	}	
	public void printScore() {
		for(int i = 0; i < rankings.length; i++) {
			System.out.println("=====" + rankings[i].getName() + "�̿�� ���� ��� =====");
			System.out.println(rankings[i].getName() + "�̿���� ����");
			System.out.println("1�� ���� : " + rankings[i].getFirstScore() + " 2�� ���� : " + rankings[i].getSecondScore() + " 3�� ���� : " + rankings[i].getThirdScore());
		}
	}
	public void checkPass() {
		int[] rank = new int[3];
		System.out.println("===== �̿� ��ȸ ���� =====");
			 for(int i = 0 ; i < 3 ; i++){
				   for(int j = 0 ; j < 3 ; j++){
					   if(rankings[i].getFirstScore() + rankings[i].getSecondScore() + rankings[i].getThirdScore() < rankings[j].getFirstScore() + rankings[j].getSecondScore() + rankings[j].getThirdScore()) {
						   rank[i] = rank[i] + 1;
					   }
				   }
			 }
				  for(int i = 0 ; i < 3 ; i++){
				   System.out.println("�̿�� " + rankings[i].getName() + "���� ������ " + (rank[i] + 1) + "���Դϴ�.");
				  }
		
	}
}
