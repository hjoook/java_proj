package openai;

import java.util.ArrayList;
import java.util.Scanner;

public class Account_Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Account 객체를 담을 ArrayList 생성
        ArrayList<Account> accountList = new ArrayList<>();

        while (true) {
            System.out.print("이름을 입력하세요 (종료하려면 q 입력): ");
            String inputName = scanner.nextLine();

            if (inputName.equalsIgnoreCase("q")) {
                break;
            }

            // 이미 존재하는 이름인지 확인
            boolean isDuplicate = false;
            for (Account account : accountList) {
                if (account.getName().equalsIgnoreCase(inputName)) {
                    isDuplicate = true;
                    System.out.println("이미 존재하는 이름입니다. 다른 이름을 입력하세요.");
                    break;
                }
            }

            if (!isDuplicate) {
                // 계좌 생성
                Account newAccount = new Account(inputName, accountList.size() + 1);
                accountList.add(newAccount);
                System.out.println(inputName + "님의 계좌가 생성되었습니다. 계좌번호: " + newAccount.getAccountNumber());
            }
        }

        // Scanner 닫기
        scanner.close();
    }
}