package array;

public class ArrayDi4 {
    public static void main(String[] args) {

        // 2 x 3 2차원 배열을 만든다.
        int[][] arr =new int[3][3];// 행 2 , 열 3


        int i = 1;
        for (int row = 0; row<arr.length; row++){
            for (int column = 0; column<arr[row].length; column++){
                arr[row][column] = i++;
            }
        }
        for(int row =0; row < arr.length; row++){
            for(int column = 0; column < arr[row].length; column++){
                System.out.print(arr[row][column] + " "); // 0열 출력
            }
            System.out.println(); // 라인 변경
        }
    }
}
