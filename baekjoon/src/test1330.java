//조건문 - 1.두 수 비교하기

import java.util.Scanner;

public class test1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int var1 = sc.nextInt();
        int var2 = sc.nextInt();

        sc.close();

        if(var1>var2)
            System.out.println(">");

        else if(var1<var2){
            System.out.println("<");
        }
        else{
            System.out.println("==");
        }
        // 삼항 연산자를 사용해서도 가능함
        //System.out.println(var1>var2 ? ">" : var1<var2 ? "<" : "==");
    }
}
