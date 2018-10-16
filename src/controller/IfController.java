package controller;

import model.Scale;

//************************
import java.util.ArrayList;

import javax.swing.JOptionPane;
//import java.util;

public class IfController
{
	private Scale userScale;
	
	
	/**
	 * 
	 * 
	 * 
	 * Builds the instance of the controller
	 * 
	 * 
	 * 
	 */
	
	public IfController()
	{

		

	}
	
	
	/**T
	 * 
	 * 
	 * This is where the program starts calling methods to run the programs
	 * 
	 * 
	 */
	
	public void start()
	{
	
		
		JOptionPane.showMessageDialog(null, FourFour());
		JOptionPane.showMessageDialog(null, twelveBarBlues());
		
		
		
		Ionian();
		Dorian();
		twelveToneList();
		
		
		
		

	}
	
	
	
	
	
	private String twelveBarBlues()
	{
		String ChordProgression = "I  - I  - I  - I  \n"
								+ "IV - IV - IV - IV \n"
								+ "V - IV - IV - V \n";
		
		
		
		
		ArrayList <String> TBB = new ArrayList <String> ();
		
		TBB.add(0, "I");
		TBB.add( 1, "I");
		TBB.add( 2, "I");
		TBB.add( 3, "I");
		
		TBB.add(4, "IV");
		TBB.add( 5, "IV");
		TBB.add( 6, "I");
		TBB.add( 7, "I");
		
		TBB.add(8, "V");
		TBB.add( 9, "IV");
		TBB.add( 10, "I");
		TBB.add( 11, "V");
		
		
		
		return TBB.get(0);
	}
	
	
	
	private String FourFour()
	{
		String FourFour = "FourFour";
		return FourFour;
	}
	

	
	
	/**
	 * THis is JAVA DOC BOI
	 */
	
	private void Dorian()
	{
		ArrayList <String>Dorian = new ArrayList <String>();
		
		Dorian.add("1");
		Dorian.add("2");
		Dorian.add("f3");
		Dorian.add("4");
		Dorian.add("5");
		Dorian.add("6");
		Dorian.add("f7");		
		
		for(int i = 0; i < Dorian.size(); i += 1)
		{
			JOptionPane.showMessageDialog(null, Dorian.get(i));
		}
		
		
	}
	
	
	private void Ionian()
	{
		
		ArrayList <String>Ionian = new ArrayList <String>();
		
		Ionian.add("1");
		Ionian.add("2");
		Ionian.add("3");
		Ionian.add("4");
		Ionian.add("5");
		Ionian.add("6");
		Ionian.add("7");
		
		for(int i = 0; i < Ionian.size(); i += 1)
		{
			JOptionPane.showMessageDialog(null, Ionian.get(i));
		}
		
		
		
	}
	
	
	private void twelveToneList()
	{
		ArrayList <String>twelveTones = new ArrayList <String>();
		
		twelveTones.add("1");
		twelveTones.add("#1/f2");
		twelveTones.add(2, "2");
		twelveTones.add(3, "#2/f3");
		twelveTones.add(4, "3");
		twelveTones.add(5, "4");
		twelveTones.add(6, "#4/f5");
		twelveTones.add(7, "5");
		twelveTones.add(8, "#5/f6");
		twelveTones.add(9, "6");
		twelveTones.add(10, "#6/f7");
		twelveTones.add(11, "7");
		twelveTones.add(12, "8");
		
		
		for(int index = twelveTones.size() - 1; index >= 0; index -= 1)
		{
			JOptionPane.showMessageDialog(null, twelveTones.get(index));
		}
		for(int i = 0; i < twelveTones.size(); i += 1)
		{
			JOptionPane.showMessageDialog(null, twelveTones.get(i));
		}
		
		
		
		
	}
	
	
	private void october()
	{
		
		ArrayList <String>Halloween = new ArrayList <String>();
		
		Halloween.add("ghoul");
		Halloween.add("spooky");
	
		for(int index = Halloween.size() -1; index >= 0; index -= 1)
		{
			
			
			JOptionPane.showMessageDialog(null, Halloween.get(index));
		}
		for (int index = 0; index < Halloween.size(); index += 1)
		{
			//Good for display, or minor changes
			//returns the item that was stored at that index
			JOptionPane.showMessageDialog(null, Halloween.get(index));
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
