import java.util.Random;
import java.util.Scanner;

public class luckyNumber {
    public static void main(String[] args) {
        int[] userNumber = getLuckyNumber();
        printArray(userNumber);

        int[] luckyNumber = randomNumber();
        printArray(luckyNumber);

        judge(luckyNumber,randomNumber());
    }

    public static void printArray(int[] numbers) {
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(i == numbers.length - 1 ? numbers[i] : numbers[i] + ", ");
        }
        System.out.print("]");
    }

    public static int[] getLuckyNumber() {
        Scanner sc = new Scanner(System.in);
        int[] luckyNumber = new int[7];
        for (int i = 0; i < luckyNumber.length - 1; i++) {
            while (true) {
                System.out.println("请输入第" + (i + 1) + "个红球号码(1-33之间，不能重复):");
                int numbers = sc.nextInt();
                if (numbers < 1 || numbers > 33) {
                    System.out.println("您输入的红球号码不在1-33之间");
                } else {
                    if (exist(luckyNumber, numbers)) {
                        System.out.println("对不起， 您当前输入的号码重复了");
                    } else {
                        luckyNumber[i] = numbers;
                        break;
                    }
                }
            }
        }
        while (true) {
            System.out.println("请输入最后一个篮球号码1-16");
            int number = sc.nextInt();
            if (number < 1 || number > 16) {
                System.out.println("对不起，您输入的号码不正确，请再次输入");
            } else {
                luckyNumber[6] = number;
                break;
            }
        }
        return luckyNumber;
    }

    public static boolean exist(int[] numbers, int number) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                break;
            }
            if (numbers[i] == number) {
                return true;
            }
        }
        return false;
    }

    public static int[] randomNumber(){
        int[] randomNumber = new int[7];
        Random r = new Random();
        for (int i = 0; i < randomNumber.length-1; i++) {
            while (true) {
                int number = r.nextInt(1,34);
                if (exist(randomNumber, number)) {
                    //说明重复了
                } else {
                    randomNumber[i] = number;
                    break;
                }
            }
        }
        randomNumber[6] = r.nextInt(1,17);
        return randomNumber;
    }

    public static void judge(int[] luckyNumber, int[] randomNumber) {
        int redCount = 0;
        int blueCount = 0;
        for (int i = 0; i < luckyNumber.length-1; i++) {
            for (int j = 0; j < randomNumber.length-1; j++) {
                if (luckyNumber[i] == randomNumber[j]) {
                    redCount++; //命中一个 +1
                    break;
                }
            }
        }
        //判断篮球是否命中
        blueCount = luckyNumber[6] == randomNumber[6]? 1 : 0;
        System.out.println("命中的红球数量" + redCount);
        System.out.println("命中的篮球数量" + blueCount);
    }
}
