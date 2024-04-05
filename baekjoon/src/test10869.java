import java.util.*;

public class test10869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 처음에는 double로 했는데, 소수점이 나옴...
        // 예제 출력에서는 소수점이 나오지 않기에 int로 다시 변경

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

    }
}
