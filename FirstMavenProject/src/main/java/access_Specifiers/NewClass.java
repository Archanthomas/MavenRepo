package access_Specifiers;

public class NewClass {

	public static void main(String[] args) {
		
		Main obj2 = new Main();
		
		obj2.defaultmethod();
		obj2.protectedmethod();
		obj2.publicmethod();
		// obj2.privatemethod();  ---- can not access since it is private.
		

	}

}
