package dice;

import java.util.Random;

public class Die {
	private int value;
	Random r = new Random();

	public Die() {
		value = 0;
	}
	
	public void roll() {
		//randomly assign value to die
		value = r.nextInt(6) + 1;
	}
	
	public int getValue() {
		return value;
	}
	
	public int add(Die a) {
		int total = a.value + this.value; 
		//add values of two dice
		return total;
	}
	
	public String toString() {
		return "< " + value + " >";
	}
}
