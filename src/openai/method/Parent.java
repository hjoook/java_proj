package openai.method;

public class Parent {
	//private 
	
	// private  일때 parent method1 실행	
	private void method1() {		
		System.out.println("parent method1");
	}
	
	// child method1
	/*void method1() {		
		System.out.println("parent method1");
	}*/

	public void method2() {
		method1();
	}
	
}
