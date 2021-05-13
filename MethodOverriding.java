/*
There MUST be inheritance between the two classes.
Method Name MUST be same.
Method Parameter MUST be same.
Method Return Type MUST be same.
*/

/*
Method Overriding is also called run time polymorphism, dynamic binding, late binding
*/

public class MethodOverriding {
	public static void main(String[] args) {
		ClassB cB = new ClassB();
		cB.methodA2();
	}
}

class ClassA {

	void methodA1() {
		System.out.println("1. ClassA-MethodA1()");
	}

	void methodA2() {
		System.out.println("2. ClassA-MethodA2()");
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

}