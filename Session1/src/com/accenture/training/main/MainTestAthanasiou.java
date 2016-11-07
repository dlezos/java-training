package com.accenture.training.main;

import com.accenture.training.domain.Game;

public class MainTestAthanasiou {

	public static void main(String[] args) {
		MonsterEngine engine = new MonsterEngine();
		engine.loadQuestions();
		Game game = engine.startGame("Giannis");
		int answer = 1;
		try {
			for (int i = 0; engine.giveAnswer(game, answer); i++) {
				System.out.println(">>> Question #"+(i+1)+":");
				System.out.println("\""+game.getCurrentQuestion().getQuestion()+"\"");
				System.out.println("Answer Given: #"+answer+", ");
				System.out.println(game.getCurrentQuestion().getQuestion()+" | Earnings: "+game.prize.getValue());
				
				System.out.println("--------------------------------------------------------------- ");
			}
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finally...");
		}
		System.out.println("Your earnings are: " + game.prize.getValue());
	}
}
