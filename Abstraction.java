public class Abstraction {
	public static void main(String[] args) {

		// 2. An abstract class is a class that we can not instantiate 
		// error: ClassA is abstract; cannot be instantiated
		// ClassA cA1 = new ClassA();

		// 3. We can use Object Reference of an abstract class.
		ClassA cA2 = new ClassC();
		cA2.methodA2();

		ClassB cB1 = new ClassC();
		cB1.methodB1();

		ClassC cC1 = new ClassC();
		cC1.methodA1();
		cC1.methodB1();
		cC1.methodA2();
		cC1.methodA2(10);
		cC1.methodC1();
	}
}

// 1. This is the declaration of abstract class
abstract class ClassA {

	// 4. Abstract class can have any type of attributes
	int a;
	static int b;

	// 4. Abstract class can have constructors (Default or Parameterized)
	ClassA() {
		System.out.println("Default Constructor of ClassA");
	}

	ClassA(int a) {
		// 4. We can create constructor chaining using this and super in abstract class
		this();
		System.out.println("Parameterized Constructor of ClassA");
	}

	// 5. An abstract class MAY HAVE regular methods/ concrete methods
	void methodA1() {
		System.out.println("1. ClassA- MethodA1()");
	}

	// 5. An abstract class MAY HAVE abstract methods.
	//  error: abstract methods cannot have a body
	/*abstract void methodA2() {

	}*/

	// Next 2 lines are representing that method overloading is also possible inside abstract class

	abstract void methodA2();

	abstract void methodA2(int a);

	// 6. It is not mandatory to have an abstract method inside an abstract class
	// but if you declare an abstract method then you must declare your class as abstract

}

// See point 6
// error: ClassZ is not abstract and does not override abstract method methodZ1() in ClassZ
/*class ClassZ {

	abstract void methodZ1();
}*/

// 7. An abstract class MUST have a child class
// 8. If we declare an empty classB,
// 8. It will thorw an error because there is no implementation/overriden methods of parent class's abstract method
abstract class ClassB extends ClassA {

	ClassB() {
		super(10);
		System.out.println("Default Constructor of ClassB");
	}

	// Solution 1 for point 8 is declare classB as abstract, so you do not need to implement those abstract methods
	// abstract class ClassB extends ClassA {}

	// Solution 2 for point 8 is override all the abstract method of parent class

	/*void methodA2() {

	}

	void methodA2(int a) {

	}*/

	abstract void methodB1();

	// 9. Suppose I go with solution 1
	// If the child class is another abstract class, that child class will have another child class which has to be a regular class.

}

// finally! a class which is a regular class, now I can create instance
class ClassC extends ClassB {

	// I can have other things like variables and constructors and other methods inside my regular class

	int x;
	static int z;

	ClassC() {
		System.out.println("Default Constructor of ClassC");
	}

	// It's classC's own method
	void methodC1() {
		System.out.println("2. ClassC - MethodC1()");
	}

	void methodA1() {
		System.out.println("3. ClassC- MethodA1()");
	}

	void methodA2() {
		System.out.println("4. ClassC- MethodA2()");
	}

	void methodA2(int a) {
		System.out.println("5. ClassC- MethodA2()");
	}

	void methodB1() {
		System.out.println("6. ClassC- MethodB1()");
	}
}