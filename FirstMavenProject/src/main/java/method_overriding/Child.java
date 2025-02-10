package method_overriding;

public class Child extends Parent{

	public static void main(String[] args) {
		  
		
		Child obj = new Child();
		obj.instance();
		obj.newmethod("parameterized overriding example");

	}
	
	public void instance()
	
	{
		super.instance();   //calling objects of immediate parent class using super keyword.
		System.out.println("Method of child class ");
	}

	
	public void newmethod(String a)
	
	{
		super.newmethod("Parent class");  // calling objects of immediate parent class using super keyword.
		System.out.println(a);
	}
}
