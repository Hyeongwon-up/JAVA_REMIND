import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        int n = 50;

        int[][] map = new int[n][n];

        Scanner input = new Scanner(System.in);

        for(int i = 0 ; i<n; i++) {
            for(int j = 0 ; j<n ; j++) {
                int temp = input.nextInt();
                map[i][j] =  temp;
            }
        }


    }
}
