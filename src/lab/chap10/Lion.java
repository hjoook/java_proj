package lab.chap10;

public class Lion extends Animal{

	Lion(String tName){
    	//super(); // 생략가능, 첫라인에 작성
    	 
    	this.lName  =  lName;    	
    }
	
	// 필드
    String lName;
	
	
	//메소드
	void LionOut() {
		System.out.println("Lion output. ");
	}
}
