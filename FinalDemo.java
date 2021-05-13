public class FinalDemo {
	public static void main(String[] args) {
		ClassA cA = new ClassA();
		System.out.println(cA.x);

		//error: cannot assign a value to final variable x
		// cA.x = 30;
	}
}

// Final Class Declation
// Use final Class
// final class ClassA 
class ClassA {

	// 1. Final Attributes
	// Declaration of final variable
	// error: variable x not initialized in the default constructor
	// final int x;

	// Declaration of final variable also initializing the value
	// final int x = 10;

	// I want to initialize it with constructors
	final int x;

	// I am declaring a static final variable and intializing it.
	// final static int z = 10;
	final static int y;

	static {
		y = 10;
	}

	// If I have 2 or 3 constructos I need to initialize my final vairbale in all the constructors
	// Otherwise I will get an error
	// error: variable x might not have been initialized

	ClassA() {
		x = 10;
		System.out.println("Default Constructor of ClassA");

		// error: cannot assign a value to final variable y
		// as it is static
		// y = 20;
	}

	ClassA(int a) {
		x = 10;
		System.out.println("Parameterized Constructor of ClassA");

		// error: cannot assign a value to final variable y
		// as it is static
		// y = 20;
	}


	// I can implement method overloading concept with final methods

	// Final methods declaration
	final void methodA1() {
		System.out.println("1. ClassA - MethodA1()");
	}

	final void methodA1(int a) {
		System.out.println("2. ClassA - MethodA1()");
	}

	void methodA1(int a, int b) {
		System.out.println("3. ClassA - MethodA1()");
	}

	// It is also possible to declare method as final static, as we have seen for variables

}

// Declare ClassA as final
// We can not inherit from final class ClassA
// error: cannot inherit from final ClassA
/*class ClaasB extends ClassA {

}*/


class ClassC extends ClassA {

	ClassC() {

		// We can not update the final variable
		//  error: cannot assign a value to final variable x
		// super.x = 30;
	}

	// Method overriding is not possible if the method is final
	/*void methodA1() {

	}*/
}

// We can not use abstract and final together, why?
//  error: illegal combination of modifiers: abstract and final
/*final abstract class ClassD {

}*/

// We can not have abstract method inside a final class, why?
// ClassE is not abstract and does not override abstract method methodE1() in ClassE
/*final class ClassE {

	abstract void methodE1();
}*/