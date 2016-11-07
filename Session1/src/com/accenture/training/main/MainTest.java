package com.accenture.training.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import com.accenture.training.domain.Answers;
import com.accenture.training.domain.Difficulty;
import com.accenture.training.domain.Game;
import com.accenture.training.domain.questions.Question;

public class MainTest {

	public static void main(String[] args){
//		MonsterEngine engine = new MonsterEngine();
//		engine.loadQuestions();
//		Game game = engine.startGame("Dimitris");
//		int answer = 1;
//		try {
//			do {
//				System.out.println(game.getCurrentQuestion().toString()+" Earnings:"+game.prize);
//				//Get Input from user
//			} while(engine.giveAnswer(game, answer));
//		} catch(IndexOutOfBoundsException e) {
//			e.printStackTrace();
//		} catch(RuntimeException e) {
//			System.out.println(e.getMessage());
//		} finally {
//			System.out.println("Finally...");
//		}
//		System.out.println("Your earnings are: "+game.prize.getValue());
		readQuestions();
	}
	
	public static void readQuestionsStreams(){
		//read file into stream, try-with-resources
		try{
			Object[] lines = (Object[]) Files.lines(Paths.get(/*"C:\\Users\\dimitrios.lezos\\OneDrive - Accenture\\Documents\\tmp\\java-training\\Session1\\*/"Questions.txt")).toArray();
			for(int i=0; i<lines.length;){
				Question q = new Question(lines[i++].toString(), 
						new Answers(lines[i++].toString(),
								    lines[i++].toString(),
								    lines[i++].toString(),
								    lines[i++].toString()),
						Difficulty.EASY, 
						Integer.parseInt(lines[i++].toString()));
				System.out.println(q);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void readQuestions(){
		//read file into stream, try-with-resources
		try{
			File file = new File("Questions.txt");
			FileInputStream is = new FileInputStream(file);
			BufferedReader reader = new BufferedReader(new FileReader(file));
			while(reader.ready()){
				Question q = new Question(reader.readLine(), 
						new Answers(reader.readLine(),
								reader.readLine(),
								reader.readLine(),
								reader.readLine()),
						Difficulty.EASY, 
						Integer.parseInt(reader.readLine()));
				System.out.println(q);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}