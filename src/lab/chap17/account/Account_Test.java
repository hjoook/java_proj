package lab.chap17.account;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Account_Test {

	public static void main(String[] args) {	
		
		Scanner sc = new Scanner(System.in);
		
		//List<Account> aList = new ArrayList<>();
		Account a = new Account();
		String bb = new String();
		
		int select ;
		
				
		out : do {						
			System.out.println("==============");
			System.out.println("0.계좌이름과 계좌번호를 등록 >>");
			System.out.println("1.입금 >>");
		    System.out.println("2.출금 >>");
		    System.out.println("3.종료 >>");
		    System.out.println("==============");
		    System.out.println("위 내용의 정수를 입력 하세요");
		    select = sc.nextInt();
		    
		    switch(select){
		    case 0:		
		    	    System.out.println("계좌명과 계좌번호를 입력하세요");
		    	    bb = a.name;
		    	    a.name = sc.next();
		    	    if (a.name.equalsIgnoreCase(bb))
		    	    {
		    	    	System.out.println("기존 계약자가 존재합니다.");
		    	    	break;
		    	    }
				    a.account = sc.nextInt();
		    	    System.out.println(a);
		    	    System.out.println("계좌이름 : " +a.getName() + "계좌번호 : " + a.getAccount() + " 잔액은 " + a.getMoney() + "원 입니다.");
		    	    	    	    
		    	    System.out.println(a.name);
		    	    System.out.println(bb);
		    	    break;
		    case 1: 
		    	    System.out.println("입금 금액을 입력하세요");
		    	    a.deposit(sc.nextInt());
		    	    break;
		    case 2: 
		    	    System.out.println("출금 금액을 입력하세요");
		    	    a.withdraw(sc.nextInt());
		    	    break;
		    case 3:	
		    	
		        break out;
		    }
		}while(true);
		
		System.out.println("프로그램 종료");
		
		sc.close();

	} // main

}
