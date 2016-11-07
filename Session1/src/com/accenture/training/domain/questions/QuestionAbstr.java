package com.accenture.training.domain.questions;

import com.accenture.training.interfaces.Answer;

public abstract class QuestionAbstr implements com.accenture.training.interfaces.Question {
	private Answer mAnswer1;
	private Answer mAnswer2;
	private Answer mAnswer3;
	private Answer mAnswer4;
	
	public QuestionAbstr(Answer ans1, Answer ans2, Answer ans3, Answer ans4) {
		this.mAnswer1 = ans1;
		this.mAnswer2 = ans2;
		this.mAnswer3 = ans3;
		this.mAnswer4 = ans4;
	}

	@Override
	public Answer getAnswerA() {
		return mAnswer1;
	}

	@Override
	public Answer getAnswerB() {
		return mAnswer2;
	}

	@Override
	public Answer getAnswerC() {
		return mAnswer3;
	}

	@Override
	public Answer getAnswerD() {
		return mAnswer4;
	}
	
}
