package array;

public class ArrayDi1 {
    public static void main(String[] args) {

        // 2 x 3 2차원 배열을 만든다.
        int[][] arr =new int[2][3]; // 행 2 , 열 3

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;


        for(int row =0; row<2; row++){
            // 0행 출력
            System.out.print(arr[row][0] + " "); // 0열 출력
            System.out.print(arr[row][1] + " "); // 1열
            System.out.print(arr[row][2] + " "); // 2열
            System.out.println(); // 라인 변경

        }
    }
}
