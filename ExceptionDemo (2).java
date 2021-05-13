import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionDemo {

	public static void main(String[] args) {

		// Understanding the java exceptions

		/*
			java.lang.ArithmeticException: / by zero
        	at ExceptionDemo.main(ExceptionDemo.java:8) 
		*/

        /*
		int d = 0;
		int result = 10 / d;
		System.out.println("1. After getting error");
		*/
		/*	2. Compile-time
			ExceptionDemo.java:19: error: variable p1 might not have been initialized 
		*/
		/*	
		Person p1;
		p1.setId(10);
		System.out.println("2. After getting error");
		*/

		/*  3. Run-time
			java.lang.NullPointerException
        	at ExceptionDemo.main(ExceptionDemo.java:27)
		*/
        /*	
		Person p1 = null;
		p1.setId(10);
		System.out.println("3. After getting error");
		*/

		/*  4.
			java.lang.ArrayIndexOutOfBoundsException: 12
        	at ExceptionDemo.main(ExceptionDemo.java:39)
		*/
        /*	
		int a[] = new int[10];
		// Successful Execution
		// System.out.println(a[8]);
		System.out.println(a[12]);
		System.out.println("4. After getting error");
		*/

		/*
			java.lang.NumberFormatException: For input string: "ABC"
        	at java.lang.NumberFormatException.forInputString(Unknown Source)
        	at java.lang.Integer.parseInt(Unknown Source)
        	at java.lang.Integer.parseInt(Unknown Source)
        	at ExceptionDemo.main(ExceptionDemo.java:51)
		*/

        /*
		// Correct input
		//String number1 = "123";
		String number2 = "ABC";
		int i = Integer.parseInt(number2);
		System.out.println("5. After getting error");
		*/

		/*
			6. How to trace, where the error/exception has occurred.
			java.lang.ArithmeticException: / by zero
        	at ClassA.createError(ExceptionDemo.java:94)
       	 	at ClassA.callTheMethodCreateError(ExceptionDemo.java:99)
        	at ExceptionDemo.main(ExceptionDemo.java:65)
		*/
        /*	
		ClassA cA1 = new ClassA();
		cA1.callTheMethodCreateError();
		*/

		Scanner sc = new Scanner(System.in);
		int i = 0;
		System.out.println("Please enter a number: ");

		/*
			java.util.InputMismatchException
        	at java.util.Scanner.throwFor(Unknown Source)
        	at java.util.Scanner.next(Unknown Source)
        	at java.util.Scanner.nextInt(Unknown Source)
        	at java.util.Scanner.nextInt(Unknown Source)
        	at ExceptionDemo.main(ExceptionDemo.java:82)
			
			// Without try block, what if user gives wrong input
			i = sc.nextInt();

		*/
		/*
			ExceptionDemo.java:95: error: 'try' without 'catch', 'finally' or resource declarations
			
			// What if I write only try block without any catch or finally block
			try {
				i = sc.nextInt();
			}
		*/

		/*
		// 1. You have ti write try and catch or try and finally together. You can not write other lines between these two blocks
		// 2. Catch block will only execute if exception has occured from immediate try block
		// 3. If you don't know the exact exception class then in catch block parameter just use the Exception Class's object
		// 4. Suppose you don't awnt generic exception class, you are going to provide the exact same exception class which is supposed to be thrown from you try block. Then you should be careful about
		//  the exact exception class. As if you provide the wrong exception class then it will be thrown to java catch-all or default exception handler
		try {
			i = sc.nextInt();
		}
		catch (Exception ex) {
			System.out.println("Exception occurred! Please enter a valid number");
		}
		*/
		
		/*
		// Mutiple catch block

		try {
			// First try with correct input - No exception
			// Now try with input 0 - ArithmeticException
			// Now try with input 'A' - InputMismatchException
			i = sc.nextInt();
			int d = 10 / i;
		}
		catch (ArithmeticException ar) {
			System.out.println("ArithmeticException occurred! Please enter a valid number");
		}
		catch (InputMismatchException ime) {
			System.out.println("InputMismatchException occurred! Please enter a valid number");
		}
		catch (NullPointerException np) {
			System.out.println("NullPointerException occurred! Please enter a valid number");
		}
		*/

		// Rules to use Multiple catch block
		// 1. You need to maintain Hierarchy of exception classess. For example
		// Exception class has many childs, one of them is RuntimeException Class, in Runtime class there are several classes, like 
		// ArithmeticException, NullPointerException. So first you need to write catch for child class then sequentially go to parent classes, otherwise you will get compile time error
		// You don't need to maintain hierarchy for siblings
		try {
			// First try with correct input - No exception
			// Now try with input 0 - ArithmeticException
			// Now try with input 'A' - InputMismatchException
			i = sc.nextInt();
			int d = 10 / i;
		}
		/*
		catch (Exception ex) {
			System.out.println("Exception occurred! Please enter a valid number");
		}
		*/
		catch (ArithmeticException ar) {
			System.out.println("ArithmeticException occurred! Please enter a valid number");
		}
		catch (InputMismatchException ime) {
			System.out.println("InputMismatchException occurred! Please enter a valid number");
		}
		catch (NullPointerException np) {
			System.out.println("NullPointerException occurred! Please enter a valid number");
		}
		catch (RuntimeException ex) {
			System.out.println("RuntimeException occurred! Please enter a valid number");
		}
		catch (Exception ex) {
			System.out.println("Exception occurred! Please enter a valid number");
		}
		/*catch (RuntimeException ex) {
			System.out.println("Exception occurred! Please enter a valid number");
		}*/

		System.out.println("i: " + i);
		System.out.println("7. After getting error");
	}
}

class Person {

	private int id;
	private String name;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

class ClassA {

	public void createError() {
		int a = 10 / 0;
		System.out.println("6. After getting error");
	}

	public void callTheMethodCreateError() {
		this.createError();
	}
}