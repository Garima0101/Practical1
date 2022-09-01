package Practical1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class GenerateRandomNumber {

	public static void main(String[] args) {

		Scanner uInput = new Scanner(System.in); // Taking UserInput
		System.out.println("Enter N :");
		int NthPositionNumber = uInput.nextInt(); // Storing userInput in Int type Variable
		ArrayList<Integer> arr = new ArrayList<Integer>(randomNumber());// converting Treeset to ArrayList
		System.out.println(arr);// printing numbers in arraylist
		System.out.println(
				"The " + NthPositionNumber + " th smallest random number  is : " + arr.get(NthPositionNumber - 1));

	}

	public static TreeSet<Integer> randomNumber() {
		Random rand = new Random();

		// Generating Number 1-500
		int max = 1000;
		int min = 1;
		TreeSet<Integer> randomNumberSet = new TreeSet<Integer>(); // Defining TreeSet

		while (randomNumberSet.size() < 500) {
			int value = rand.nextInt((max + min) + 1) + min;
			randomNumberSet.add(value);
		}
		// System.out.println(randomNumberSet.size());
//
		return randomNumberSet;

	}

//	for(Integer a :randomNumber) {
//		int value = rand.nextInt((max + min) + 1) + min;
//		randomNumber.add(value);
//	     
//		
//	}

}