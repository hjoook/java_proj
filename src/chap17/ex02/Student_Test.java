package chap17.ex02;

import java.util.ArrayList;
import java.util.List;

public class Student_Test {

	public static void main(String[] args) 
	{
		//1.Student 객체 생성		
		Student s1 = new Student();                 //기본 생성자 호출
		Student s2 = new Student("홍길동");
		Student s3 = new Student(1111);
		Student s4 = new Student("김길동", "서울");
		Student s5 = new Student("최길동", "서울", 1111);
		
		//2.객체를 ArrayList<Student> 에 저장 , 
		/*<타입> : 제너릭 타입, 객체형 타입이 적용되어야 함.
		 	    int : Integer
		        double : Double
		        long : Long
		        boolean :Boolean
		        byte : Byte
		        char : Charcter
		 */
		List<Student> aList = new ArrayList();  
	
		// aList 에 Student 객체 저장
		aList.add(s1);
		aList.add(s2);
		aList.add(s3);
		aList.add(s4);
		aList.add(s5);
		
		//System.out.println(aList);
/*
		 [Student [name=null, addr=null, num=0, kor=0, eng=0, math=0], 
          Student [name=홍길동, addr=null, num=0, kor=0, eng=0, math=0], 
          Student [name=null, addr=null, num=1111, kor=0, eng=0, math=0], 
          Student [name=김길동, addr=서울, num=0, kor=0, eng=0, math=0], 
          Student [name=최길동, addr=서울, num=1111, kor=0, eng=0, math=0]]
		
	*/	
		int[] arr = new int[] {1,2,1,3,3,3,4,5,5};
		
	    //1. Method (클래스, 타입) ==> 객체 생성
		Method m = new Method();
		m.arrayListOut(aList);
		
		System.out.println("======arrayOutput========");
		m.arrayOutput(arr, 1);  //인풋받은 정수는 : 1 이고, 배열에 2 개 있습니다.
		m.arrayOutput(arr, 2);  //인풋받은 정수는 : 2 이고, 배열에 1 개 있습니다.
		m.arrayOutput(arr, 3);  //인풋받은 정수는 : 3 이고, 배열에 3 개 있습니다.
		m.arrayOutput(arr, 5);  //인풋받은 정수는 : 5 이고, 배열에 2 개 있습니다.
	
		System.out.println("======nameAddr========");
		m.nameAddr(aList);
		
		
		aList.add(new Student("이순신",50,30,65));
		aList.add(new Student("이순신2",56,67,55));
		aList.add(new Student("이순신3",51,63,73));
		
		System.out.println("======all========");
		m.all(aList);
		
		System.out.println("======sMethod=======");
		m.sMethod(new Student("abc",77,55,90));
	}

}



