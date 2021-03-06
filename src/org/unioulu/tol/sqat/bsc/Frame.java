package org.unioulu.tol.sqat.bsc;

public class Frame {
	private int firstThrow;
	private int secondThrow;
	
	public int score;
	
	public Frame(int firstThrow, int secondThrow){
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
	}
	
	//the score of a single frame
	public int score(){
		
		score = firstThrow + secondThrow;
		
		return score;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){
		if(firstThrow==10)
		{
			return true;
		}
		return false;
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		if((firstThrow+secondThrow)==10)
		{
			return true;
		}
		return false;
	}

	//return whether this is the last frame of the match
	public boolean isLastFrame(){
		if(BowlingGame.getInstance().getFrameCount()==10)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

	//bonus throws
	//number of or score of?
	public int bonus(){
		if(isStrike())
		{
			return 2;
		}
		else if(isSpare())
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
}
