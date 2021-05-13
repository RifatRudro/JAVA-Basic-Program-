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