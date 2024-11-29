import java.util.Scanner;

public class score {
    public static void main(String[] args) {
        System.out.println(giveScore(6));
    }

    public static double giveScore(int n) {
        double[] scores = new double[n];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            scores[i] = s.nextDouble();
        }
        double max = scores[0];
        double min = scores[0];
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
            if (scores[i] > max) {
                max = scores[i];
            }
            if (scores[i] < min) {
                min = scores[i];
            }
        }
        return (sum - max - min) / n - 2;
        //评委打分 去除最大和最小值
    }
}
