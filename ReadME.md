## SWEA
<details>
<summary> 기초 증명 및 java 활용</summary>
<div markdown="1">

![KakaoTalk_Photo_2023-01-04-21-41-58 013](https://user-images.githubusercontent.com/91510831/210559340-9ae73817-a607-4526-9c1f-5abc05bf134d.jpeg)
![KakaoTalk_Photo_2023-01-04-21-41-58 012](https://user-images.githubusercontent.com/91510831/210559356-f45c21ed-586f-4a7e-a8e7-3b9f0aa1b994.jpeg)
![KakaoTalk_Photo_2023-01-04-21-41-58 011](https://user-images.githubusercontent.com/91510831/210559432-caa9c29a-baae-4284-914d-29d9b35385a1.jpeg)
![KakaoTalk_Photo_2023-01-04-21-41-58 010](https://user-images.githubusercontent.com/91510831/210559450-38309b12-e0c6-4f35-a97c-bac49eb0ddca.jpeg)
![KakaoTalk_Photo_2023-01-04-21-41-58 009](https://user-images.githubusercontent.com/91510831/210559471-f8dc57a1-4900-4430-aa21-482ab7f8136b.jpeg)
![KakaoTalk_Photo_2023-01-04-21-41-58 008](https://user-images.githubusercontent.com/91510831/210559483-5a31035d-ddd8-47f2-a8ff-aee9dbab82f1.jpeg)
![KakaoTalk_Photo_2023-01-04-21-41-58 007](https://user-images.githubusercontent.com/91510831/210559493-885e1a2a-6c73-4d31-936d-b08fee1f513e.jpeg)
![KakaoTalk_Photo_2023-01-04-21-41-58 006](https://user-images.githubusercontent.com/91510831/210559516-e9741064-04d6-4292-983a-66e36d2317d0.jpeg)
![KakaoTalk_Photo_2023-01-04-21-41-58 005](https://user-images.githubusercontent.com/91510831/210559531-7cb3c77b-b81d-46ea-bb1f-c4a15ae08b60.jpeg)
![KakaoTalk_Photo_2023-01-04-21-41-57 004](https://user-images.githubusercontent.com/91510831/210559552-fc7b30ec-6842-4cbe-ba38-5d4996191a41.jpeg)
![KakaoTalk_Photo_2023-01-04-21-41-57 003](https://user-images.githubusercontent.com/91510831/210559566-19a94af7-0369-4897-a325-52be9b030c17.jpeg)
![KakaoTalk_Photo_2023-01-04-21-41-57 002](https://user-images.githubusercontent.com/91510831/210559584-7095a20c-502f-4099-a4cd-57bb3ad1e670.jpeg)
![KakaoTalk_Photo_2023-01-04-21-41-57 001](https://user-images.githubusercontent.com/91510831/210559600-5d318201-4cc8-4b81-8403-3b653e929226.jpeg)

</div>
</details>

## Java 입력
```
Scanner scan = new Scanner(System.in);
```
- System.in은 무엇인가?

```
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
```
- InputStreamReader는 또 무엇인가?

스트림(Stream)을 이해해야 위의 질문을 해결할 수 있다.
- 스트림은 데이터 흐름이다. 또한, 단방향이므로 입력과 출력이 동시에 발생할 수 없다.
- 그러므로 용도에 따라 입력 스트림, 출력 스트림이 나뉜다.
- 자바에서는 가장 기본이 되는 입력 스트림은 InputStream(출력 스트림은 OutputStream)이다.

System.in 과 InputStream은 무슨 관계인가?
- System.in은 InputStream 타입의 필드이다.
  - 더 정확히는 System클래스의 in이라는 필드는 InputStream의 정적 필드이다.

그렇다면..? Scanner(System.in)은 입력 바이트 스트림인 InputStream을 통해 표준 입력을 받으려고 하는 것이다.
- InputStream은 우리가 InputStream.read()를 통해 입력받으려고 해도 1Byte만 인식하므로, 한글을 입력해도 읽지 못하고 엉뚱한 문자를 출력한다.
  - 이를 해결하기 위해, '문자를 온전하게 읽어들이기' 가 필요하고, 이때 InputStreamReader가 사용된다.

BufferedReader와 InputStreamReader(System.in)
```
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 2개의 입력 코드는 같다.
InputStream inputstream = System.in;
InputStreamReader sr = new InputStreamReader(inputstream);
BufferedReader br = new BufferedReader(sr);
```
1. 기본적으로 바이트 스트림인 InputStream을 통해서 바이트 단위로 데이터를 입력받는다.
2. 입력 데이터를 char형태로 처리하기 위해 중개자 역할인 문자스트림 InputStreamReader로 감싸준다.

![스크린샷 2023-01-10 오후 8 50 42](https://user-images.githubusercontent.com/91510831/211544629-4931ed48-29cd-45e2-b0f7-26fede884443.png)

## StrinbBuilder
- 자바에서 문자열을 다룰 때, 문자열 1개 이상 있어 각 문자열을 더해야 한다고 하면 어떻게 해야할까?
- 자바에서 String 객체는 변경 불가능하므로, 한번 생성하면 바꿀 수 없다.
  - 그렇기에 하나의 문자열을 다른 문자열과 연결하면 새 문자열이 생성되고, 이전 문자열은 GC로 포함된다.
- 이때, StringBuilder는 변경 가능한 문자열을 만들어 주므로 String을 합치는 작업 시, 하나의 대안이 된다.

```
public class Main
{
    public static void main(String[] args)
    {
        String result2 = "프로그래밍 - ";
        String java = "자바";
        String android = "안드로이드";
        
        String result = java + android;
        result2 += java += android;
        
        System.out.println(result);
        System.out.println(result2);
    }
}
```
```
public class Main{
  public static void main(String[] args){
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("문자열 ").append("연결"); 
    
    // String에 StringBuilder를 그대로 넣을 순 없다. toString()을 붙여야 한다.
    String str = stringBuilder.toString();
    
    System.out.println(stringBuilder);
    System.out.println(str);
  }
}
```

## Class
```
public class Common{
    private int state; //상태
    public void setState(int newState) { // 행동
        //logic
    }
}
```

```
class C1{
  static int static_variable = 1; // 클래스(정적) 변수
  int instance_variable = 2;      // 인스턴스 변수
  
  static void static_static(){
    System.out.println(static_variable);
  }
  
  static void static_instance(){
    // System.out.println(instance_variable);  <- 이미 컴파일 에러
  }
  
  void instance_static(){
    System.out.println(static_variable);
  }
  
  void instance_instance(){
    System.out.println(instance_variable);
  }
}

public class ClassMemberDemo {  
    public static void main(String[] args) {
        C1 c = new C1();
        // 인스턴스를 이용해서 정적 메소드에 접근 -> 성공
        // 인스턴스 메소드가 정적 변수에 접근 -> 성공
        c.static_static();
        
        // 인스턴스를 이용해서 정적 메소드에 접근 -> 성공
        // 정적 메소드가 인스턴스 변수에 접근 -> 실패
        c.static_instance();
        
        // 인스턴스를 이용해서 인스턴스 메소드에 접근 -> 성공
        // 인스턴스 메소드가 클래스 변수에 접근 -> 성공
        c.instance_static();
        
        // 인스턴스를 이용해서 인스턴스 메소드에 접근 -> 성공 
        // 인스턴스 메소드가 인스턴스 변수에 접근 -> 성공
        c.instance_instance();
        
        // 클래스를 이용해서 클래스 메소드에 접근 -> 성공
        // 클래스 메소드가 클래스 변수에 접근 -> 성공
        C1.static_static();
        
        // 클래스를 이용해서 클래스 메소드에 접근 -> 성공
        // 클래스 메소드가 인스턴스 변수에 접근 -> 실패
        C1.static_instance();
        
        // 클래스를 이용해서 인스턴스 메소드에 접근 -> 실패
        //C1.instance_static();
        
        // 클래스를 이용해서 인스턴스 메소드에 접근 -> 실패
        //C1.instance_instance();
    }

```


## Object(객체)
```
Book javaSolutions = new Book();
```

## 상속
- 부모에 선언된 변수와 메소드에 대한 사용권을 갖는 것
- 클래스 선언 시, extends 혹은 implements를 사용하여 구현하는 것

## 다형성
- 부모 클래스에서 파생된 자식 클래스들의 기능이 각기 다를 수 있는 것
- FirstChild와 SecondChild에 있는 method()는 다른 기능을 수행해도 무방하다.
```
public class Parent{
    public void method(){
        //logic
    }
}

public class FirstChild extends Parent{
    public void method() {
        //logic
    }
}

public class SecondChild extends Parent{
    public void method() {
        //logic
    }
}
```

## Overriding
- 부모 클래스에 선언되어 있는 메소드와 동일한 선언을 갖지만 구현이 다른 것을 의미.
```
public class Parent{
    public void method() {
        //logic
    }
}

public class Child extends Parent {
    public void method(){
        //logic
    }
}
```

## Overloading
- 메소드 이름은 동일해도, 매개변수들을 다르게 하는 것을 의미함.
- 메소드에 넘겨줄 매개변수의 타입을 다양하게 함으로써 메소드를 사용하는 다른 개발자가 쉽게 구현가능
```
public class Overloading {
    public void getData(){
        //logic
    }
    public void getData(int value) {
        //logic
    }
    public void getData(String value) {
        //logic
    }
}
```

## package & import
- package는 클래스들을 그룹화하는 단위
  - package에 해당하는 폴더에 클래스가 존재하는 것이 일반적.
- import는 다른 패키지에 선언되어 있는 클래스를 사용하기 위한 명령
  - 다른 클래스에 static으로 선언되어 있는 접근 가능한 변수를 참조하려면 import static을 사용
  - 하나의 패키지 내에 모든 클래스를 참조하려면 *를 사용

## Type using Java
- 기본 자료형
  - byte    : 0
  - short   : 0
  - int     : 0
  - long    : 0L
  - float   : 0.0f
  - double  : 0.0d
  - char    : '\u0000'
  - boolean : false
- 참조 자료형
  - 기본 자료형을 제외한 모든 타입
  - 참조 자로형은 일반적으로 new와 생성자를 지정하여 객체를 생성한다.
  - 기본 자료형 및 참조 자로형 모두 값을 전달하지만, 참조 자료형의 변수들은 참조 주소를 전달한다.
- 특수한 참조 자료형
  - String 클래스는 new를 이용하여 객체를 생성할 필요가 없다.

## 조건문
```
if (boolean) 처리로직;

if (boolean) 처리로직1;
else 처리로직2;

if (boolean) 처리로직1;
else if (boolean) 처리로직2;
else if (boolean) 처리로직3;
else 처리로직N;
```
```
while (boolean){
    //logic
}
```
```
for (초기화; 종료조건; 조건값 증가) {
    //logic
}
```

## 접근 제어자
- public: 누구나 접근 가능
- protected: 같은 패키지 내에 있거나 상속받은 경우에만 접근 가능
- package-private: default로 같은 패키지 내에 있을때만 접근 가능
- private: 해당 클래스 내에서만 접근 가능
  - 선언할 때 사용할 수 있는 제어자
    - abstract: 구현 필요 제어자
    - 값 수정 제한 제어자: final
    - strict 소수 값 제어자: strctfp

## Interface, Abstract, Enum
- interface
  - 어떤 메소드가 존재해야 하는지에 대한 선언만 되어 있다.
  - interface에서는 메소드가 구현되어 있으면 안된다.
  - 상속 시, implements 사용
- abstract
  - abstract에서는 메소드가 구현되어 있어도 가능하다.
  - abstract로 선언된 메소드가 1개 이상일 경우, 반드시 abstract 클래스로 선언한다.
  - abstract로 선언된 메소드는 절대로 구현되어 있어서는 안된다.
  - extends를 사용한다.
- enum
  - enum 클래스는 상수를 열거하기 위한 용도
  - 상수는 이름만 정의해도 된다.
  - 모든 enum클래스의 부모 클래스는 java.lang.Enum 뿐이다.
- annotation
  - 대상(@Target)과 적용 범위(@Retention)를 명시하는 것이 좋다.
  - @interface를 사용하여 어노테이션이라는 것을 명시한다.
```
public interface InterfaceA {
    public void methodA();
    public void methodB();
}
```
```
public abstract class AbstractClass {
    public abstract void methodC();
    publi void methodD() {
        //logic
    }
}
```
```
public enum EnumClass {
    THREE_HOUR(18000),
    FIVE_HOUR(30000),
    ...
}
```
```
import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AnnotationDefinition {
    public int number();
    public String text() default "This is first annotation";
}
```

## 예외 처리
```
try{
    //예외 예상 code
} catch(예외1 e1){
    //예외1 처리
} catch(예외2 e2){
    //예외2 처리
} finally{
    //try나 catc가 어떤 수행을 해도, 반드시 수행
}
```

### throw와 throws
- throw: 예외 객체를 던지기 위해서 사용한다.
  - try 블록 내에서 예외를 발생시킬 경우에는 throw를 사용
  - catch 블록 내에서 예외를 throw할 경우, 메소드 선언부에 throws 로 정의 되어있어야 함.
- throws: 예외가 발생하면 던질 것이라고 메소드 선언시 사용
  - 메소드를 선언할 때, 매개 변수 소괄호 뒤에 throws를 작성하면 해당 메소드에서 선언한 예외가 발생할 때 호출한 메소드로 예외가 전달

## 제네릭
- Generic은 형 변환 시, 발생할 수 있는 문제들을 사전에 없애기 위해서 만든 기능
  - 컴파일 시점에서 작동
- E: 요소 (Element, 자바 컬렉션에서 주로 사용)
- K: 키
- V: 값
- N: 숫자
- T: 타입
- S,U,V: 두번째, 세번째, 네번째에 선언되는 타입
- wildcard 타입
  - 메소드 선언 시, 제네릭 타입의 제한을 해소하기 위해서 특정 타입 대신 <?> 을 사용
  - 해당 타입을 정확하기 모르므로 Object로 받음
```
import java.io.Serializable;

public class CastingGenericDTO<T> implements Serializable {
    private T object;
    public void setObject(T obj) {
        this.object = obj;
    }
    
    public T getObject() {
        return object;
    }
}
```
```
public void wildcardMethod(WildcardGeneric<?> c) {
    Object value=c.getWildcard();
    System.out.println(value);
}

public void boundedWildcardMethod(WildcardGeneric<? extends Car> c) {
    Car value=c.getWildcard();
    System.out.println(value);
}

public <T> void genericMethod(WildcardGeneric<T> c, T addValue) {
    c.setWildcard(addValue);
    T value=c.getWildcard();
    System.out.println(value);
}
```

## Thread
- 프로세스가 추가되고, 그 안에 여러 개의 쓰레드가 수행된다.
- 쓰레드를 시작할 수 있는 인터페이스와 클래스
  - java.lang.Runnable
  - java.lang.Thread
```
public class RunnableSample implements Runnable{
    public void run() {
        System.out.println("This is RunnableSample's run() method.");
    }
}

RunnableSample runnable = new RunnableSample();
new Thread(runnable).start();
```
```
public class ThreadSample extends Thread{
    public void run() {
        System.out.println("This is ThreadSample's run() method.");
    }
}

ThreadSample thread = new ThreadSample();
thread.start();
```

## Object
- 모든 클래스의 최상위 부모 클래스이다.
  - clone() : 객체의 복사본을 만들어 리턴한다.
  - equals() : 현재 객체와 매개 변수로 넘겨받은 객체가 같은지 확인한다.
  - finalize() : 현재 객체가 더 이상 쓸모가 없어졌을 때, 가비지 컬렉터에 의해서 finalize()가 호출된다.
  - getClass(): 현재 객체의 Class 객체를 리턴한다.
  - hashCode(): 객체에 대한 해시코드 값을 리턴한다.
  - String toString() : 객체를 문자열로 표현하는 값을 리턴한다.

## String
- getBytes() : 문자열을 byte 배열로 변경
- length() : 문자열의 길이를 리턴한다.
- isEmpty() : 문자열이 비어 있는지를 확인한다.
- equals() : 두 문자열의 값이 같은지 확인한다.
- startWith(), endWith() : 매개변수로 넘어온 문자열로 시작하는지, 끝나는지 확인한다.
- contains(): 매개 변수로 넘어온 문자열이 포함되어 있는지 확인한다.
- indexOf(), lastIndexOf(): 매개변수로 넘어온 문자열이 있는 위치를 0부터 시작하는 값으로 리턴한다.
  - 만약 없으면 -1을 리턴한다.
- substring(), subsequence() : 문자열의 특정 범위 값을 잘라서 리턴한다.
- split() : 문자열을 매개 변수로 넘어온 정규 표현식에 따라 String 배열로 리턴한다.
- concat() : 기존 문자열 뒤에 매개 변수로 넘어온 문자열을 합친다.
- trim() : 문자열의 맨 앞과 뒤에 이쓴 공백을 제거한다.
- replace() : 문자열의 특정 위치의 내용을 매개 변수로 넘어온 값으로 변경한다.
- format() : 문자열을 정해진 포맷으로 변환한다.

## Data Structure, Collection
- 순서가 있는 List
- 순서가 중요하지 않은 Set
- 먼저 들어온 것이 먼저 나가는 Queue
- 키-값으로 저장되는 Map
- java.util.Collection
  - List, Set, Queue 타입 구현의 인터페이스
  - 데이터 담기: add(), addAll() 
  - 데이터 확인: contains(), containsAll(), isEmpty(), equals(), size()
  - 데이터 삭제: clear(), remove(), removeAll()

## Java Program
```
import java.util.Arrays;

public class BinarySearch { //반드시 BinarySearch.java 파일에 있어야 한다.
  public static int rank(int key, int[] a){
    int hi = a.length - 1;
    while (lo <= hi){
      int mid = lo + (hi - lo) / 2;
      if (key < a[mid]) hi = mid - 1;
      else if (key > a[mid]) lo = mid + 1;
      else return mid;
    }
    return -1;
  }
                     // 시스템 호출 main()
  public static void main(String[] args) {
    In in = new In(args[0]);
    int[] whitelist = in.readAllInts();
    
    Arrays.sort(whitelist);
    
    while(!StdIn.isEmpty()){
      int key = StdIn.readInt();
      if (rank(key, whitelist) == -1)
      StdOut.println(key);
    }
  }
}
                    //args[0]
% java BinarySearch largeW.txt < largeT.txt
499569
984875
...
```

## Typical Array Code
- 배열 항목 중 가장 큰 값 찾기
```
double max = a[0];
for (int i=1; i < a.length; i++) {
  if (a[i] > max) {
    max = a[i];
  }
}
```
- 배열 항목들의 평균값 계산
```
int N = a.length;
double sum = 0.0;
for (int i=0; i < N; i++) {
  sum += a[i];
}
double average = sum / N;
```
- 배열을 또 다른 배열로 복제
```
int N = a.length;
double[] b = new double[N];
for (int i=0; i<N; i++){
  b[i] = a[i];
}
```
- 배열 항목들의 순서를 거꾸로 재배치
```
int N = a.length;
for (int i = 0; i < N/2; i++){
  double temp = a[i];
  a[i] = a[N-i-1];
  a[N-i-1] = temp;
}
```
- 행렬과 행렬의 곱
```
int N = a.length;
double[][] c = new double[N][N];
for (int i=0; i < N; i++){
  for (int j=0; j < N; j++){
    for (int k=0; k < N; k++){
      c[i][j] += a[i][k] * b[k][j];
    }
  }
}

```

## StdIn
```
boolean isEmpty()     : 읽어 들일 값이 없으면 True/ 있으면 False 
int     readInt()
double  readDouble()
float   readFloat()
long    readLong()
boolean readBoolean()
char    readChar()
byte    readByte()
String  readString()
boolean hasNextLine()  : 입력 스트림에 읽어 들여야 할 문자열 라인이 남아 있는가?
String  readLine()     : 문자열 한 라인 읽어 들이기
String  readAll()      : 입력 스트림에 남아있는 모든 것을 읽어 들이기
```

## In
- 입력값들을 배열로써 읽어 들이기 위함.
```
int[]     : readAllInts()
double[]  : readAllDoubles()
float[]   : readAllFloats()
long[]    : readAllLongs()
boolean[] : readBooleans()
char[]    : readAllChars()
byte[]    : readAllBytes()
String[]  : readAllStrings()
String[]  : readAllLines()
```

## Bag, Queue, Stack
- 기초적인 제네릭/반복자 지원 컬렉션 데이터 타입들의 API
```
public class Bag<Item> implements Iterable<Item>
void add(Item item)
boolean isEmpty()
int size()

public class Queue<Item> implements Iterable<Item>
void enqueue(Item item)
Item dequeue()    : 최근에 추가된 항목 제거
boolean isEmpty()
int size()

public class Stack<Item> implements Iterable<Item>
void push(Item item)
Item pop()
boolean isEmpty()
int size()
```
```
public static int[] readAllInts(String name){
  In in = new In(name);
  Queue<Integer> q = new Queue<Integer>();
  
  while (!in.isEmpty())
    q.enqueue(in.readInt());
  
  int N = q.size();
  int[] a = new int[N];
  
  for (int i=0; i<N; i++)
    a[i] = q.dequeue();
  return a;
}
```
```
public class Reverse{
  public static void main(String[] args){
    Stack<Integer> stack = new Stack<Integer>();
    while (!StdIn.isEmpty())
      stack.push(StdIn.readInt());
    
    for (int i : stack)
      StdOut.println(i);    
  }
}
```

## Java 문법에서 헷갈리는 것들.
```
public class Main{
  public static void main(String[] args){
    String str = "100";
    int i = Integer.parseInt(str); // 문자열 "100"을 integer로 변환한다.
    long l = Long.parseLong(str); // 문자열 "100"을 long으로 변환한다.
    
    String str2 = String.valueOf(i);
  }
}
```
```
import java.util.Random;

public class Main{
  public static void main(String[] args){
    Random random = new Random();
    int rand = random.nextInt(10); // 0~9까지 랜덤하게 반환
    
    // 5~9까지 반환하고 싶다면?
    int rand = random.nextInt(4) + 5;
 
    System.out.println(rand);
  }
}
```
```
public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String str = scanner.next();
    int i = scanner.nextInt();
    long l = scanner.nextLong();
    
    System.out.println(scanner.next());
  }
}
```

```
public class Main{
  public static void main(String[] args){
    for (int i=0; i<10; i++) {
      System.out.println(i);
      if (i==6){ break; }
      else { continue; }
    }
    
    int i=0;
    while (i<10){
      System.out.println(i);
      i++;
    }
  }
}
```
```
public class Main{
  public static void main(String[] args){
    int[] score = new int[5];
    int[] score = new int[] {1,2,3,4,5};
    int[] score = {1,2,3,4,5};
   
    int count = score.length; // 5출력
    System.out.println(count);
    
    score[0] = 10;
    System.out.println(score[0]); // 10출력
    
    String[] names = new String[2]; // 초기화 하지 않으면 null
    System.out.println(names[0].length()); // NullPointerException 발생
  }
}
```

```
public class Main{
  public static void main(String[] args){
    ArrayList<Integer> scoreList = new ArrayList<>();
    scoreList.add(10);
    scoreList.add(20);
    scoreList.add(2, 30); // add(index, element)
    scoreList.remove(2);  // remove(index)
  }
}
```

```
public class Main{
  public static void main(String[] args){
    add(50, 10);
    add(30, 10);
    add(10,20,30);
    add(1,2,3,4,4,5,6,7,8,9,10);
  }
  
  public static int add(int x, int y){
    return x + y;
  }
  
  public static int add(int x, int y, int z) {
    return x+y+z;
  }
  
  public static int add(int ... numbers){ // 배열처럼 사용 가능
    int sum = 0;
    for (int i=0; i<numbers.length; i++){
      sum += i;
    }
  } 
}
```
```
class Person{
  private String name;
  private int age;
  
  Person(String name, int age){ // 클래스 이름과 같으면 생성자이다. 즉, 객체가 만들어질 때 초기화 된다.
    this.name = name;
  }  
  
  //Getter and Setter
  ........
  
  @Override
  public String toString(){
    return "Person{" +
            "name=" + name + '\'' + 
            ", age=" + age +
            '}';
  } 
}
```
```
package models; // models라는 package 폴더를 만든다.

public class Hero extends Person{
  
  public Hero(String name){
    super(name, 0);
  }
  
  private boolean isFlying;
  
  public boolean isFlying(){
    return isFlying;
  }
  
  public void setFlying(boolean flying) {
    isFlying = flying;
  }
  
  public void attack(Hero hero){
    // getName은 Person에서 정의한 메소드이다.
    System.out.println(this.getName() + hero.getName());
  }
}
```
```
package models;

public abstract class Character extends Person{
  public abstract void attack(Hero hero);
}

interface ICharacter{
  void attack(Hero hero);
}

public class Magician extends Character{
  @Override
  public void attack(Hero hero){
    //logic
  }

public class Magician implements ICharacter{
  @Override
  public void attack(Hero hero){
    //logic
  }
}

public static void main(~~){
  // Magician 클래스에서 다중으로 상속받았을 경우, 아래와 같이 선언 가능
  Magician magician = new Magician();
  Character magician2 = new Magician();
  ICharacter magician3 = new Magician();
  
  ArrayList<Character> characterArrayList = new ArrayList<>();
  characterArrayList.add(magician);
  characterArrayList.add(magician2);
  characterArrayList.add(magician3); // 인터페이스는 담을 수 없음.
 
  if (magician2 instanceof Magician){ // Magician인지 아닌지 체크 한다.
    //logic
  }
}
```

```
public class Main{
  public static void main(String[] args) {
    print("hello");
    print(1);
    print(3L);
    print(true):
  }
  
  // 제네릭 타입으로 하면 어떤 타입이든 받을 수 있다.
  public static <T> void print(T type){
    System.out.println(type);
  }
}
```
```
public class Main{
  public static void main(String[] args) {
    System.out.println("1");
    new Thread(new Runnable(){
      @Override
      public void run(){
        for(int i=0; i<5; i++){
          try{
            Thread.sleep(100);
            System.out.println(Thread.currentThread().getName()+":"+i);
          } catch (InterruptedException e){
            e.printStackTrace();
          }
        }
      }
    }).start();
  }
}
```
## Annotation
- 일종의 메타 정보이며, 프로그램이 사용하는 주석이다.
- 가장 쉽게 접한 Annotation은 @Override이다.
- Annotation은 프레임워크에서 특정 Annotation을 확인하면 특정 기능이 실행되거나, 특정 코드가 자동으로 생성되도록 하는 데 사용할 수 있다.
- JDK에서 제공하는 표준 Annotation
  - @Override: 컴파일에게 재정의하는 메소드임을 알려준다.
  - @Deprecated: 지금까지는 사용했지만 앞으로는 사용하지 않을 대상에게 붙인다. 
  - @SuppressWarnings: 컴파일러의 특정 경고 메세지가 나타나지 않도록 한다.
  - @SafeVarage: 제네릭타입의 가변인자에 사용한다.
  - @FunctionalInterface: 함수영 인터페이스이다.
  - @Native: native메소드에서 참조되는 상수에 붙인다.
- Custom Annotation
  - Custom Annotation을 작성하려면 JDK에서 제공하는 Meta Annotation을 사용해야 한다.
    - @Target: Annotation이 적용 가능한 대상을 지정하는데 사용한다.
      - CONSTRUCTOR
      - FIELD
      - LOCAL_VARIABLE
      - METHOD
      - PACKAGE
      - PARAMETER
      - TYPE
    - @Documented: Annotation 정보가 javadoc로 작성된 문서에 포함하도록 한다.
    - @Inherited: Annotation이 자식 클래스에 상속되도록 한다.
    - @Retention: Annotation이 유지되는 범위를 지정한다.
      - SOURCE: source만 있고, 컴파일 시작되면 사라짐
      - CLASS: 컴파일은 가능하지만 런타임은 불가능
      - RUNTIME: 런타임때도 참조 가능
    - @Repeatable: Annotation을 반복해서 적용할 수 있다.

## Collection
- JAVA에서 데이터 집합을 정의한 클래스 인터페이스를 제공한다.

Set : 순서를 유지하지 않는 데이터의 집합으로 데이터의 중복을 허용하지 않는다.
  - HashSet
  - TreeSet

List: 순서가 있는 데이터의 집합으로 데이터의 중복을 허용한다.
  - LinkedList
  - Vector
  - ArrayList

Queue: List와 유사함
  - LinkedList
  - PriorityQueue

Map: 키(Key), 값(Value)의 쌍으로 이루어진 데이터의 집합으로, 순서는 유지되지 않으며 키(Key)의 중복을 허용하지 않으나 값(Value)의 중복은 허용한다.
  - Hashtable
  - HashMap
  - TreeMap

### ArrayList
```
import java.io.*;
import java.util.*;

class GCG{
  public static void main(String[] args){
    ArrayList<Integer> a = new ArrayList<Integer>();

    for (int i=1; i<=5; i++){
      a.add(i)
    }

    System.out.println("original: "+a);
    a.remove(3);
    System.out.println("remove: "+a);
    
    for (int i=0; i< a.size(); i++){
      System.out.print(a.get(i) + " ");
    }
  }
}

original: [1,2,3,4,5]
remove: [1,2,3,5]
1 2 3 5
```
### LinkedList
- 요소가 연속된 위치(메모리 위치가 다름)에 저장되지 않고, 모든 요소가 데이터 부분과 주소부분이 있는 별도의 객체에 저장된다.
```
import java.io.*;
import java.util.*;

class GCG{
  public static void main(String[] args){
    LinkedList<Integer> arr_linked = new LinkedList<Integer>();
    for(inti=1; i<=5; i++){
      arr_linked.add(i);
    }

    System.out.println(arr_linked);
    arr_linked.remove(3);
    System.out.println(arr_linked)

    for(int i=0; i<arr_linked.size(); i++){
      System.out.println(arr_linked.get(i)+" ");
    }

  }
}

[1, 2, 3, 4, 5]
[1, 2, 3, 5]
1 2 3 5
```
### Vector
- ArrayList와 유사하지만, Vector는 동기화가 된다는 특징이 있다.
```
import java.io.*;
import java.util.*;

class GFG{
  public static void main(String[] args){
    Vector<Integer> vec = new Vector<Integer>();

    for(int i=1; i<=5; i++){
      vec. add(i);
    }

    System.out.println(vec);
    vec.remove(3);
    System.out.println(vec);

    for (int i=0; i<vec.size(); i++){
      System.out.print(vec.get(i) + " ");
    }
  }
}

[1, 2, 3, 4, 5]
[1, 2, 3, 5]
1 2 3 5
```
### Stack
```
import java.util.*;
public class GCG{
  public static void main(String[] args){
    Stack<String> stack = new Stack<String>();
    stack.push("Hello");
    stack.push("World");
    stack.push("Hello");
    stack.push("Hello");

    Iterator<String> iter = stack.iterator();

    while (iter.hasNext()){
      System.out.print(iter.next() + " ");
    }

    System.out.println();
    stack.pop(); // 맨 뒤의 값이 삭제됨.

    iter = stack.iterator();

    while (iter.hasNext()){
      System.out.print(iter.next() + " ");
    }
  }
}

Hello World! Hello Hello
Hello World! Hello
```
### ArrayDeque
```
import java.util.*;
public class ArrayDequeDemo{
  public static void main(String[] args){
    ArrayDeque<Integer> de_que = new ArrayDeque<Integer>(10);

    de_que.add(10);
    de_que.add(20);
    de_que.add(30);
    de_que.add(40);
    de_que.add(50);

    System.out.println(de_que);
    de_que.clear();

    de_que.addFirst(564);
    de_que.addFirst(291);
    de_que.addLast(24);
    de_que.addLast(14);

    System.out.println(de_que);
  }
}

[10, 20, 30, 40, 50] 
[291, 564, 24, 14]
```
### HashSet
- HashSet에 입력되는 데이터는 동일한 순서로 삽입되는 것을 보장하지 않습니다.
- 중복된 값을 허용하지 않습니다.
- Null을 허용합니다.
```
import java.util.*;

public class HashSetDemo{
  public static void main(String[] args){
    HashSet<String> hs = new HashSet<String>();

    hs.add("Hello");
    hs.add("World);
    hs.add("Hello");
    hs.add("Blog");
    hs.add("CrazyKim");

    Itertor<String> iter = hs.iterator();
    while (iter.hasNext()){
      System.out.println(iter.next());
    }
  }
}

Hello
CrazyKim
World
Blog
```
### Map
- Map은 데이터를 Key-Value로 매핑하는 데이터 구조이다.
- 중복된 키는 허용하지 않고, 중복된 값은 허용한다.
```
import java.util.*;

public class HashMapDemo{
  public statkc void main(String[] args){
    HashMap<Integer, String> hashmap = new HashMap<Integer, String>();

    hashmap.put(1, "hello");
    hashmap.put(2, "world);
    hashmap.put(3, "crazy");

    System.out.println("Value of 1 is "_hashmap.get(1));

    for (Map.Entry<Integer, String> e : hashmap.entrySet()){
      System.out.println(e.getKey() + " " + e.getValue());
    }
  }
}

Value for 1 is Hello
1 Hello
2 World
3 CrazyKim
```
