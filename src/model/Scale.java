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
	
	/**
	 * Default Constructor for a scale
	 * Initializes all variables to valid but bad values
	 * Used for later customization
	 */
	public Scale()
	{
		this.scaleName = "no scale";
		this.scaleDegrees = "no degrees";
		this.degreeCount = -99;
	}
	
	
	/**
	 * Initializes a Scale Instance. 
	 * @param scaleName, the name of the scale 
	 * @param scaleDegrees, the degrees 	
	 * @param degreeCount, the amount of degrees in the scale
	 */
	public Scale(String scaleName, String scaleDegrees, int degreeCount)
	{
		this.scaleName = scaleName;
		this.scaleDegrees = scaleDegrees;
		this.degreeCount = degreeCount;
	}
	
	
	
}
