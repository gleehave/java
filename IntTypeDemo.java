public class IntTypeDemo {
    public static void main(String[] args){
        int hexNumber = 0x10;  // 16진수로 표현하려면 0x를 붙인다.
        int octNumber = 010;  // 8진수로 표현하려면 0을 붙인다.

        System.out.println("hexNumber 16진수 출력: "+hexNumber);
        System.out.println("octNumber 8진수 출력: "+octNumber);

        System.out.printf("hexNumber 16진수 출력 %x: ", hexNumber);
        System.out.printf("\noctNumber 8진수 출력 %o: ", octNumber);
    }
}

// system.out.print
// 형식(int, float, double 등)에 구애받지 않는 문자를 그대로 출력하고 싶을 때 사용
// 엔터 입력시 버퍼에 \n 는 포함 안됨.
// 즉, 줄바꿈 필요없을 때 println말고 print 사용

//system.out.println
// print와 동일하게 형식(int, float, double등)에 구애받지 않는 문자를 그대로 출력하고 싶을 때 사용.
// 차이점은 엔터 입력시 버퍼에 \n 개행문자가 같이 들어감.

//system.out.printf
// 형식을 신경써야할 때 사용
// 엔터 입력 시, 버퍼(buffer)에 \n 개행문자 포함 안됨.