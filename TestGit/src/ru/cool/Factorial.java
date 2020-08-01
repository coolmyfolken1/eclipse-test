package ru.cool;

public class Factorial {
	
	private int number;
	
	public Factorial(int number) {
		this.number = number;
		
	}
	
	public void count() {
		int counter = 1;
		int number = this.number;
		for(int i = 1; i <= number; i++) {
			counter *= i;
		}
		System.out.println(counter);
	}
	
}
