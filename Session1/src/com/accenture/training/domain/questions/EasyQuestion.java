package com.accenture.training.domain.questions;
import com.accenture.training.domain.Answers;

public class EasyQuestion extends Question {

	public EasyQuestion(Answers ans1, Answers ans2, Answers ans3, Answers ans4) {
		super(ans1, ans2, ans3, ans4);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isAnswerCorrect(Answers givenAnswer) {
		// TODO Auto-generated method stub
		return false;
	}

}
