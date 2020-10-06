package cse360assignment02;

public class AddingMachine {
  private int total; //private int variable
  private String transactions = "0"; //private String variable
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  //method for getting the total
  public int getTotal () {
    return total; 
  }
  //method used for adding to total
  public void add (int value) {
	  total = total + value; 
	  transactions = transactions + " + " + value;
  }
  //method used for subtracting from total
  public void subtract (int value) {
	  total = total - value; 
	  transactions = transactions + " - " + value;
  }
  //method used to keep track of transactions
  public String toString () {
    return transactions;
  }
  //method used to clear the total
  public void clear() {
	  total = 0;
  }
}