package lab.chap10.car;

import java.util.ArrayList;
import java.util.List;

public class Car_Test {

	public static void main(String[] args) {
		// run() :자식객체를 생성하면서 부모타입으로 지정 후 부모의 메소드 호출시 Overriding 된 자식의 메소드가 작동
		// car.run() : 다향성
		
		
		System.out.println("=======Car ca1==========");
		Car ca1 = new Car();
		//ca1.name = "모든";
		ca1.run();
		
		System.out.println("=======HCar ca2==========");
		Car ca2 = new  H_Car();
		ca2.name ="현대";
		ca2.run();
		
		System.out.println("=======SCar ca3==========");
		Car ca3 = new  S_Car();
		ca3.name ="쌍용";
		ca3.run();
		
		System.out.println("=======KCar ca4==========");
		Car ca4 = new  K_Car();
		ca4.name ="기아";
		ca4.run();

		System.out.println("=======ArrayList==========");
		//ArrayList<Car>
		List<Car> aList = new ArrayList<>();
		
		aList.add(ca1);
		aList.add(ca2);
		aList.add(ca3);
		aList.add(ca4);
		
//		for 문을 사용해서 끄집어 내서 출력
		for(int i = 0 ; i < aList.size() ; i++)
		{
			aList.get(i).run();						
		}

	}

}
