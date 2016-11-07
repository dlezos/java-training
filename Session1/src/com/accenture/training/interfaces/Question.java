package com.accenture.training.interfaces;

public interface Question {

	public Answer getAnswerA();
	public Answer getAnswerB();
	public Answer getAnswerC();
	public Answer getAnswerD();
	
	/**
	 * Checks if given answer is the correct one
	 * @param givenAnswer A reference to the Answer object given
	 * @return boolean value TRUE if the answer is the correct one, false otherwise
	 */
	public boolean isAnswerCorrect(Answer givenAnswer);
}
