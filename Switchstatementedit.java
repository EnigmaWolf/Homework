package guessgame;

import java.util.Scanner;

public class Switchstatementedit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
		Scanner keyboard = new Scanner(System.in);
		
		int budgetTotal = 0;
		int expenses = 0;
		
		while(true) {
			System.out.println("1 + Ann Income");
			System.out.println("2 - Add Expense");
			System.out.println("3 - Total Budget");
			System.out.println("4 - Exit");
			int choice = keyboard.nextInt();
			
			switch(choice) {
			case 1:
				boolean IncomeLogic = true;
				while(IncomeLogic) {
					System.out.println("Add new Income");
					int income = keyboard.nextInt();
					budgetTotal += income;
					IncomeLogic = false;
				}
					break;
			case 2:
				boolean expensesLogic = true;
				while(expensesLogic) {
				System.out.println("Add new Expense");
				int expense = keyboard.nextInt();
				budgetTotal -= expense;
				expenses = expenses + expense;
				expensesLogic = false;
				}
				break;
				
			case 3:
				System.out.println(budgetTotal);
				break;
				
			case 4:
				System.out.println("You're leaving...bye bye");
			    System.exit(0);
				break;
				}
			
			}
		}
		
		
	}


