package multilevel_inheritance;

public class Child1 extends Parent {

	public static void main(String[] args) {
	
		Child1 obj = new Child1();
		Child1.pare();
		obj.sample();
		

	}
	
	public Child1()
	
	{
		
		System.out.println("Constructor of  Child1");
	}
  
	
	public void sample()
	
	{
		System.out.println("Method of child 1");
	}
}
