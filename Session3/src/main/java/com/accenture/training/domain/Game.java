package com.accenture.training.domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.accenture.training.domain.Question;

public class Game {
	
	public Player player;
	public Prize prize;
	int currentQuestion;
	Assists assists;
	List<Question> questions = null;
	//Question[] questionsArray = new Question[10];
	
	public Game(Player player, List<Question> questions){
		this.player = player;
		this.questions = new ArrayList<Question>(10);
		this.questions.addAll(questions);
		this.prize = prize.step0;
		this.currentQuestion = 0;
	}
	
	public void addQuestions(List<Question> newQuestions){
		if(questions == null){
			questions = new ArrayList<Question>(10);
		}
		questions.clear();
		questions.addAll(newQuestions);
	}
	
	public void appendQuestion(Question question){
		questions.add(question);
	}
	
	public Question getCurrentQuestion(){
		return questions.get(currentQuestion);
	}
	
	public void generateQuestions(){
	}

	public void printAllQuestions(){
		for(int i=0; i<questions.size(); i++){
			System.out.println(questions.get(i).getQuestion());
		}
		for(Question q: questions){
			System.out.println(q.getQuestion());
		}
		Iterator<Question> iter = questions.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next().getQuestion());
		}
	}
	
	public void correctAnswer(){
		if(currentQuestion >= 9){
			this.prize = Prize.step200000;
			throw new RuntimeException("You won!");
		}
		this.currentQuestion++;
		this.prize = Prize.getPrize(prize.getStep()+1);
	}
}
