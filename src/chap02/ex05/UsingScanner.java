package chap02.ex05;

import java.util.Scanner;

public class UsingScanner {

	public static void main(String[] args) {
		/*
		 * 외부의 라이브러리 사용하기 : 자바에서 만들어진 클래시의 묶음 import 가 필요함 : java.lang 패키지의 클래스는 import
		 * 없이 바로 사용가능
		 * 
		 * Scanner : 콘솔로부터 입력값을 받아오는 클래스 (객체) 외부 클래스 : java.lang 외부에 존재하는 클래스 . import 가
		 * 필요 동일한 패키지에 존재하는 클래스는 import 없이 사용가능 동일한 패키지에 존재하지 않는 클래스는 import
		 * java.util.Scanner : 클래스 전체 이름 - 패키지명.클래스명 Ctrl + Shift + o : 자동으로 import
		 * 
		 */

		System.out.println();
		String a;

		// 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);

		String fName; // 아버지 이름
		String mName; // 어머니 이름
		String myName; // 나의 이름

		
		System.out.println("아버지 이름을 입력 하세요 >>>"); fName = sc.next(); // sc.next() :
		  //콘솔로 문자열을 입력 받음
		  
		System.out.println("어머니 이름을 입력 하세요 >>>"); mName = sc.next();
		
		System.out.println("나의 이름을 입력 하세요 >>>"); myName = sc.next();
		
		System.out.println("입력 받은 아버님 이름은 : " + fName);
		System.out.println("입력 받은 어머님 이름은 : " + mName);
		System.out.println("입력 받은 나의  이름은 : " + myName);
		
		System.out.println("==============================");

		// 스캐너로 정수값 입력 받기
		int aa;
		int bb;
		int cc;

		System.out.println("aa bb cc 변수에 정수값을 공백으로 입력하세요 >>>>");

		aa = sc.nextInt(); // 콘솔에서 정수값 입력
		bb = sc.nextInt();
		cc = sc.nextInt();

		System.out.println("aa : " + aa + "\nbb : " + bb + "\ncc : " + cc);

	}

}
