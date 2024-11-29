import java.util.Random;
import java.util.Scanner;

public class Hongbao {
    public static void main(String[] args) {
    int[] money = {22,33,44,55,66};
    pickHongBao(money);

    }

    public static void pickHongBao(int[] money){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        for (int i = 1; i <= 5; i++) {
            sc.next();
            while (true) {
                int id = random.nextInt(money.length);
                int m = money[id];
                if (m != 0){
                    System.out.println("中将" +m);
                    money[id] = 0;
                    break;
                }
            }
        }
        System.out.println("活动结束");
    }
}
