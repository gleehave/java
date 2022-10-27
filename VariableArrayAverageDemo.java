import java.util.Scanner;

public class VariableArrayAverageDemo {
    public static void main(String[] args){
        int[][] scores = new int [3][];

        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<scores.length; i++){
            System.out.print("반 학생 수: ");
            int size = scanner.nextInt();
            scores[i] = new int[size];
        }

        for(int first=0; first<scores.length; first++){
            for(int second=0; second<scores[first].length; second++){
                System.out.print("점수: ");
                scores[first][second] = scanner.nextInt();
            }
        }

        int sum = 0;
        for(int first=0; first<scores.length; first++){
            for(int second=0; second<scores[first].length; second++){
                sum += scores[first][second];
            }
        }

        int totalNum = 0;
        for(int first=0; first<scores.length; first++){
            totalNum = totalNum + scores[first].length;
        }

        int avg = sum / totalNum;
        System.out.println("TotalNum: "+totalNum);
        System.out.println("sum: "+sum);
        System.out.println("Avg: "+avg);

        scanner.close();
    }
}
