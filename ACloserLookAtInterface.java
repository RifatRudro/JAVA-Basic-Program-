public class ACloserLookAtInterface {

	public static void main(String[] args) {

	}
}

// 1. interface can not inherit a class

/*class ClassZ {

	public static final int x = 20;

	private int a;

	public void setA(int a) {
		this.a = a;
	}

	public int getA() {
		return a;
	}
}

interface IInterfaceZ extends ClassZ {

}

interface IInterfaceZ implements ClassZ {
	
}*/

// 2. interface can extends other interfaces (Multiple or single)

interface IInterfaceA {
	void interfaceMethodA1();
}

interface IInterfaceB extends IInterfaceA {
	void interfaceMethodB1();
}

interface IInterfaceC {
	void interfaceMethodC1();
}

interface IInterfaceD {
	void interfaceMethodD1();
}

interface IInterfaceE extends IInterfaceB, IInterfaceC, IInterfaceD {
	void interfaceMethodE1();
}


abstract class ClassZ implements IInterfaceA {

}

// error: ClassA is not abstract and does not override abstract method interfaceMethodB1() in IInterfaceB
// Solution 1
// abstract class ClassA implements IInterfaceB {...}
class ClassA implements IInterfaceB {

	//attempting to assign weaker access privileges; was public
	// Don't forget to provide public keyword

	public void interfaceMethodA1() {
		System.out.println("1. CLassA - interfaceMethodA1()");
	}
	public void interfaceMethodB1() {
		System.out.println("2. CLassA - interfaceMethodB1()");
	}
}

class ClassB implements IInterfaceC, IInterfaceD {

	public void interfaceMethodC1() {
		System.out.println("3. CLassB - interfaceMethodC1()");
	}
	public void interfaceMethodD1() {
		System.out.println("4. CLassB - interfaceMethodD1()");
	}
}

class ClassC extends ClassA implements IInterfaceC, IInterfaceD {

	public void interfaceMethodC1() {
		System.out.println("3. CLassC - interfaceMethodC1()");
	}
	public void interfaceMethodD1() {
		System.out.println("4. CLassC - interfaceMethodD1()");
	}

	public void interfaceMethodA1() {
		System.out.println("5. CLassC - interfaceMethodA1()");
	}
	public void interfaceMethodB1() {
		System.out.println("6. CLassC - interfaceMethodB1()");
	}
}

