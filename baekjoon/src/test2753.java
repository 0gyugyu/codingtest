// 백준_조건문_3단계_윤년

import java.util.Scanner;

public class test2753 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        // 윤년은 4의 배수, 400의 배수, 100의 배수는 아님
        if(year%4 == 0){    //4의 배수
            if (year%400 == 0) System.out.println("1"); // 4의 배수이면서 400의 배수 - 윤년
            else if (year%100 == 0) System.out.println("0"); //4의 배수이면서 100의 배수 -> 윤년 아님
            else System.out.println("1"); // 400의 배수도 아니고, 100의 배수도 아닌 4의 배수 인 것 -> 윤년
        }else System.out.println("0");
    }
}
