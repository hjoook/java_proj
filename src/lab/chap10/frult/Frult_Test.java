package lab.chap10.frult;

import java.util.ArrayList;
import java.util.List;

import lab.chap10.Tiger;
import lab.chap10.car.Car;

public class Frult_Test {

	public static void main(String[] args) {
		/* 자식 객체를 생성 후 
		   Apple("사과", 30, 5000) Fruit 타입으로 정의
		   Banana("바나나", 44, 6000)
		   Strawberry("딸기", 55, 7000)
		   ArrayList 객체 3개를 저장
		   For문으로 ArrayList의 객체를 끄집어내서 totalPrice() 호출시 출력
		    
		    자식 객체를 생성하면서 부모 타입으로 저장하면, 배열이나 클래스에 동일한 타입으로 저장.
		   
		   */
		int sum = 0;
		System.out.println("=======Frult fr1==========");
		Frult fr1 = new Frult();
	    fr1.totalPrice();
		
		System.out.println("=======Frult fr2==========");
		Frult fr2 = new Apple();
		fr2.name  = "사과";
		fr2.cnt   = 44;
		fr2.price = 5000;
		fr2.totalPrice();
		
		System.out.println("=======Frult fr3==========");
		Frult fr3 = new Banana();
		fr3.name  = "바나나";
		fr3.cnt   = 30;
		fr3.price = 6000;
		fr3.totalPrice();		
		
		System.out.println("=======Frult fr4==========");
		Frult fr4 = new Strawberry();
		fr4.name  = "딸기";
		fr4.cnt   = 55;
		fr4.price = 7000;
		fr4.totalPrice();		
		
		System.out.println("=======ArrayList==========");
		List<Frult> aList = new ArrayList<>();
		
		aList.add(fr2);
		aList.add(fr3);
		aList.add(fr4);
		
		for (int i = 0; i < aList.size() ; i++)
		{
			aList.get(i).totalPrice();
			sum = sum + (aList.get(i).cnt * aList.get(i).price);
		}
		
		System.out.println();
		fr1.sum = sum;
		fr1.totalPrice();
		
		//다운캐스팅 Apple 자식 메소드 사용
		Apple tt2 = (Apple) fr2;		//Apple 
		tt2.end();  
		


	}

}
