import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Who's our technology guru? Please input you answer:");
        while(true){
            String input = scanner.nextLine();
            if (input.equals("Qi Jian") || input.equals("qijian") || input.equals("祁剑")){
                System.out.print("Correct!");
                break;
            }
            else System.out.print("Incorrect. Please change your answer and input again: ");
        }
    }
}