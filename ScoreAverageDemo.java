import java.util.Scanner;

public class ScoreAverageDemo {
    public static void main(String[] args){
        int[] scores = new int[5];
        Scanner scanner = new Scanner(System.in);
        // System.in?
        // 키보드와 연결된 자바의 표준 입력 스트림.
        // 입력되는 키를 바이트로 리턴하는 저수준 스트림.


        for(int i=0; i<5; i++){
            scores[i] = scanner.nextInt();
        }

        int sum = 0;
        for(int i=0; i<5; i++){
            sum+=scores[i];
        }

        int avg = sum/5;
        System.out.println("AVG: "+avg);
        scanner.close();
    }
    
}