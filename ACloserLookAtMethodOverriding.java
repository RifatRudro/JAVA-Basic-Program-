/*
There MUST be inheritance between the two classes.
Method Name MUST be same.
Method Parameter MUST be same.
Method Return Type MUST be same.
*/

/*
Method Overriding is also called run time polymorphism, dynamic binding, late binding
*/

// Static method can be inherited but can not be overriden

public class ACloserLookAtMethodOverriding {
	public static void main(String[] args) {
		ClassB cB = new ClassB();
		/*cB.methodA2();*/

		/*cB.methodA3();
		ClassB.methodA3();*/

		ClassA cA = new ClassB();
		cA.methodA2(); // it is calling child class method
		cA.methodA3(); // but it is not calling child class method, why?
	}
}

class ClassA {

	void methodA1() {
		System.out.println("1. ClassA-MethodA1()");
	}

	void methodA2() {
		System.out.println("2. ClassA-MethodA2()");
	}

	static void methodA3() {
		System.out.println("6. ClassA-MethodA3()");
	}
}

class ClassB extends ClassA {
	
	void methodB1() {
		System.out.println("3. ClassB-MethodB1()");
	}

	void methodB2() {
		System.out.println("4. ClassB-MethodB2()");
	}

	// This matches with the parent class method definition
	// Comment out the following method and test it.
	void methodA2() {
		System.out.println("5. ClassB-MethodA2()");
	}

	static void methodA3() {
		System.out.println("7. ClassB-MethodA()");
	}

}