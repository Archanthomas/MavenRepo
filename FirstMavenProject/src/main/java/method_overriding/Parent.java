package method_overriding;

public class Parent {
	
	
	public void instance()
	
	{
		
		System.out.println("Method of parent class"); // overriding non parameterizeed method
		
	}

	
	public void newmethod(String a)  //overriding parameterized method
	
	{
		System.out.println(a);
	}
}
