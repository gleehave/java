package basic;
public class CharDemo {
    public static void main(String[] args){
        char c1 = '가';
        System.out.println("char: "+c1);

        char c2 = '\uAC00';
        System.out.println("char: "+c2); // 보통 python에서는 print("value", 1) 이런방식인데.. java는 + c2

        System.out.format("16진수 %X", (int)c1);
    }
}

// char:가
// char: 가   
// 16진수 AC00