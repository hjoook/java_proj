package openai;

public class Array_Ditinition4 {

    public static void main(String[] args) {
        // 2차원 배열 [5][10] 선언
        int[][] arr = new int[5][10];

        // arr[0]: 짝수 저장
        for (int j = 0; j < arr[0].length; j++) {
            arr[0][j] = (j + 1) * 2;
        }

        // arr[1]: 홀수이면서 3의 배수가 아닌 값 저장
        for (int j = 0, value = 1; j < arr[1].length; value += 2) {
            if (value % 3 != 0) {
                arr[1][j++] = value;
            }
        }

        // arr[2]: 4, 5의 배수 저장
        for (int j = 0, value = 4; j < arr[2].length; value += 4) {
            arr[2][j++] = value;
        }

        // arr[3]: 10의 배수 저장
        for (int j = 0; j < arr[3].length; j++) {
            arr[3][j] = (j + 1) * 10;
        }

        // arr[4]: 8단 저장
        for (int j = 0; j < arr[4].length; j++) {
            arr[4][j] = 8 * (j + 1);
        }

        // 배열의 내용 출력
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println(); // 다음 행으로 이동
        }
    
    }

}
