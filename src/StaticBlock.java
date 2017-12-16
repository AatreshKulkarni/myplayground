package src;

class Parent{
	
	static {
		System.out.println("Parent's Static Block");
	}
	
	{
		System.out.println("Parent's Non Static Block");
	}
	Parent(){
		System.out.println("Parent's Constructor");
		System.out.println();
	}
}
class Child extends Parent{
	static{
		System.out.println("Child Static Block");
		System.out.println();
	}
	
	{
		System.out.println("Child's Non Static Block");
	}
	
	Child(){
		System.out.println("Child's Constructor");
	}
	void hello() {
		System.out.println("Hello World");
	}
}


public class StaticBlock {

	public static void main(String[] args) {
		Child c = new Child();
		System.out.println();
		c.hello();
		
	}

}
