package com.accenture.training.domain;

public class Answers {
	

	public String answerA="";
	public String answerB="";
	public String answerC="";
	public String answerD="";

	public Answers(String answerA, String answerB, String answerC, String answerD){
		this.answerA = answerA;
		this.answerB = answerB;
		this.answerC = answerC;
		this.answerD = answerD;
	}
	
	public String getAnswerA( String answerA) {
		return answerA;
	}

	public void setAnswerA(String answerA) {
		this.answerA = answerA;
	}
	
	public String getAnswerB( String answerB) {
		return answerB;
	}

	public void setAnswerB(String answerB) {
		this.answerB = answerB;
	}
	public String getAnswerC( String answerC) {
		return answerC;
	}

	public void setAnswerC(String answerC) {
		this.answerC = answerC;
	}
	public String getAnswerD( String answerD) {
		return answerD;
	}

	public void setAnswerD(String answerD) {
		this.answerD = answerD;
	}

	@Override
	public String toString() {
		return "Answers [answerA=" + answerA + ", answerB=" + answerB + ",n answerC=" + answerC + ", answerD=" + answerD
				+ "]";
	}
	
	@Override
	public String toString() {
		return "\nA=" + answerA + "\nB=" + answerB + "\nC=" + answerC + "\nD=" + answerD + "\n";
	}
}

