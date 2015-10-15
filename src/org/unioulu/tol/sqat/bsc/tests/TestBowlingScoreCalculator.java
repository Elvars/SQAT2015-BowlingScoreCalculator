package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.unioulu.tol.sqat.bsc.BowlingGame;
import org.unioulu.tol.sqat.bsc.Frame;

public class TestBowlingScoreCalculator {
	
	BowlingGame game;
	Frame frame;
	
	int actual = 0;
	
	@Before
	public void setup()
	{
		game = new BowlingGame();
	}

	@Test
	public void testAddFrames() {
		
		for(int i=0; i<10; i++)
		{
			frame = new Frame(1, 1);
			game.addFrame(frame);
			
		}
	}
	
	@Test
	public void testFrameIsStrikeIsTrue()
	{
		
	}

}
