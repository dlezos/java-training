package com.accenture.training.domain.questions;

import com.accenture.training.domain.Answers;
import com.accenture.training.domain.Difficulty;

public class Question implements com.accenture.training.interfaces.Question {

	private Answers answers;
	private Difficulty difficulty;
	private String question;
	private Integer correctAnswer;
	
	public int getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(Integer correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	public Difficulty getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(Difficulty difficulty) {
		this.difficulty = difficulty;
	}

	public Question(String question, Answers answers, Difficulty difficulty, Integer correctAnswer) {
		this.question = question;
		this.answers = answers;
		this.difficulty = difficulty;
		this.correctAnswer = correctAnswer;
	}

	@Override
	public String getQuestion() {
		return question;
	}

	@Override
	public Answers getAnswers() {
		return answers;
	}

	@Override
	public boolean isAnswerCorrect(Integer answer) {
		// TODO Auto-generated method stub
		return correctAnswer == answer;
	}
	@Override
	public String toString() {
		return "Question [answers=" + answers + ", difficulty=" + difficulty + ", question=" + question
				+ ", correctAnswer=" + correctAnswer + "]";
	}
	
}
