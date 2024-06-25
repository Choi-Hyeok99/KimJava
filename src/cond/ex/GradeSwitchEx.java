package cond.ex;

public class GradeSwitchEx {
    public static void main(String[] args) {

        String grade = "B";

        switch (grade){
            case "A":
                System.out.println("탁월한 성과입니다.");
                break;
            case "B":
                System.out.println("준수한 성과입니다.");
                break;
            case "C":
                System.out.println("아쉬운 성과입니다.");
                break;
            case "D":
                System.out.println("망한 성과입니다.");
                break;

        }
    }
}
