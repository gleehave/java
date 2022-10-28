package basic;
public class BooleanDefaultDemo {
    static boolean flag;
    public static void main(String[] args){
        System.out.println("boolean 기본값:" + flag); // boolean 기본값: false
        
        boolean flag = true; // 값을 할당 할 때에도 타입을 지정. python이랑 다르네..
        System.out.println("boolean 출력값:" + flag);
    }
}
