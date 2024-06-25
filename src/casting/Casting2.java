package casting;

public class Casting2 {
    public static void main(String[] args) {


        double doubleValue = 1.5;
        int intValue = 0;

       // intValue = doubleValue; // 컴파일 오류 발생

        intValue = (int) doubleValue; // 명시적 형변환
        System.out.println(intValue); // "1" 반환 0.5 날아감


        System.out.println(10.5);
        System.out.println((int) 10.5);


    }
}
