package Polymorphism;

public class SuperBodyShape extends Shape {
	
	public int bodyShape (int slim, int fat , int overWeight, int superFat){
		int total = slim + fat + overWeight + superFat +5;
		return total;
	}

}
