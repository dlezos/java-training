package com.accenture.training.main;

import com.accenture.training.domain.Answers;
import com.accenture.training.domain.Assists;
import com.accenture.training.interfaces.TheMonster;

public class MonsterEngine implements TheMonster {
	public String username;
	public String password;
	
	public String registerUser(String userName, String passWord) {
		this.username = userName;
		this.password = passWord;
		return "OK";
	}

	@Override
	public Boolean loginUser(String userName, String passWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean resetPassword(String userName, String oldPassword, String newPassword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void resetQuestions() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer resetScore(int score, boolean reset) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void startGame(String playerName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int startGame(int score, String playerName, int numberOfAssist, boolean hasAssist) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int endGame(int score, String playerName, int numberOfAssist, boolean hasAssist) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int selectQuestion(int noQuestions, String questionCategory, String question, int scoreOfQuestion,
			int questionNumber) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int displayAssistance(int noAssists, int currentNoOfAssist, boolean hasAssist, Assists assistType) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int calculateScore(int currentScore, int questionNumber) {
		// TODO Auto-generated method stub
		return 0;
	}
	

	public void UseAssist(Assists assist, Answers answer){
		switch(assist){
		case PHONE:
			//Math.random()Random rand = new Random();
			int  n = 1;//rand.nextInt(3) + 1;
			switch (n){
			case 1:
				System.out.println("I do not know");
				break;
			case 2:
				System.out.println("The answer is "+answer+" and i am positive");
				break;
			case 3:
				System.out.println("The answer is "+n+" but i am not positive");
				break;
			}
			break;
		case SPECTATORS:
			break;
		case FIFTY_FIFTY:
			break;
		default:
			break;
		}
	}
}
