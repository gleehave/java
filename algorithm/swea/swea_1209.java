package algorithm.swea;

import java.util.Scanner;

public class swea_1209 {

    public static int arr[][] = new int[100][100];
    public static int max = -1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int t=1; t<=10; t++){
            int tc = sc.nextInt();
            for(int i=0; i<100; i++){
                for(int j=0; j<100; j++){
                    arr[i][j] = sc.nextInt();
                }
            }

            int result = calMax();
            System.out.println("#"+tc+" "+result);
        }
    }

    public static int calMax(){
        max = -1;
        int dig1 = 0, dig2 = 0;
        for (int i=0; i<100; i++){
            int row=0, col = 0;
            for (int j=0; j<100; j++){
                row+=arr[i][j];
                col += arr[j][i];

                if (i==j) dig1 += arr[i][j];
                else if (i+j == 99) dig2+=arr[i][j];
            }
            int temp = (row >= col) ? row : col;
            max = (max >= temp) ? max : temp;
        }
        int temp2 = (dig1>=dig2) ? dig1 : dig2;
        max = (max >= temp2) ? max : temp2;

        return max;
    }
}