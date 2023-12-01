package lab.chap10;

import chap10.ex01.Chird;
import chap10.ex01.Human;
import chap10.ex01.Professor;

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
		
		System.out.println("=======Animal an1==========");
		//기본 생성자 호출
		Animal an1 = new Animal();
		an1.Animal("모든");
		
		System.out.println("=======Tiger/TigerChild d1==========");
		Animal t1 = new TigerChild(); 
		Tiger tt2 = (Tiger) t1;		//Tiger 다운캐스팅
		
		tt2.tName = "타이거";
		tt2.TigOut();
		
		TigerChild ttt3 = (TigerChild) tt2; //TigerChild 사용 다운캐스팅
		ttt3.iChild = 2;

			
		
	/*	
		a1.DogOut();
		System.out.println(a1.dogName);
		
		a1.Animal("Tiger");
		a1.AniEtc();
		
*/
	}

}
