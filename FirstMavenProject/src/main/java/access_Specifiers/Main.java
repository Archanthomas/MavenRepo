package access_Specifiers;

public class Main {

	public static void main(String[] args) {
		
		
		Main obj = new Main();
		obj.publicmethod();
		obj.privatemethod();
		obj.protectedmethod();
		obj.defaultmethod();
		
		
	}
		
		public void publicmethod()
		
		{
			System.out.println("It is a Public method");
		}
     
		
		private void privatemethod()
		{
			
		System.out.println("It is a private method");	
		}
		
	    void defaultmethod()
		
		{
			
			System.out.println("It is a default method");
		}
		
	    protected void protectedmethod()
	    
	    {
	    	
	    	System.out.println("It is a protected method");
	    }
	}

