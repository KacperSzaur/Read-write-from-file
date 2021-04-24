public class Student {
    int id;
    String lastName;
    int age;

    public Student(int id, String lastName, int age){
        this.id = id;
        this.lastName = lastName;
        this.age = age;
    }

    public String studentToString(){
        return "id: " + this.id + " lastname: " + lastName + " age: " + age;
    }
}
