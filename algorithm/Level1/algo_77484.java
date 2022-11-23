package algorithm.Level1;

class Solution {

    public static int[] solution(int[] lottos, int[] win_nums) {
        int zero = 0;
        int matched = 0;

        for(int lotto:lottos){
            if (lotto == 0){
                zero += 1;
            }
            else{
                for (int w:win_nums){
                    if (lotto == w){
                        matched+=1;
                        break;
                    }
                }
            }
        }
    
    int min = matched;
    int max = matched + zero;

    int[] answer = {Math.min(7-max, 6), Math.min(7-min, 6)};

    return answer;


    }

    public static void main(String[] args) {
        int[] lottos = {1,2,3,4,5};
        int[] win_nums = {2,3,4,5,1};

        int[] result = solution(lottos, win_nums);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}