public class MyClass {
    //생성자를 만든다.
    // 1. 생성자는 반환값이 없는 메소드이다.
    // 2. 객체 생성 시 실행된다.
    // 생성자 이름은 클래스 이름과 동일하다.
    // 오버로딩으로 복수 선언이 가능하다.

    MyClass() {
        System.out.println("No Param");
    }

    MyClass(int p){
        System.out.println("int: "+p);
    }

    MyClass(String p){
        System.out.println("String: "+p);
    }

    public static void main(String[] args){
        MyClass obj1 = new MyClass();

        MyClass obj2 = new MyClass(1);

        MyClass obj3 = new MyClass("exam");
    }
}
