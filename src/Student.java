public class Student extends Customer1{
    int age;
    String major;

    public Student(){
    }

    public Student(String name, int age, String major){
        this.name = name;
        this.age = age;
        this.major = major;
    }


    public void study(){
        System.out.println("learn ...");
    }
}
