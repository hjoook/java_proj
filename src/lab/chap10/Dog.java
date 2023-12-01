package lab.chap10;

public class Dog extends Animal{
	
	Dog(){}

	Dog(String dogName){
    	//super(); // 생략가능, 첫라인에 작성    	 
    	this.dogName  =  dogName;    	
    }
	
	// 필드
    String dogName;
	
	
	//메소드
	void DogOut() {
		System.out.println("Dog output. ");
	}
}
