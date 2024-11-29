// 백준_조건문_2단계_시험성적
// 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class test9498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("당신의 시험 점수를 입력하시오 --------> ");
        int var = sc.nextInt();    //변수 var을 생성하고, 정수형태의 입력을 받을 것임
        
        if(var>=90) System.out.println("A");
        else if (var>=80) System.out.println("B");
        else if (var>=70) System.out.println("C");
        else if (var>=60) System.out.println("D");
        else System.out.println("F");
        }
    }

