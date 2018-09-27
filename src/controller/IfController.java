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
		userScale = new Scale();
	}
	
	
	/**T
	 * This is where the program starts calling methods to run the programs
	 */
	public void start()
	{
		
		
		String userInput = JOptionPane.showInputDialog("Enter the name of a scale: ");
		userScale.setScaleName(userInput);
		
		
		userInput = JOptionPane.showInputDialog("Enter its scale degrees: ");		
		userScale.setScaleDegrees(userInput);
		
		
		userInput = JOptionPane.showInputDialog("Enter the amount of scale degrees there are: ");
		int degrees = -99;
		boolean isValid = validInt(userInput);
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
		
		
		JOptionPane.showMessageDialog(null, "This scale is called the " + userScale.getScaleName() + " scale.");
		JOptionPane.showMessageDialog(null, "This scale has a total of " + userScale.getDegreeCount() + " scale degrees.");
		JOptionPane.showMessageDialog(null, "The degrees are: " + userScale.getScaleDegrees());
		
		/*
		boolean correct = false;
		while(!correct)
		{
			
			String userResponse = JOptionPane.showInputDialog("How many scale degrees are in your Ionian Scale: ");
			int response = 0;
			if(validInt(userResponse))
			{
				response = Integer.parseInt(userResponse);
			}
			if(response == degrees)
			{
				JOptionPane.showMessageDialog(null, "Correct.");
				correct = true;
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Incoreect.");
			}
			*/
			
		
		
		
		
		
		
		/*
		String userInput = JOptionPane.showInputDialog("Enter a large whole number: ");
		int userNumber = 0;
		int userNumberTwo = 0;
		if(validInt(userInput))
		{
			userNumber = Integer.parseInt(userInput);
		}
		userInput = JOptionPane.showInputDialog("Enter another large whole number: ");
		if(validInt(userInput))
		{
			userNumberTwo = Integer.parseInt(userInput);
		}
		
		additionGame(userNumber, userNumberTwo);
		*/
		
		
		

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
		String response = JOptionPane.showInputDialog("Whats your favorite whole number?");
		while(!validInt(response))
		{
			response = JOptionPane.showInputDialog("Not a goo enough number.");
		}
		*/
		
		
	}
	
	
	
	private void additionGame(int x, int y)
	{
		boolean correct = false;
		int answer = x + y;
		
		while(!correct)
		{
			
			String userInput = JOptionPane.showInputDialog("What is " + x + " + " + y + ": ");
			int userAnswer = 0;
			if(validInt(userInput))
			{
				userAnswer = Integer.parseInt(userInput);
			}
			
			if(userAnswer == answer)
			{
				JOptionPane.showMessageDialog(null, "Correct.");
				correct = true;
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Incorrect.");
			}
	
		}
		
	}
	
	
	
}
