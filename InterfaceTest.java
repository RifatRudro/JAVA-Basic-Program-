public class InterfaceTest {

	public static void main(String[] args) {

		// We can not create any objects of an interface
		// error: IInterfaceDemo is abstract; cannot be instantiated
		// IInterfaceDemo iD1 = new IInterfaceDemo();

		// but we can take object reference.
		// IInterfaceDemo iD2;

		// Interface attributes are by default static test
		System.out.println(IInterfaceDemo.x);

		// Interface attributes are by default final test
		// error: cannot assign a value to final variable x 
		// IInterfaceDemo.x = 30;

		// This is an static interface method, That's why I am able to call it in this way
		IInterfaceDemo.interfaceMethodA4();

		//  error: non-static method interfaceMethodA3() cannot be referenced from a static context
		// IInterfaceDemo.interfaceMethodA3();
	}
}