package SUPER_CONSTRUCTOR;

public class SubClass extends SupperClass{
	SubClass(int age){
		super(age);
	}

	public static void main(String[] args) {
		SubClass s= new SubClass(24);
		s.getAge();
	}

}
