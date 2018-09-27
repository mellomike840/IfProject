package model;

import javax.swing.JOptionPane;

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
	
	
	public String getScaleName()
	{
		return scaleName;
	}
	
	public String getScaleDegrees()
	{
		return scaleDegrees;
	}
	
	public int getDegreeCount()
	{
		return degreeCount;
	}
	
	
	
	public void setScaleName(String scaleName)
	{
		this.scaleName = scaleName;
	}
	
	public void setScaleDegrees(String scaleDegrees)
	{
		this.scaleDegrees = scaleDegrees;
	}
	
	public void setDegreeCount(int degreeCount)
	{
		this.degreeCount = degreeCount;
	}
	
	
	
	
	
	
	
	
	
	
	public String toString()
	{
		String description = "This scale is called the " + getScaleName() + " scale.\n"
							+ "This scale has a total of " + getDegreeCount() + " scale degrees.\n"
							+ "The degrees are: " + getScaleDegrees();
	
		return description;
				
	}
	
	
	
	
	
}
