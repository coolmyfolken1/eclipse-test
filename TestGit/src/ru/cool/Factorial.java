package ru.cool;

public class Factorial {
	
	public void count(int number) {

		int counter = 1;
		for(int i = 1; i <= number; i++) {
			counter *= i;
		}
		System.out.println(counter);
	}
}
