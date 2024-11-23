import java.util.Random;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Random r = new Random();
        //int A = r.nextInt(5,10);  //包含前面不包含后面
        int a = r.nextInt(1,101);
        //System.out.println(a);
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        while (true) {
            if (b > a){
                System.out.println("bigger");
            } else if (b <a ) {
                System.out.println("smaller");
            }else {
                System.out.println("same");
                break;
            }
        }

    }
}
