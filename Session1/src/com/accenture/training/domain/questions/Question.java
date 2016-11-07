package com.accenture.training.domain.questions;

import com.accenture.training.domain.Answers;
import com.accenture.training.domain.Difficulty;

public class Question implements com.accenture.training.interfaces.Question {
	private Answers mAnswer1;
	private Answers mAnswer2;
	private Answers mAnswer3;
	private Answers mAnswer4;
	private Difficulty difficulty;
	private String question;
	private int correctAnswer;
	
	public int getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(int correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	public Difficulty getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(Difficulty difficulty) {
		this.difficulty = difficulty;
	}

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

	@Override
	public String getQuestion() {
		return question;
	}
	
	public void setQuestion(String question){
		this.question = question;
	}

	@Override
	public boolean isAnswerCorrect(Answers givenAnswer) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
