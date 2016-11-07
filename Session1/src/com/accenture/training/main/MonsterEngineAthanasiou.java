package com.accenture.training.main;

import java.util.ArrayList;

import com.accenture.training.domain.Answers;
import com.accenture.training.domain.Difficulty;
import com.accenture.training.domain.questions.Question;

public class MonsterEngineAthanasiou extends MonsterEngine {

	@Override
	public boolean loadQuestions() {
		questions.clear();
		questions.add(new Question("Q1",
				new Answers("Pennsylvania.", "Pennsylvania.", "Pennsylvania.", "Pennsylvania."), Difficulty.EASY, 1));
		questions.add(new Question("Q2", new Answers("Greenland.", "Greenland.", "Greenland.", "Greenland."),
				Difficulty.EASY, 1));
		questions.add(new Question("Q3", new Answers("Amazon.", "Amazon.", "Amazon.", "Amazon."), Difficulty.EASY, 1));
		questions.add(
				new Question("Q4", new Answers("Pacific.", "Pacific.", "Pacific.", "Pacific."), Difficulty.EASY, 1));
		questions.add(new Question("Q5", new Answers("8,000 miles.", "8,000 miles.", "8,000 miles.", "8,000 miles."),
				Difficulty.EASY, 1));
		questions.add(new Question("Q6",
				new Answers("Daintree Forest north of Cairns, Australia.",
						"Daintree Forest north of Cairns, Australia.", "Daintree Forest north of Cairns, Australia.",
						"Daintree Forest north of Cairns, Australia."),
				Difficulty.EASY, 1));
		questions.add(new Question("Q7",
				new Answers("Liverpool, Glasgow, Newcastle and London.", "Liverpool, Glasgow, Newcastle and London.",
						"Liverpool, Glasgow, Newcastle and London.", "Liverpool, Glasgow, Newcastle and London."),
				Difficulty.EASY, 1));
		questions.add(new Question("Q8", new Answers("Madrid.", "Madrid.", "Madrid.", "Madrid."), Difficulty.EASY, 1));
		questions.add(new Question("Q9",
				new Answers("Czech Republic.", "Czech Republic.", "Czech Republic.", "Czech Republic."),
				Difficulty.EASY, 1));
		questions.add(new Question("Q10", new Answers("Birkenhead.", "Birkenhead.", "Birkenhead.", "Birkenhead."),
				Difficulty.EASY, 1));

		return true;
	}

}
