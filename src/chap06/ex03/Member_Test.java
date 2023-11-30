package chap06.ex03;

public class Member_Test 
{
	public static void main(String[] args) 
	{
		//같은 패키지 내에서는 import 없이 클래스를 사용할 수 있다
		//접근 제어자가 default 이상이어야 한다.
		
		//1. 객체 생성
		Member m1 = new Member();
		Member m2 = new Member();
		Member m3 = new Member();
		Member m4 = new Member();
		
		//2. 객체의 필드 접근 << db에 값을 불러와서 자바 객체에 필드의 값을 주입
		//입력 setter
		m1.setIdx(1);
		m1.setId("ID001");
		m1.setPw("1111");
		m1.setName("홍길동");
		m1.setYear(1998);
		m1.setMonth(8);
		m1.setDay(22);
		m1.setPhone("010-012-0123");
		m1.setAddr("서울");
		
		//입력 setter
		m2.setIdx(2);
		m2.setId("ID002");
		m2.setPw("1112");
		m2.setName("aaa");
		m2.setYear(1999);
		m2.setMonth(9);
		m2.setDay(23);
		m2.setPhone("010-012-0124 ");
		m2.setAddr("서울2");
		
		//입력 setter
		m3.setIdx(3);
		m3.setId("ID003");
		m3.setPw("1113");
		m3.setName("bbb");
		m3.setYear(2000);
		m3.setMonth(10);
		m3.setDay(24);
		m3.setPhone("010-012-0125");
		m3.setAddr("서울3");
		
		//입력 setter
		m4.setIdx(4);
		m4.setId("ID004");
		m4.setPw("1114");
		m4.setName("ccc");
		m4.setYear(2001);
		m4.setMonth(11);
		m4.setDay(25);
		m4.setPhone("010-012-0126");
		m4.setAddr("서울4");
		
		//3. 필드의 값을 출력 : getter
		System.out.println(m1.getIdx());
		System.out.println(m1.getId());
    	System.out.println(m1.getPw());
	    System.out.println(m1.getName());
		System.out.println(m1.getYear());
		System.out.println(m1.getMonth());
		System.out.println(m1.getDay());
		System.out.println(m1.getPhone());
		System.out.println(m1.getAddr());
		
		//4. 객체 자체를 클릭시 객체의 heap 의 주소가 출력
		System.out.println(m1);  // chap06.ex03.Member@76a3e297
		System.out.println(m2);  // chap06.ex03.Member@4d3167f4 
		System.out.println(m3);  // chap06.ex03.Member@ed9d034  
		System.out.println(m4);  // chap06.ex03.Member@6121c9d6 
		                            
		//@Override 있을때
		System.out.println(m1);  // Member [idx=1, id=ID001, pw=1111, name=홍길동, year=1998, month=8, day=22, phone=010-012-0123, addr=서울]
		System.out.println(m2);  // Member [idx=2, id=ID002, pw=1112, name=aaa, year=1999, month=9, day=23, phone=010-012-0124, addr=서울2]
		System.out.println(m3);  // Member [idx=3, id=ID003, pw=1113, name=bbb, year=2000, month=10, day=24, phone=010-012-0125, addr=서울3]
		System.out.println(m4);  // Member [idx=4, id=ID004, pw=1114, name=ccc, year=2001, month=11, day=25, phone=010-012-0126, addr=서울4]
		
		System.out.println("============================");
		
		//5. 객체를 배열 => 컬렉션 (ArrayList)에 저장		
		Member[] arr = new Member[10];
		
		arr[0] = m1;
		arr[1] = m2;
		arr[2] = m3;
		arr[3] = m4;
		//arr[4] = m1;
		
		//6.배열의 정보를 끄집어 내서 출력
	    for(int i = 0; i < arr.length ; i++)
	    {
	    	Member mem1 =  arr[i];
	    	System.out.println(mem1);
	    }
	
	} // main

}
