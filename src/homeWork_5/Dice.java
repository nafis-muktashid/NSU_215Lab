package homeWork_5;
import java.util.*;

public class Dice {
	private int side;
	private int currentValue;
	private Random random;
	
	//Constructor
	Dice(int i){
		this.side = i;
		this.random = new Random();
	}
	
	//Roll Dice
	public int roll() {
		return this.currentValue = random.nextInt(side)+1;
	}

	//Get Methods
	public int getSide() {
		return this.side;
	}
	public int getCurrentValue() {
		return this.currentValue;
	}
	
	//Set Method
	public void setCurrentValue(int i) {
		this.currentValue = i;
	}
}
