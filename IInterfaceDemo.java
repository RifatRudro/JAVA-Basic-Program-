// 1. Interface Declaration

// error: modifier private not allowed here
// private interface IInterfaceDemo

// error: modifier protected not allowed here
// protected interface IInterfaceDemo

// public interface IInterfaceDemo
interface IInterfaceDemo {

	// An interface may have attributes. But these attributes are by default public, static and final all at the same time.
	// public static final int x = 20;
	
	// error: = expected
	// int x;

	// int x1 = 20;

	// It is not possible to declare a private variable inside interface
	// error: modifier private not allowed here
	// private int y1 = 50;

	// It is not possible to declare a protected variable inside interface
	// error: modifier protected not allowed here
	// protected int y2 = 50;

	public int x = 20;

	// An interface does not have any constructors
	// error: <identifier> expected
	/*IInterfaceDemo() {
		System.out.println("Default Constructor of IInterfaceDemo");
	}*/

	// All the methods of an interface are by default public and abstract.
	// public abstract void interfaceMethodA1();

	//  error: interface abstract methods cannot have body
	/*void interfaceMethodA2() {

	}*/

	void interfaceMethodA3();

	// public abstract void interfaceMethodA4()
	// This not override, this overwrite
 	public static void interfaceMethodA4() {
 		System.out.println("I can declare method body if I declare the method as static");
 	}

}