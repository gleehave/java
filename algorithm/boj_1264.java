package algorithm;

import java.util.Scanner;

public class boj_1264 {
    public static void main(String[] args){
        // 'a' 'e' 'i' 'o' 'u'의 개수를 세는 프로그램을 만들자

        Scanner sc = new Scanner(System.in);
        char[] index = {'A','E','I','O','U', 'a', 'e', 'i', 'o', 'u'};

        while (true){
            String str = sc.nextLine();
            if (str.equals("#")){
                break;
            }
            int cnt = 0;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                for (int j=0; j<index.length; j++){
                    if (c == index[j]) {
                        cnt += 1;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}
