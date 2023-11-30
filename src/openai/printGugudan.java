package openai;
import java.util.Scanner;



public class printGugudan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자에게 구구단 중 몇 단을 출력할 것인지 입력받기
        System.out.print("구구단 중 몇 단을 출력하시겠습니까? ");
        int dan = scanner.nextInt();

        // 입력된 단의 구구단 출력
        printGugudan(dan);

        scanner.close();
    }

    // 구구단 출력 메소드
    public static void printGugudan(int dan) {
        System.out.println(dan + " 단 출력");
        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + " * " + i + " = " + (dan * i));
        }
    }

}
