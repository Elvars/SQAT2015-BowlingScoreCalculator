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
	public void testFrameScoreReturns0()
	{
		frame = new Frame(0, 0);
		
		intActual = frame.score();
		
		assertEquals(0, intActual);
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
	
	@Test
	public void testFrameIsSpareTrue()
	{
		frame = new Frame(1, 9);
		
		booleanActual = frame.isSpare();
		
		assertEquals(true, booleanActual);
	}
	
	@Test
	public void testFrameIsSpareFalse()
	{
		frame = new Frame(1, 8);
		
		booleanActual = frame.isSpare();
		
		assertEquals(false, booleanActual);
	}
	
	@Test
	public void testGameScoreReturns20()
	{
		for(int i=0; i<10; i++)
		{
			frame = new Frame(1, 1);
			game.addFrame(frame);
			
		}
		
		intActual = game.score();
		
		assertEquals(20, intActual);
	}
	
	@Test
	public void testFrameBonusThrowsReturns0()
	{
		frame = new Frame(1, 1);
		
		intActual = frame.bonus();
		
		assertEquals(0, intActual);
	}
	
	@Test
	public void testFrameBonusThrowsReturns2()
	{
		frame = new Frame(10, 0);
		
		intActual = frame.bonus();
		
		assertEquals(2, intActual);
	}
	
	@Test
	public void testFrameIsLastFrameReturnsTrue()
	{
		for(int i=0; i<10; i++)
		{
			frame = new Frame(1, 1);
			BowlingGame.getInstance().addFrame(frame);
			
		}
		
		booleanActual = frame.isLastFrame();
		
		assertEquals(true, booleanActual);

	}
	
	@Test
	public void testGameIsNextFrameBonusReturnsTrue()
	{
		frame = new Frame(10, 0);
		game.addFrame(frame);
		//BowlingGame.getInstance().addFrame(frame);
		
		booleanActual = game.isNextFrameBonus();
		
		assertEquals(true, booleanActual);

	}
	

}
