package project;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

//		User Story #1
//		The user is prompted asking for the price of the item.

		System.out.println("Please enter the price of the item in dollars and cents: ");
		double priceOfItem = kb.nextDouble();

//		User Story #2
//		The user is then prompted asking how much money was tendered by the customer.

		System.out.println("How much money was given by the Customer " + "in dolars and cents: ");
		double tenderedMoney = kb.nextDouble();

//		User Story #3
//		Display an appropriate message if the customer provided too little money or the exact amount.

		if (priceOfItem - tenderedMoney == 0) {
			System.out.println("You gave the exact amount of money for the item " + " you get no change back!");

		} else if (priceOfItem > tenderedMoney) {
			System.out.println("ERROR! NOT ENOUGH MONEY, NO SOUP FOR YOU!");
		}

//		User Story #4
//		If the amount tendered is more than the cost of the item, display the number of bills and coins that should be given to the customer.
//		String change= makeChange(moneyGiven, priceOfItem);
		if (priceOfItem < tenderedMoney) {
			System.out.println(makeChange(priceOfItem, tenderedMoney));
		}

		kb.close();
	}

	public static String makeChange(double priceOfItem, double tenderedMoney) {
		double total = tenderedMoney - priceOfItem;
		int twenties, tens, fives, ones, quarts, dimes, nickels, pennies;
		String response = "";

		twenties = (int) ((total / 20) + 0.05);
		total = total % 20;
		tens = (int) ((total / 10) + 0.05);
		total = total % 10;
		fives = (int) ((total / 5) + 0.05);
		total = total % 5;
		ones = (int) ((total / 1) + 0.05);
		total = total % 1;
		quarts = (int) ((total / 0.25) + 0.05);
		total = total % 0.25;
		dimes = (int) ((total / 0.10) + 0.05);
		total = total % 0.10;
		nickels = (int) ((total / 0.05) + 0.05);
		total = total % 0.05;
		pennies = (int) ((total / 0.01) + 0.05);
		total = total % 0.01;

		if (twenties >= 2) {
			response = response + (" " + twenties + " twenty dollar bills " + ":");
		} else if (twenties == 1) {
			response = response + (" " + twenties + " twenty dollar bill" + ":");
		}
		if (tens >= 2) {
			response = response + (" " + tens + " ten dollar bills " + ":");
		} else if (tens == 1) {
			response = response + (" " + tens + " ten dollar bill" + ":");
		}
		if (fives >= 2) {
			response = response + (" " + fives + " five dollar bills" + ":");
		} else if (fives == 1) {
			response = response + (" " + fives + " five dollar bill " + ":");
		}
		if (ones >= 2) {
			response = response + (" " + ones + " one dollar bills" + ":");
		} else if (ones == 1) {
			response = response + (" " + ones + " one dollar bill " + ":");
		}
		if (quarts >= 2) {
			response = response + (" " + quarts + " quarters" + ":");
		} else if (quarts == 1) {
			response = response + (" " + quarts + " quarter " + ":");
		}
		if (dimes >= 2) {
			response = response + (" " + dimes + " dimes " + ":");
		} else if (dimes == 1) {
			response = response + (" " + dimes + " dime " + ":");
		}
		if (nickels >= 2) {
			response = response + (" " + nickels + " nickels " + ":");
		} else if (nickels == 1) {
			response = response + (" " + nickels + " nickel " + ":");
		}
		if (pennies >= 2) {
			response = response + (" " + pennies + " pennies " + ":");
		} else if (pennies == 1) {
			response = response + (" " + pennies + " penny " + ":");
		}

		return ("you are owned: " + response);
	}

}
