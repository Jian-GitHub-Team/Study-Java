import java.util.Random;

public class code {
    public static void main(String[] args) {
        System.out.println(testifyCode(5));
    }

    public static String testifyCode(int n) {
        Random r = new Random();
        String code = "";
        for (int i = 1; i <= n; i++) {
            int type = r.nextInt(3); //012
            switch (type) {
                case 0:
                    code += r.nextInt(10);
                    break;
                case 1:
                    char ch1 = (char) r.nextInt(65,91);
                    code += ch1;
                    break;
                case 2:
                    char ch2 = (char) r.nextInt(97,123);
                    code += ch2;
                    break;
            }
        }
        return code;
    }
}
