/**
 * Name: John William Markley
 * Class ID: 70641 | CSE 360 Monday 9:40
 * Description: This program is a calculator that tracks all operations in a StringBuilder while containing the 
 * total result in an integer
 * Github Repo: https://github.com/JohnMarkley/CSE360Assignment2
 */
package cse360assign2;

public class AddingMachine {

	private int total;
	private StringBuilder history;
	
	/**
	 * Constructor for Adding Machine that creates a stringbuilder object 
	 * & initializes total to 0
	 */
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		history = new StringBuilder();
	}
	
	/**
	 * Return total 
	 * @return total 
	 */
	
	public int getTotal () {
		return this.total;
	}
	
	/**
	 * Add parameter value to total 
	 * @param value
	 */
	
	public void add (int value) {
		this.total += value;
		this.history.append(" + " + value);
	}
	
	/**
	 * Subtract parameter value to total
	 * @param value
	 */
	
	public void subtract (int value) {
		this.total -= value;
		this.history.append(" - " + value);
	}
	
	/**
	 * 	toString method that shows history of calculations
	 * @return "0" + StringBuilder History
	 * */
	
	public String toString () {
		return "0" + history.toString();
	}

	/**
	 * clear method that erases all history
	 */
	
	public void clear() {
		this.history.setLength(0);
	}
}
