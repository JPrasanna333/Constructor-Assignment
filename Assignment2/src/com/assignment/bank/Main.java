package com.assignment.bank;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Bank b = new Bank(15000.89);
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the amount to be deposited in the bank");
		int d = kb.nextInt();
		b.deposit(d);
		System.out.println("Enter the amount to be withdrawn from the bank");
		int w = kb.nextInt();
		b.withdraw(w);
		System.out.println("Balance amount in the bank is " + b.balance() + " Rs");
		kb.close();

	}

}
