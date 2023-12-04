package lab.chap10;

public class Inheritance_Test {

	public static void main(String[] args) {
		/* 상속 설정 후  필드와 메소드 생성
		   Animal 
		     Tiger
		         TigerChild
		     Lion
		     Dog
		     
		   업캐스팅 <=> 다운캐스팅
		   
		   */
		
		Dog a1 = new Dog(null);
		
		a1.ani ="Dog";
		a1.dogName = "멍멍이";
		
		a1.DogOut();
		System.out.println(a1.dogName);
		
		a1.Animal("Tiger");
		a1.AniEtc();
		

	}

}
