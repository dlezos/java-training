package com.accenture.training.main;

import com.accenture.training.domain.Game;

public class MainTestChristos {

	public static void main(String[] args){
		MonsterEngineChris engine = new MonsterEngineChris();
		engine.loadQuestions();
		Game game = engine.startGame("Dimitris");
		int answer = 1;
		try {
			do {
				System.out.println(game.getCurrentQuestion().toString()+"Earnings: "+game.prize.getValue()+"\n");
				//Get Input from user
			} while(engine.giveAnswer(game, game.getCurrentQuestion().getCorrectAnswer()));
		} catch(IndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch(RuntimeException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finally...");
		}
		System.out.println("Your earnings are: "+game.prize.getValue());
	}
	
}