/**
 * @author Beau Bright
 * ID: 1212409807
 * CSE 360 Assignment 2
 * Description: Contains Caluclator.java file that has code for a class and
 *              methods that act as a calculator with basic calculation
 *              functions (add, subtract, multiply, divide)
 */

package cse360assign2;

/**
 * A class that acts as a calculator by providing methods to do simple
 * calculations, return the total, and return the calculation history
 */
public class Calculator {

	private int total;
	private String history = "0";
	
	/**
	 * Creates a calculator object
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Gives the current total
	 * @return total  the current total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Adds a given value to the total and records the operator and value to the
	 * history
	 * @param value  value to be added to total
	 */
	public void add (int value) {
		total = total + value;
		
		history = history + " + " + value;
	}
	
	/**
	 * Subtracts a given value from the total and records the operator and value
	 * to the history
	 * @param value  value to be subtracted from total
	 */
	public void subtract (int value) {
		total = total - value;
		
		history = history + " - " + value;
	}
	
	/**
	 * Multiplies the total by a given value and records the operator and value
	 * to the history
	 * @param value  value to multiply the total by
	 */
	public void multiply (int value) {
		total = total * value;
		
		history = history + " * " + value;
	}
	
	/**
	 * Divides the total by a given value, if value is 0 total is 0, and records
	 * the operator and value to the history
	 * @param value  value to divide the total by
	 */
	public void divide (int value) {
		if (value == 0)
			total = 0;
		else
			total = total / value;
		
		history = history + " / " + value;
	}
	
	/**
	 * Gives the history of past calculations
	 * @return history  a string with the past calculations recorded
	 */
	public String getHistory () {
		return history;
	}
}
