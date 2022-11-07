package basic;

// 제네릭 타입    : List<E>
// 파라미터화된 타입: List<String>
// 원천 타입      : List

public class GenericDemo {
    static class MyHolder<T>{
        T item;
        // 정적 선언은 불가능 static T item; (X)
        // 배열로 선언한다면 T[] item; (O)

        void set(T obj){
            item = obj; // 제네릭 클래스는 new 사용할 수 없음.
        }

        T get(){
            return item;
        }
    }
    static MyHolder<Integer> myHolder = new MyHolder<Integer>();

    static void produce(){
        myHolder.set(6);
        // myHolder.set("6"); // 컴파일 시점에서 타입 오류를 잡아준다.
    }

    static void consume(){
        System.out.println(myHolder.get()/2);
    }

    public static void main(String[] args){
        produce();
        consume();
    }
}
