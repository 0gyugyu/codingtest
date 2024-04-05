import java.util.Scanner;

public class test1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // nextInt() :  "  int형 라고 배웠는데 실수는 double아닌가?
        // --> 다음 토큰을 리턴할 값을next""으로 지정하면 되는듯

        double a = sc.nextDouble(); //??
        double b = sc.nextDouble();

        System.out.println(a/b);
    }
}
