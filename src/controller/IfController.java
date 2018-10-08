package controller;

import model.Scale;

//************************
import java.util.ArrayList;

import java.util.AbstractList;

import javax.swing.JOptionPane;
//import java.util;

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
	
		/* *********** EXAMPLE **********
			String pumpkin = new String();
			
			ArrayList<String>Halloween = new ArrayList <String>();
			
			Halloween.add("ghoul");
			Halloween.add("spooky");
			
			JOptionPane.showMessageDialog(null, Halloween);
			
		*/
		
		
		
		ArrayList();
			

		

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
	
	
	private void loopyloop()
	{
		
		int amount = 0;
		String userLoop = JOptionPane.showInputDialog("Enter a string you want to loop: ");
		boolean isValid = false;
		while(!isValid)
		{
			String userAmount = JOptionPane.showInputDialog("Enter how many times you want to loop this message: ");
			if(validInt(userAmount))
			{
				amount = Integer.parseInt(userAmount);
				isValid = true;
			}
		}
	
	
		String TheLoop = userLoop + "\n";
		for(int x = 1; x < amount; x++)
		{
			TheLoop += userLoop + "\n";
		}
		
		
		JOptionPane.showMessageDialog(null, TheLoop);	
	}     
	
	
	
	
	
	
}
