package loop;

public class Continue1 {
    public static void main(String[] args) {

        int i = 1;

        while (i<=5){
            if(i == 3){
                i++;
                continue;
            }
            System.out.println(i); // 1,2,4,5 출력
            i++;
        }
    }
}
