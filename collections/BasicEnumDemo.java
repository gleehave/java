package collections;

public class BasicEnumDemo {
    enum DayOfWeek{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
    }

    public static void main(String[] args){
        DayOfWeek dayOfWeek = DayOfWeek.Sunday;
        System.out.println(dayOfWeek);
    }
}
