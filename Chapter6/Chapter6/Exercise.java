import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;

public class Exercise {
    public static void main(String[] args) throws FileNotFoundException {
        // get the file from the path
        /*
         * File f = new
         * File("/Users/hugospersonalcenter/Documents/Java/Chapter6/example.txt");
         * System.out.println("exists returns " + f.exists());
         * System.out.println("canRead returns " +f.canRead());
         * System.out.println("length returns " +f.length());
         * System.out.println("path returns:" + f.getAbsolutePath());
         */

        // read the file
        /*
         * Scanner input = new Scanner(new
         * File("/Users/hugospersonalcenter/Documents/Java/Chapter6/example.txt")); int
         * count = 0;
         * 
         * while(input.hasNext()) { String word = input.next(); count++; }
         * System.out.println("total words = " + count);
         */

        // Read numbers
        // create a text file using textEditor
        /*
         * Scanner input = new Scanner(new
         * File("/Users/hugospersonalcenter/Desktop/number.dat.txt"));
         * 
         * double sum = 0.0; for(int i=1;i<=5;i++) { double next = input.nextDouble();
         * System.out.println("number "+ i + " = " + next); sum+=next; }
         * System.out.println("sum = " + sum+"\n\n"); input.close();
         */

        // loop for entire documents
        /*
         * Scanner input = new Scanner(new
         * File("/Users/hugospersonalcenter/Desktop/number.dat.txt")); double sum = 0.0;
         * int count = 0; while(input.hasNextDouble()) { double next =
         * input.nextDouble(); count++; System.out.println("number "+ count + " = " +
         * next); sum+=next; } System.out.println("sum = " + sum);
         */

        // loop for work hours
        /*
         * Scanner input = new Scanner(new
         * File("/Users/hugospersonalcenter/Desktop/WorkHours.txt"));
         * while(input.hasNextLine()) { String line = input.nextLine(); process(line); }
         */

        // create a new file using PrintStream command
        /*
         * PrintStream output = new PrintStream(new File("hello.txt"));
         * output.println("Hello"); output.println("Welcome to Minecraft");
         */

        // to get file, returns error if it's not in the working directories
        // it gets a copy of the original file
        File hello = new File("hello.txt");
        System.out.println(hello.canRead());
        System.out.println(hello.getAbsolutePath());
        // to read file
        Scanner input = new Scanner(hello);

        PrintStream output = new PrintStream(new File("hello2.txt"));

        while (input.hasNextLine()) {
            String text = input.nextLine();
            echoFixed(text, output);
            echoFixed(text, System.out);
        }

    }

    public static void process(String line) {
        Scanner token = new Scanner(line);
        int id = token.nextInt();
        String name = token.next();

        double sum = 0.0;
        while (token.hasNextDouble()) {
            sum += token.nextDouble();
        }
        System.out.println("Work hours worked by " + name + " (id is " + id + ")" + "is " + sum);
    }

    public static void echoFixed(String text, PrintStream output) {
        // read the text
        Scanner data = new Scanner(text);
        if (data.hasNext()) {
            output.print(data.next());
            while (data.hasNext()) {
                output.print(" " + data.next());
            }
        }
        output.println();
    }

}
