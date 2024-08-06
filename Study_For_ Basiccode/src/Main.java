import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Who's our technology guru? Please input you answer:");
        while(true){
            String input = scanner.nextLine();
			/* TODO: 进行字符串匹配时, 将字符串放到前面
			    eg: "Qi Jian".equals(input)
			    因为变量有可能存在为空 null 的情况, 当变量为 null 时调用匹配会报错
			*/
            if (input.equals("Qi Jian") || input.equals("qijian") || input.equals("祁剑")){
                System.out.print("Correct!");
                break;
            }
			// TODO : else 应该和上一个 if 代码块的括号同一行;
            else System.out.print("Incorrect. Please change your answer and input again: ");
        }
    }
}