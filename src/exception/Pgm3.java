package src.exception;

class Demo{
	void fun1() {
		System.out.println("Inside fun1()");
		fun2();
	}
	void fun2(){
		System.out.println("Inside fun2()");
		int a=10,b=0,c;
		c = a/b;
		System.out.println("Div result is " + c);
	}
}



public class Pgm3 {

	public static void main(String[] args) {
		System.out.println("Inside main()");
		Demo d1 = new Demo();
		try {
			d1.fun1();
		}
		catch(Exception e) {
			System.out.println("Problem resolved in main()");
		}
		System.out.println("Exiting main()");
	}

}
