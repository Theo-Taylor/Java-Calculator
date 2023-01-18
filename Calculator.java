import java.util.Scanner;

public class Calculator {
	
	static Scanner input = new Scanner(System.in);
	
	static int num1;
	static int num2;

	static void add() {
		System.out.print("Please select the first number: ");
		num1 = input.nextInt();
		input.nextLine();
		System.out.print("Please select the second number: ");
		num2 = input.nextInt();
		int sum = num1 + num2;
		System.out.println("");
		System.out.println(num1 + " + " + num2 + " = " + sum);
	}
	
	static void sub() {
		System.out.print("Please select the first number: ");
		num1 = input.nextInt();
		input.nextLine();
		System.out.print("Please select the second number: ");
		num2 = input.nextInt();
		int diff = num1 - num2;
		System.out.println(num1 + " - " + num2 + " = " + diff);
	}
	
	static void mul() {
		System.out.print("Please select the first number: ");
		num1 = input.nextInt();
		input.nextLine();
		System.out.print("Please select the second number: ");
		num2 = input.nextInt();
		int prod = num1 * num2;
		System.out.println(num1 + " x " + num2 + " = " + prod);
	}
	
	static void div() {
		System.out.print("Please select the first number: ");
		num1 = input.nextInt();
		input.nextLine();
		System.out.print("Please select the second number: ");
		num2 = input.nextInt();
		int quo = num1 / num2;
		System.out.println(num1 + " / " + num2 + " = " + quo);
	}

	public static void main(String[] args) {
		
		char m;
		
		do {
				char r;
				
				System.out.println("");
				System.out.println("============Calculator============");
				System.out.println("");
				System.out.println("Type 1 for addition");
				System.out.println("Type 2 for subtraction");
				System.out.println("Type 3 for multiplication");
				System.out.println("Type 4 for division");
				System.out.println("");
				System.out.print("What would you like to do? ");
				int choice = input.nextInt();
				
		        while (choice < 1 || choice > 4) {
		            System.out.print("Invalid input, please enter a number from 1-4: ");
		            choice = input.nextInt();
		        }
				
				switch(choice) {
				
				case 1:
					do {
						System.out.println("");
						System.out.println("============Addition============");
						System.out.println("");
						add();
						System.out.println("");
						System.out.print("Would you like to do more addition? Type 'y' for Yes and 'n' for No: ");
						r = input.next().charAt(0);
                        while (r != 'y' && r != 'n') {
                            System.out.println("Invalid input, please enter 'y' or 'n' ");
                            r = input.next().charAt(0);
                        }
                        
					}while(r == 'y');
					break;
				
				case 2:
					do {
						System.out.println("");
						System.out.println("============Subtraction============");
						System.out.println("");
						sub();
						System.out.println("");
						System.out.print("Would you like to do more subtraction? Type 'y' for Yes and 'n' for No: ");
						r = input.next().charAt(0);
                        while (r != 'y' && r != 'n') {
                            System.out.println("Invalid input, please enter 'y' or 'n' ");
                            r = input.next().charAt(0);
                        }
                        
					}while(r == 'y');
					break;
				
				case 3:
					do {
						System.out.println("");
						System.out.println("============Multiplication============");
						System.out.println("");
						mul();
						System.out.println("");
						System.out.print("Would you like to do more multiplication? Type 'y' for Yes and 'n' for No: ");
						r = input.next().charAt(0);
                        while (r != 'y' && r != 'n') {
                            System.out.println("Invalid input, please enter 'y' or 'n' ");
                            r = input.next().charAt(0);
                        }
                        
					}while(r == 'y');
					break;
				
				case 4:
					do {
						System.out.println("");
						System.out.println("============Division============");
						System.out.println("");
						div();
						System.out.println("");
						System.out.print("Would you like to do more division? Type 'y' for Yes and 'n' for No: ");
						r = input.next().charAt(0);
                        while (r != 'y' && r != 'n') {
                            System.out.println("Invalid input, please enter 'y' or 'n' ");
                            r = input.next().charAt(0);
                        }
                        
					}while(r == 'y');
					break;
				}
				
				System.out.print("Would you like to return to the main menu? Type 'y' for Yes and 'n' for No: ");
				m = input.next().charAt(0);
				
		}while(m == 'y');
		

	}	
}
