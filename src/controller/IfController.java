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
		if(validInt(userInput))
		{
			degrees = Integer.parseInt(userInput);
		}
		userScale.setDegreeCount(degrees);
		
		JOptionPane.showMessageDialog(null, "This scale is called the " + userScale.getScaleName() + " scale.");
		JOptionPane.showMessageDialog(null, "This scale has a total of " + userScale.getDegreeCount() + " scale degrees.");
		JOptionPane.showMessageDialog(null, "The degrees are: " + userScale.getScaleDegrees());
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
	
}
