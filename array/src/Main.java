import java.util.Scanner;

public class Main {

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {

            arr[i] = input.nextInt();
        }

        int result = -1;

        for (int i = 0; i < num; i++) {
            result = max(result, arr[i]);
        }

        System.out.println(result);
    }
}
