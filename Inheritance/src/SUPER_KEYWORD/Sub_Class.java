package SUPER_KEYWORD;

public class Sub_Class extends Super_Class {
	int num = 10;
	
	//display method of sub class
	
	public void display() {
		System.out.println("This is the display method of subclass");
	}
	
	public void my_method() {
		//instantiating subclass
		Sub_Class sub= new Sub_Class();
		
		// invoking the display() method of sub class
		sub.display();
		
		//invoking the display() method of superClass
		super.display();
		
		//printing the value of variable num of subclass
		System.out.println("value of the variable named num in sub class:"+ sub.num);
		
		//printing the value of variable num of superclass
		System.out.println("value of the variable named num in superClass:"+super.num);
		
	}
}
