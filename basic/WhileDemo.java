package basic;
public class WhileDemo {
    public static void main(String[] args){
        int sum = 0;
        int i = 1;
        while(i<=10){
            sum += i;
            i++;
        }
        System.out.println("1~10의 합: "+sum);
    }
}
