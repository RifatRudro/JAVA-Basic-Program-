/*
Methods MUST be in same class.
Method Name MUST be same.
Method Parameter MUST be different.
Method Return Type may or may not be same.
*/

/*
	2 + 3 = addTwoNumbers(int a, int b) = add(int a, int b)
	2 + 3 + 4 = addThreeNumbers(int a, int b, int c) = = add(int a, int b, int c)
	2 + 3 + 4 + 5 = addFourNumbers(int a, int b, int c, int d) = add(int a, int b, int c, int d)
	2 + 3 + 4 + 5 + 6 = addFiveNumbers(int a, int b, int c, int d, int e) = add(int a, int b, int c, int d, int e)
*/

/*
	Method Overloading is also called compile time polymorphism, static binding, early binding
*/

public class ACloserLookAtMethodOverloading {
	public static void main(String[] args) {

		ClassA cA = new ClassA();
		cA.methodA();
		cA.methodA(10, 20);
		cA.methodA(10, 20.05f);
		cA.methodA(20.05f, 200);

		/*
		error: no suitable method found for methodA(int,int,int,int,int)
		cA.methodA(10, 10, 10, 10, 10);
		*/

		cA.methodA(10, 10, 10, 10, 10, 90.0);
		cA.methodA(10, 10, 10, 10, 10, 'A');
	}
}

class ClassA {

	void methodA() {
		System.out.println("1. ClassA - MethodA()");
	}

	void methodA(int a) {
		System.out.println("2. ClassA - MethodA()");
	}

	void methodA(float a) {
		System.out.println("3. ClassA - MethodA()");
	}

	void methodB() {
		System.out.println("4. ClassA - MethodB()");
	}

	void methodA(int a, int b) {
		System.out.println("5. ClassA - MethodA()");
	}

	void methodA(float a, float b) {
		System.out.println("6. ClassA - MethodA()");
	}

	void methodA(int a, float b) {
		System.out.println("7. ClassA - MethodA()");
	}

	void methodA(float  a, int b) {
		System.out.println("8. ClassA - MethodA()");
	}

	/*
	 error: method methodA(float,int) is already defined in class ClassA
	int methodA(float  c, int d) {
		System.out.println("9. ClassA - MethodA()");
	}
	*/

	static void methodA(int  a, int b, int c, int d, int e, double f) {
		System.out.println("10. ClassA - MethodA()");
	}

	static void methodA(int  a, int b, int c, int d, int e, char f) {
		System.out.println("11. ClassA - MethodA()");
	}

}
