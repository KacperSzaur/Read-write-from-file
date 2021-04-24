import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        /*
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

        String fileName2 = "numbers.txt";
        FileOutputStream fileOutputStream = new FileOutputStream(fileName2, false); //true - dopisywanie; false - nadpisywanie
        PrintWriter printWriter2 = new PrintWriter(fileOutputStream);

        int [] number= {1, 2, 3, 4, 5};

        for(int num : number){
            printWriter2.write("It's number " + num + "\n");
        }
        printWriter2.close();

        String fileName3 = "nubers2.txt";
        FileReader fileReader2 = new FileReader(fileName3);
        BufferedReader reader2 = new BufferedReader(fileReader2);

        String lineFromFile = reader2.readLine();

        while(lineFromFile != null){
            System.out.println(lineFromFile);
            lineFromFile = reader2.readLine();

        }
        */

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

}

