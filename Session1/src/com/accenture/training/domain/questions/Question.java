package com.accenture.training.domain.questions;

import com.accenture.training.domain.Answers;

public abstract class Question implements com.accenture.training.interfaces.Question {
	private Answers mAnswer1;
	private Answers mAnswer2;
	private Answers mAnswer3;
	private Answers mAnswer4;
	
	public Question(Answers ans1, Answers ans2, Answers ans3, Answers ans4) {
		this.mAnswer1 = ans1;
		this.mAnswer2 = ans2;
		this.mAnswer3 = ans3;
		this.mAnswer4 = ans4;
	}

	@Override
	public Answers getAnswerA() {
		return mAnswer1;
	}

	@Override
	public Answers getAnswerB() {
		return mAnswer2;
	}

	@Override
	public Answers getAnswerC() {
		return mAnswer3;
	}

	@Override
	public Answers getAnswerD() {
		return mAnswer4;
	}
	
}
