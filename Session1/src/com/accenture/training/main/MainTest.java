package com.accenture.training.main;

import com.accenture.training.domain.Game;

public class MainTest {

	public static void main(String[] args){
		MonsterEngine engine = new MonsterEngine();
		Game game = engine.startGame("Dimitris");
		int answer = 2;
		do {
			System.out.println(game.getCurrentQuestion().toString());
			//Get Input from user
		} while(engine.giveAnswer(game, answer));
		System.out.println("Your earnings are: "+game.prize);
	}
	
}