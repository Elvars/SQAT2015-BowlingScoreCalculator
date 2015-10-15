package org.unioulu.tol.sqat.bsc;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	public BowlingGame(){}
	
	private static BowlingGame instance = new BowlingGame();
	
	public static BowlingGame getInstance() {
	      if(instance == null) {
	         instance = new BowlingGame();
	      }
	      return instance;
	}
	
	public void addFrame(Frame frame){
		
		frames.add(frame);
		
		//System.out.println(frames.size());
	}
	
	public void setBonus(int firstThrow, int secondThrow) {
		bonus = new Frame(firstThrow, secondThrow);
		int i = frames.size()-1;
		
		frames.get(i).score()
	}
	
	public int score(){
		int score = 0;
		
		for(int i=0; i<frames.size(); i++)
		{
			score += frames.get(i).score();
		}
		
		return score;
	}
	
	public boolean isNextFrameBonus(){
		
		if(isNextFrameBonusWithParameters(frames.size()-1))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int getFrameCount()
	{
		return frames.size();
	}
	
	public boolean isNextFrameBonusWithParameters(int i)
	{
		if(frames.get(i).isSpare() || frames.get(i).isStrike())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
