package lab.chap02;

import java.util.Scanner;

public class UsingScanner {

	public static void main(String[] args) 
	{
		String stu;    // 학생
		String stu1;    // 학생1
		String stu2;    // 학생2
		String stu3;    // 학생3
		
		int kor  ;      // 국어점수
		int eng  ;      // 영어점수
		int math ;      // 수학점수
		
		int hap  ;      // 합계
		
		double avg  ;   // 평균
		
		System.out.println("학생1의 이름 국어점수 영어점수 수학점수를 입력하세요");
		
		// 코드부분
		Scanner sc = new Scanner(System.in);

		stu = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		
		hap = kor + eng + math;
		
		avg = (double)hap / 3;
		
		
		System.out.println(stu +"의 모든 점수의 합계는 " + hap +"점 이고 평균은 " + avg  + "입니다. ");
		
		System.out.printf ("%s의 모든 점수의 합계는 %d점 이고 평균은 %.2f입니다", stu, hap, avg );
		
	}

}
