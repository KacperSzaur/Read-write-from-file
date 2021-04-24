import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void FirstFile() throws IOException {
        String fileName = "dane.txt";
        PrintWriter printWriter = new PrintWriter(fileName);

        printWriter.write("Hello, it's my first file! :)");
        printWriter.write("Thanks");

        printWriter.close();

        FileReader fileReader = new FileReader(fileName);
        BufferedReader reader = new BufferedReader(fileReader);

        String readLine = reader.readLine();
        reader.close();

        //System.out.println("Wrote text: " + readLine);
    }

    public static void writeNumbersFromTable() throws IOException {
        String fileName2 = "numbers.txt";
        FileOutputStream fileOutputStream = new FileOutputStream(fileName2, false); //true - dopisywanie; false - nadpisywanie
        PrintWriter printWriter2 = new PrintWriter(fileOutputStream);

        int[] number = {1, 2, 3, 4, 5};

        for (int num : number) {
            printWriter2.write("It's number " + num + "\n");
        }
        printWriter2.close();
    }

    public static void readAllFile() throws IOException {
        String fileName3 = "nubers2.txt";
        FileReader fileReader2 = new FileReader(fileName3);
        BufferedReader reader2 = new BufferedReader(fileReader2);

        String lineFromFile = reader2.readLine();

        while (lineFromFile != null) {
            System.out.println(lineFromFile);
            lineFromFile = reader2.readLine();
        }
    }

    public static void numbersFromKeyboard() throws IOException {
        List<Integer> numbers = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many number do you want to add?");
        int numberOfNumbers = scanner.nextInt();

        for (int i = 0; i < numberOfNumbers; i++) {
            numbers.add(scanner.nextInt());
        }

        String nameOfFile = "numbersFromKeyboard.txt";
        PrintWriter keyboard = new PrintWriter(nameOfFile);

        for (Integer num : numbers) {
            keyboard.write(num + "\n");
        }
        keyboard.close();
    }

    public static void lastnameFromKeyboard() throws IOException{
        Scanner scanner = new Scanner(System.in);

        List <String> namesList = new ArrayList<String>();

        System.out.println("How many names?");
        int namesCount = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < namesCount; i++){
            namesList.add(scanner.nextLine());
        }

        String filename = "names.txt";
        PrintWriter printWriter = new PrintWriter(filename);

        for(String name : namesList){
            printWriter.write("Podano imie: " + name + "\n");
        }

        printWriter.close();
    }

    public static void sumNumbersFromFile() throws IOException {

        String fileName = "numbers.txt";

        FileReader fileReader = new FileReader(fileName);
        BufferedReader reader = new BufferedReader(fileReader);

        int count = Integer.parseInt(reader.readLine());

        int [] numbers = new int [count];
        for(int i = 0; i < count; i++){
            numbers[i] = Integer.parseInt(reader.readLine());
        }

        int sum = 0;

        for(int i = 0; i < count; i++){
            sum += numbers[i];
        }

        System.out.println(sum);
    }

    public static void NameAndSurnameFromFile() throws IOException {

        String fileName = "name_surname.txt";

        FileReader fileReader = new FileReader(fileName);
        BufferedReader reader = new BufferedReader(fileReader);

        List <String> data = new ArrayList<String>();

        String lineFromFile = reader.readLine();

        while(lineFromFile != null){
            data.add(lineFromFile);
            lineFromFile = reader.readLine();
        }

        System.out.println(data.size());

        for(String person : data){
            System.out.println(person);
        }

    }

    public static void studentsToFile() throws IOException{
        List <Student> students = new ArrayList<Student>();
        students.add(new Student(1, "Kowalski", 23));
        students.add(new Student(2, "Szaur", 19));
        students.add(new Student(3, "Stoch", 25));

        String fileName = "Students.txt";
        PrintWriter printWriter = new PrintWriter(fileName);

        for(Student student : students){
            printWriter.write(student.studentToString() + "\n");
        }
        printWriter.close();
    }

    public static void main(String[] args) throws IOException {
        studentsToFile();


    }
}


