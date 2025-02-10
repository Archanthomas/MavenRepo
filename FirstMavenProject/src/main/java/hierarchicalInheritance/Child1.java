package hierarchicalInheritance;

public class Child1 extends Parent {

	public static void main(String[] args) {
		
		Child1 obj = new Child1();
		obj.instance();
	}

	public Child1()
	{
		
		System.out.println("Child class constructor");
	}
}
