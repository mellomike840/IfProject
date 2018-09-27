package controller;

import model.Scale;
import javax.swing.JOptionPane;

public class IfController
{
	
	private Scale userScale;
	
	
	/**
	 * Builds the instance of the controller
	 */
	public IfController()
	{

	}
	
	
	/**T
	 * This is where the program starts calling methods to run the programs
	 */
	public void start()
	{
		loopy();
		
		
		
		for(int i = 1; i < 8; i += 1)
		{
			askUser();
			JOptionPane.showMessageDialog(null, "This is scale number " + i);
		}
		
	
	}
	
	
	
	private void askUser()
	{
		
		userScale = new Scale();
		
		String userInput = JOptionPane.showInputDialog("Enter the name of a scale: ");
		userScale.setScaleName(userInput);
		
		
		userInput = JOptionPane.showInputDialog("Enter its scale degrees: ");		
		userScale.setScaleDegrees(userInput);
		
		
		int degrees = -99;
		boolean isValid = false;
		while(!isValid)
		{
			userInput = JOptionPane.showInputDialog("Enter the amount of scale degrees there are: ");
			if(validInt(userInput))
			{
				degrees = Integer.parseInt(userInput);
				isValid = true;
			}
			
		}
		userScale.setDegreeCount(degrees);
		
		

		JOptionPane.showMessageDialog(null, userScale);
		
		
		
	}
	
	
	
	
	
	public boolean validInt(String maybeInt)
	{
		boolean isValid = false;
		
		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "You need to enter a whole number.");
		}
		return isValid;
		
	}
	
	
	//private: only this class can see it, can only call it inside this object/class 
	private void loopy()
	{
		
		//define a variable before the loop
		boolean isFinished = false;
		int i = 0;
		// ! <-"not", makes it the opposite 
		while(!isFinished)
		{
			JOptionPane.showMessageDialog(null, "Oof");
			i+= 1;
			
			if(i >= 3) 
			{
			isFinished  = true;
			}
			
			
			
		}
		
		/*
		String response = JOptionPane.showInputDialog("What's your favorite whole number?");
		while(!validInt(response))
		{
			response = JOptionPane.showInputDialog("Not a goo enough number.");
		}
		*/
		
		
	}
	
	
	
}
