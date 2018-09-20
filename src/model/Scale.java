package model;

public class Scale
{
	//declaration section
	//data member section 
	//also called instance variables
	//default values:
	//all numbers get 0
	//boolean =>false
	//objects = null
	private String scaleName;
	private String scaleDegrees;
	private int degreeCount;
	
	
	public Scale()
	{
		//default Constructor
	}
	
	public Scale(String scaleName, String scaleDegrees, int degreeCount)
	{
		this.scaleName = scaleName;
		this.scaleDegrees = scaleDegrees;
		this.degreeCount = degreeCount;
	}
	
	
	
}
