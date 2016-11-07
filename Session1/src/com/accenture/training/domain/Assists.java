package com.accenture.training.domain;

public enum Assists {
	PHONE,
	SPECTATORS,
	FIFTY_FIFTY;
}

public AssistSelect(Assists assist answer) {
	this.assist=assist;
	this.answer=answer
}

public void UseAssist(){
	switch(assist){
	case PHONE:
		Random rand = new Random();
		int  n = rand.nextInt(3) + 1;
		switch (n){
		case 1:
			System.out.println("I do not know");
			break;
		case 2:
			System.out.println("The answer is "+answer+" and i am positive")
			break;
		case 3:
			Random rand1 = new Random();
			char c = (char) (rand1.nextInt(4) + 'a');
			System.out.println("The answer is "+c+" but i am not positive")
			break;
	case SPECTATORS:
		
		}
	}
}