package com.accenture.training.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.accenture.training.domain.Game;
import com.accenture.training.main.MonsterEngine;

public class TestAthanasiou {
	
	MonsterEngine engine;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.engine = new MonsterEngine();
		engine.loadQuestions();
	}

	@Test
	public void testPlayerName() {
		Game game = engine.startGame("Giannis");
		assertEquals("Giannis", game.player.getfirstName());
	}

}
