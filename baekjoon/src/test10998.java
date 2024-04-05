// 컴파일러 설치해서 직접 실행해보고 결과 학인한 다음
// 제출할 때 컴파일을 통해서 실행한 후에 제출하고 있는거 맞지?
// 입력 값에 범위 주어지면 범위에 대해 예외처리 할 필요 없어

// 입력받기 위해 Scanner를 사용함
// scanner의 nextLine()메소드는 엔터 포함 입력한 한 줄
// next() : 엔터키로 구분된 하나의 단어 String
// nextInt() :  "  int형

// scanner는 다음 입력을 찾기 위해 정규식을 사용 -> 느림
// BufferedReader를 사용하는게 속도에서 유리함


import java.util.Scanner;

public class test10998 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //system.in은 키보드 입력을 의미함

        System.out.println("a의 값을 입력해주세요 ->");
        int a = sc.nextInt();

        System.out.println("b의 값을 입력해주세요 ->");
        int b = sc.nextInt();

        System.out.println("계산된 합계 ---> " + a * b);
    }
}
