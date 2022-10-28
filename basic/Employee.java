package basic;
public class Employee{
    int joinYear;
    int employeeId;
    String name;
    
    public static void main(String[] args){
        Employee one = new Employee();
        one.joinYear = 1999;
        one.employeeId = 1;
        one.name = "lee";

        Employee two = new Employee();
        two.joinYear = 2000;
        two.employeeId = 2;
        two.name = "kim";

        int joinYear = one.joinYear;
        int employeeId = one.employeeId;
        String name = one.name;

        System.out.println(joinYear + " " + employeeId + " " + name);
    }
}