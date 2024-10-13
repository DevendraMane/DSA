package Basic.pattern2;

public class inverted_pyramid {
    public static void inverted_nums(int n) {
        // 1st loop is for no. of lines
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i + 1); j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        inverted_nums(5);
    }
}
