package lab;

public class ConsoleOutPut1 {

	public static void main(String[] args) 
	{
		//변수선언
		String fatherName = "홍길동";
		String motherName = "홍길순";
		String myName     = "홍당무";
		
		int age =30;
		
		double weith1 = 70.5;
        double weith2 = 50.7;
        
        //printfln();
        System.out.println("=====println()=====");
        System.out.println("우리 아버님 이름은 "      + fatherName +
        		           "이고, 우리 어머님 이름은 " + motherName + 
        		           "입니다 \n나의 이름은 "    + myName     +
        		           "이고, 나이는 "          + age        +
        		           "이고, 몸무게는 "         + weith1     +
        		           "킬로 입니다.");
        
        //printf();
        System.out.println();
        System.out.println("=====printf()======");
        System.out.printf("우리 아버님 이름은 %s이고, 우리 어머님 이름은 %s입니다.\n나의 이름은 %s이고, 나이는 %d이고, 몸무게는 %.1f킬로 입니다.\n"
        		          ,fatherName, motherName, myName, age, weith1);
	}

}
