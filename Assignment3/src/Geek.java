/*-------------------------------------------------------------------------
// AUTHOR: Ryan Nguyen
// FILENAME: Assignment3.java
// SPECIFICATION: Write a definition that represents a person that is a geek.
// FOR: CS 1400- Assignment #3
// TIME SPENT: 3 hour
//-----------------------------------------------------------*/

public class Geek {
	
	//private instances variables in geek
	private String name;
	private int numQuestions;
	
	//Geek constructor with default number of question being 0
	public Geek (String name) {
	this.name = name;
	}
	
	//Obtain and return geek's name
	public String getName () {
		return name;
	}

	//return number of questions asked
	public int getNumberOfQuestions() {
		return numQuestions;
	}

	//return booleans if number is even
	public boolean isEven (int num) {
		if (num % 2 ==0) {
			return true;
		}
			return false;
	}
	
	//Return a string with parameter concatenated with itself an integer amount of times.
	public String multiConcat (String text, int count) {
	String concatString = "";
		for (int i = 0; i < count; i++) {
			concatString += text;
		}
			return concatString;
	}
	//Return an integer which is the sum of 2 integers in that range
		public int sumRange (int num1, int num2) {
			if ((num1 == num2) || (num1 > num2)) {
				return 0;
			}
			else {
				int sumRange = 0;
				for (int i = num1 + 1; i < num2; i++) { //exclusive so +1 to num1
					sumRange += i;
				}
					return sumRange;
	
			}
	}

	//returns true if 3 integers are in order, smallest first, otherwise returns false.
	public boolean sorted(int num1, int num2, int num3) {
		if ((num1 <= num2) && (num2 <= num3)) {
			return true;
		}
			return false;
		}
	
	// returns the number of times the character "A" and "a" is in a string.
	public int countA(String text) {
		int numA = 0;
		for(int i = 0; i < text.length(); i++) {
			if ((text.charAt(i) == 'a') || (text.charAt(i)) == 'A') {
				numA++;
			}
		}
			return numA;
		}
	
	//take integer and return number of digit in integer
	public int countDigits(int num) {
		int numD = 0;
		while (num != 0) {
			num /= 10;
			numD++;
		}
			return numD;
		}
	//return true if number is prime
	public boolean isPrime(int num) {

	//prime number must be greater than 1 and only divisible by themselves or 1.		if ((num <= 1) || num ==2) {
		if (num <=1) {
		return false;
		}
		for(int i = 2; i < num; i++) {
			if (num % i == 0){
				return false;
			}
		}
		return true;
	}
}