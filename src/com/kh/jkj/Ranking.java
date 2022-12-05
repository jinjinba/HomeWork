package com.kh.jkj;

// �޸��忡 �ø����� �Ϸ������� �������� �ʹ� ����� ����ű��� �ٲپ����ϴ�.

public class Ranking {
	private String name;
	private int firstScore;
	
	public Ranking() {}
	
	public Ranking(String name) {
		this.name = name;
	}
	public Ranking(int firstScore) {
		this.firstScore = firstScore;
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

	// setter �޼ҵ�
	public void setName(String name) {
		this.name = name;
	}
	public void setFirstScore(int firstScore) {
		this.firstScore = firstScore;
	}

}
