import java.util.Scanner;

public class SumOfEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int sum = 0;
        for (int i = 1; i < num.length(); i += 2) {
            if (Character.isDigit(num.charAt(i))) {
                sum += num.charAt(i) - '0';
            }
        }
        System.out.println(sum);
    }
}
