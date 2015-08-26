package temp;

public class Greeting {
	public static String sayHello(String name) {
	    return "Hello " + name;
	  }
	
	Greeting hello = new Greeting(); String greeting = hello.sayHello("John");
	String greeting = Greeting.sayHello("John");
	String greeting = Greeting.sayHello();
	boolean greeting = Greeting.sayHello("John");
	
	}



	


