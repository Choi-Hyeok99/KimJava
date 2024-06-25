package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("입력받을 숫자의 갯수를 입력해주세요");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        int max ,min;

        System.out.println(n + "개의 정수를 입력하세요");
        for (int i=0; i<n; i++){
            numbers[i] = sc.nextInt();
        }

        min = max = numbers[0];
        for(int i= 1 ; i<n; i++){

            if(numbers[i] < min){
                min = numbers[i];
            }
            if (numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println("제일 작은 수: " + min);
        System.out.println("제일 큰 수: " + max);
    }
}
