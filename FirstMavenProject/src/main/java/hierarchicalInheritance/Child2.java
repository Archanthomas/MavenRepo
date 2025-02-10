package hierarchicalInheritance;

public class Child2 extends Parent {

	public static void main(String[] args) {
		
		Child2 obj1 = new Child2();
		obj1.instance();
		
		Child2.sample();

	}
	
	public static void sample()
	
	{
		
		System.out.println("Method of child2");
	}

}
