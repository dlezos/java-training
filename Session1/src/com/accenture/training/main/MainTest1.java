package com.accenture.training.main;

import javax.xml.namespace.QName;

import com.accenture.training.domain.Answers;
import com.accenture.training.domain.Difficulty;
import com.accenture.training.domain.Game;
import com.accenture.training.domain.questions.Question;

public class MainTest1 {

	public static void main(String[] args) {
		MonsterEngine engine = new MonsterEngine();
		//engine.loadQuestions();
		Game game = engine.startGame("Dimitris");
		String question1 = "Which cartoon character has the reputation of being the fastest mouse in all of Mexico?";
		Answers answers1 = new Answers("Zippy Zapata","Speedy Gonzales","Pacey Pepe","Hasty Hernandez");
		Question q1 = new Question(question1, answers1, Difficulty.EASY, 2);
		
		
		String question2 =  "What would be used to boost an electrical signal?";
		Answers answers2 = new Answers("Ambrosia","Amphitheatre","Amphetamine","Amplifier");
		Question q2 = new Question(question2, answers2, Difficulty.MEDIUM, 4);
		
		String question3 =  "A person who slavishly buys the latest clothes is a 'fashion ...'?";
		Answers answers3 = new Answers("Witness","Culprit","Suspect","Victim");
		Question q3 = new Question(question3, answers3, Difficulty.EASY, 4);
		
		String question4 =  "In sumo wrestling, what is the dohyo?";
		Answers answers4 = new Answers("Referee","Champion","Code of practice","Ring");
		Question q4 = new Question(question4, answers4, Difficulty.HARD, 4);
		
		
		String question5 =  "Which of these would you add to a cocktail called a Pink Lady?";
		Answers answers5 = new Answers("Egg white","Peach juice","Mint leaves","Sprig of celery");
		Question q5	= new Question(question5, answers5, Difficulty.HARD, 1);
		
		game.appendQuestion(q1);
		game.appendQuestion(q2);
		game.appendQuestion(q3);
		game.appendQuestion(q4);
		game.appendQuestion(q5);
		
		try {
			do {
				System.out.println(game.getCurrentQuestion().toString()+" Earnings:"+game.prize);
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