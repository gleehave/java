package basic;
public class ForDemo {
    public static void main(String[] args){
        int sum = 0;
        for(int i=1; i<=10; i++){
            sum += i;
        }
        System.out.println("1~10의 합: "+sum);
    }
}
