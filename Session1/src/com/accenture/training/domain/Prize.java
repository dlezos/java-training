package com.accenture.training.domain;

public enum Prize {
	step100(100),
	step200(200),
	step500(500),
	step1000(1000),
	step2000(2000),
	step5000(5000),
	step10000(10000),
	step20000(20000),
	step50000(50000),
	step200000(200000);
	private int step;
	
	public int getStep() {
		return step;
	}

	private Prize(int step) {
		this.step=step;
	}

}
