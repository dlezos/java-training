package com.accenture.training.interfaces;

import com.accenture.training.domain.Answers;

public interface Question {

	public String getQuestion();
	public Answers getAnswers();
	
	/**
	 * Checks if given answer is the correct one
	 * @param givenAnswer A reference to the Answer object given
	 * @return boolean value TRUE if the answer is the correct one, false otherwise
	 */
	public boolean isAnswerCorrect(Integer answer);
}
