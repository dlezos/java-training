package com.accenture.training.test;


import static org.junit.Assert.*;

import org.junit.Test;

import com.accenture.training.domain.Game;
import com.accenture.training.main.MonsterEngine;

import junit.framework.TestCase;

public class TestOne extends TestCase {

	protected MonsterEngine initialize(){
		MonsterEngine engine = new MonsterEngine();
		engine.loadQuestions();
		return engine;
	}
	
	@Test
	public void testPlayerName() {
		MonsterEngine engine = initialize();
		Game game = engine.startGame("Dimitris");
		assertEquals("Dimitris", game.player.getfirstName());
	}

}
