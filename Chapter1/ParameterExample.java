public class ParameterExample {
 public static void Pratice1(String[] args) {
    int spaces1 = 3;
    int spaces2 = 5;

    System.out.print("*");
    writeSpaces(spaces1);
    System.out.println("*");

    System.out.print("!");
    writeSpaces(spaces2);
    System.out.println("!");

    System.out.print("'");
    writeSpaces(8);
     System.out.println("'");


    System.out.print("<");
    writeSpaces(spaces1 * spaces2 - 5);
    System.out.println(">");
 }

 // writes "number" s paces on the current output line
    public static void writeSpaces(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print(" ");
        }
    }
}