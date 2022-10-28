public class Student extends Human {
    @Override
    void play(){
        System.out.println("not play at "+age);
    }

    void study(){
        System.out.println("study at "+age);
    }

    public static void main(String[] args){
        Student student = new Student();

        student.age = 10;
        student.play();
        student.study();
    }
}
