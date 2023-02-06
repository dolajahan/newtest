package demoproject;

public class overinding {

	public static void main(String[] args) {
		
		dog d = new dog ();
		d. eat();
		
		// TODO Auto-generated method stub

	}

}


class Animal 
{
	void eat()
	{System.out.println("eating....inside animal");}
	
}

class dog extends Animal 
{
	void eat()
	{System.out.println("eating....inside dog");}
	
}

