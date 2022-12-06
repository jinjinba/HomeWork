package com.kh.jkj;

// �޸��忡 �ø����� �Ϸ������� �������� �ʹ� ����� ����ű��� �ٲپ����ϴ�.

public class Ranking {
	private String name;
	private int firstScore;
	private int secondScore;
	private int thirdScore;
	
	public Ranking() {}
	
	public Ranking(String name) {
		this.name = name;
	}
	public Ranking(int firstScore, int secondScore, int thirdScore) {
		this.firstScore = firstScore;
		this.secondScore = secondScore;
		this.thirdScore = thirdScore;
	}
	
	public Ranking(String name, int firstScore) {
		this.name = name;
		this.firstScore = firstScore;
	}
	
	// getter �޼ҵ�
	public String getName() { //void �ٲ�
		return this.name;
	}
	public int getFirstScore() {
		return this.firstScore;
	}
	public int getSecondScore() {
		return this.secondScore;
	}
	public int getThirdScore() {
		return this.thirdScore;
	}

	// setter �޼ҵ�
	public void setName(String name) {
		this.name = name;
	}
	public void setFirstScore(int firstScore) {
		this.firstScore = firstScore;
	}
	public void setSecondScore(int secondScore) {
		this.secondScore = secondScore;
	}
	public void setThirdScore(int thirdScore) {
		this.thirdScore = thirdScore;
	}

}
