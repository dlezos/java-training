package com.accenture.training.main;

import java.util.ArrayList;
import java.util.List;

import com.accenture.training.domain.Answers;
import com.accenture.training.domain.Assists;
import com.accenture.training.domain.Game;
import com.accenture.training.domain.Player;
import com.accenture.training.domain.Prize;
import com.accenture.training.domain.questions.Question;
import com.accenture.training.interfaces.TheMonster;

public class MonsterEngine implements TheMonster {
	public String username;
	public String password;
	
	private List<Question> questions; 
	
	public String registerUser(String userName, String passWord) {
		this.username = userName;
		this.password = passWord;
		return "OK";
	}


	@Override
	public Game startGame(String playerName) {
		Player player = new Player(playerName, "Doe");
		List<Question> questions = new ArrayList<Question>(10);
		for(int i=0; i<10; i++){
			int ii=0;
			questions.add(this.questions.get(i));
		}
		return new Game(player, questions);
	}
	
	public Question getQuestion(Game game){
		return game.getCurrentQuestion();
	}
	
	public boolean giveAnswer(Game game, int answer){
		if(game.getCurrentQuestion().getCorrectAnswer() == answer){
			game.correctAnswer();
			return true;
		} else {
			//Set winnings
			game.prize = Prize.step0;
			return false;
		}
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
