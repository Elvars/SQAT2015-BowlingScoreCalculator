package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.unioulu.tol.sqat.bsc.BowlingGame;
import org.unioulu.tol.sqat.bsc.Frame;

public class TestBowlingScoreCalculator {
	
	BowlingGame game;
	Frame frame;
	
	int intActual = 0;
	boolean booleanActual = false;
	
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
	public void testFrameScoreReturns10()
	{
		frame = new Frame(5, 5);
		
		intActual = frame.score();
		
		assertEquals(10, intActual);
	}
	
	@Test
	public void testFrameIsStrikeIsTrue()
	{
		frame = new Frame(10,0);
		
		booleanActual = frame.isStrike();
		
		assertEquals(true, booleanActual);
	}
	
	@Test
	public void testFrameIsStrikeIsFalse()
	{
		frame = new Frame(9,0);
		
		booleanActual = frame.isStrike();
		
		assertEquals(false, booleanActual);
	}

}
