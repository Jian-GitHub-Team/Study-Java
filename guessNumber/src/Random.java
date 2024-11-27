import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
    int[] num = new int[5];
    Scanner sc = new Scanner(System.in);
    java.util.Random r = new java.util.Random();
    for (int i = 0; i < num.length; i++) {
        num[i] = sc.nextInt();
    }
    int tem = 0;
    for (int i = 0; i < num.length; i++) {
        tem = num[i];
        num[i] = num[r.nextInt(5)];
        num[r.nextInt(5)] = tem;
    }

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
        }

    }
}
