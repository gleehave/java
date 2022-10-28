package basic;
public class TryPrivateDemo {
    public static void main(String[] args){
        Private pObject = new Private();

        pObject.setNum(3);
        System.out.println(pObject.getNum());   
    }
}
