package algorithm;

import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj_2460 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max_people = 0; // 최대 탑승자
        int cur_people = 0; // 현재 탑승자

        for(int i=0; i<10; i++){
            String[] input = br.readLine().split(" ");
            System.out.println("출력되는거 보자:  "+Arrays.toString(input));

            int exit = Integer.parseInt(input[0]);
            int enter = Integer.parseInt(input[1]);

            if (i == 0){
                cur_people += enter;
            } 
            else if (i==9){
                cur_people -= exit;
            } else{
                cur_people -= exit;
                cur_people += enter;
            }

            if(max_people < cur_people){
                max_people = cur_people;
            }
        }
        System.out.println(max_people);
    }
}
