package multilevel_inheritance;

public class Child2 extends Child1{

	public static void main(String[] args) {
		 
		Child2 obj1 = new Child2();
		Child2.pare();
		obj1.sample();
	
	}
	
	
	public Child2()
	{
		
		System.out.println("Constructor of Child 2");
	}

}
