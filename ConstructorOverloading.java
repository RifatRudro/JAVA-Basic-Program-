
/*
Constructors MUST be of same class.
Constructor Parameter MUST be different.
*/

/*
	Rules are almost same as Method Overloading. 
	Constructor overloading is also called compile-time overloading.
*/

public class ConstructorOverloading {
	public static void main(String[] args) {
		ClassA cA1 = new ClassA();
		ClassA cA2 = new ClassA(10);
		ClassA cA3 = new ClassA(10, 20);
		ClassA cA4 = new ClassA(10.00, 20);

		// It will give you an error, find out why?
		/*ClassA cA4 = new ClassA(10f);*/
	}
}

class ClassA {

	ClassA() {
		System.out.println("Default Constructor");
	}

	ClassA(int a) {
		System.out.println("1. Parameterized Constructor");
	}

	ClassA(int a, int b) {
		System.out.println("2. Parameterized Constructor");
	}

	ClassA(double a, int b) {
		System.out.println("3. Parameterized Constructor");
	}

	ClassA(int a, double b) {
		System.out.println("4. Parameterized Constructor");
	}
}

