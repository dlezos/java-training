package com.accenture.training.main;

import com.accenture.training.domain.Game;

public class MainTest {

	public static void main(String[] args){
		MonsterEngine engine = new MonsterEngine();
		engine.loadQuestions();
		Game game = engine.startGame("Dimitris");
		int answer = 1;
		try {
			do {
				System.out.println(game.getCurrentQuestion().toString()+" Earnings:"+game.prize);
				//Get Input from user
			} while(engine.giveAnswer(game, answer));
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