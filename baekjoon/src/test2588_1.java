import java.util.Scanner;

public class test2588_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int var1 = sc.nextInt();
        int var2 = sc.nextInt();

        System.out.println(var1 * (var2 % 10)); // 입력받은 int형 385를 %10 연산하면 몫이 38, 나머지가 5가 나온다.
        System.out.println(var1 * (var2 / 10 % 10)); // 입력받은 int형 385/10 -> 38, 38%10 -> 8.

//        System.out.println(var1 * (var2 / 100));// 3을 472에 곱해야 함
//        => 이럴 경우 입력 받은 수가 1385로 4자리가 되면 13의 값이 저장되는 문제가 발생한다.
//        따라서 아래와 같이 나머지 연산으로 에러를 제어하는 것이 좋은 코드라고 생각된다.

        System.out.println(var1 * (var2 / 100 % 10));

        System.out.println(var1 * var2);
    }
}
