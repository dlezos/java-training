package com.accenture.training.domain;

public enum Prize {
	step1(100),
	step2(200);
	//,200, 500, 1000, 2000, 5000,	10000, 20000, 50000, 200000;
	private int step;
	
	public int getStep() {
		return step;
	}

	private Prize(int step) {
		this.step=step;
	}
	
	public static void main(String[] args) {

		Prize prize= Prize.step1;
		System.out.print(prize.getStep());

	}

}
