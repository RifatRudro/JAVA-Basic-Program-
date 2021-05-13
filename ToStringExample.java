public class ToStringExample {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setId(1);
		p1.setName("Mr. Abc");

		/*System.out.println(p1.show());*/

		Person p2 = new Person();
		p2.setId(2);
		p2.setName("Mr. Def");

		/*System.out.println(p2.show());*/

		System.out.println(p1);
		System.out.println(p2);

		System.out.println();

		System.out.println(p1.toString());
		System.out.println(p2.toString());
	}
}

// Class Person extends Object
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

 	/*public String show() {
 		return "id: " + id + " name: " + name; 
 	}*/

 	public String toString() {
 		return "id: " + id + " name: " + name + " super representation: " + super.toString(); 
 	}
}