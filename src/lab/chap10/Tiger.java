package lab.chap10;

public class Tiger extends Animal{
	
	Tiger(String tName){
    	//super(); // 생략가능, 첫라인에 작성
    	 
    	this.tName  =  tName;    	
    }
	
	// 필드
    String tName;
	
	
	//메소드
	void TigOut() {
		System.out.println("Tiger output. ");
	}

}


