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

//        String str1 = sc.next();
//        String str2 = sc.next();
//
//        int var1 = Integer.parseInt(str1);
//        int var2 = Integer.parseInt(str2);
//        System.out.print(var1 * var2);
    }
}
