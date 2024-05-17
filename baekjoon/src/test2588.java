import java.util.*;

public class test2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String b = sc.next(); //단 하나의 단어를 읽어옴

        System.out.println(a * (b.charAt(2) - '0'));
        System.out.println(a * (b.charAt(1) - '0'));
        System.out.println(a * (b.charAt(0) - '0'));

        System.out.println(a * Integer.parseInt(b));
    }
}
