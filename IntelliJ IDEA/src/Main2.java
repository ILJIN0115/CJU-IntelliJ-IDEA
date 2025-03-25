// 1. 실수형으로 반지름 선언
// 2. 상수로 PI를 선언
// 3. 계산 = 반지름 * 반지름 *
public class Main2 {
    public static void main2(String[] args) {
        final double PI = 3.14;
        double radius = 10;

        double area = (PI * radius * radius);

        System.out.println("반지름이 "+ (int)radius + "인 원의 면적은 "+ (int)area + "이다.");

    }
}