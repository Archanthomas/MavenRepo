package super_keyword;

public class Child extends Parent {
	
	int a =7;

	public static void main(String[] args) {
		
	Child obj = new Child();
	obj.instance();
	

	}
	
	
	public void instance()
	{
	super.instance_parent();	
	System.out.println("Method of child class");
	System.out.println(super.a); // calling parent class instance variable
	System.out.println(a); //calling child class instance variable
		
	}
	
	public Child()
	
	{
		super();
		System.out.println("Constructor of child class");
	}
	

}
