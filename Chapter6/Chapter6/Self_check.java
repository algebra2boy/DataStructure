import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Self_check
{
    public static void main(String[] args) throws FileNotFoundException 
    {
        Scanner console = new Scanner(System.in);
        // Scanner file = new Scanner(new File("hello.txt"))
        // check 16
        //Scanner file = self_check16(console);
        //read(file);

        //check 20
        //Scanner file2 = new Scanner(new File(self_check20(console)));
        //read(file2);

        //check 17
        self_check17(new File("hello2.txt"));
    }
    public static Scanner self_check16(Scanner console) throws FileNotFoundException {
        System.out.print("What is the file name: ");
        File f = new File(console.nextLine());     
        return new Scanner(f);
    }
    public static void read(Scanner input)
    {
        while(input.hasNextLine())
        {
            System.out.println(input.nextLine());
        }
    }
    
    public static String self_check20(Scanner console) throws FileNotFoundException
     {
        System.out.print("What is the file name: ");
        File f = new File(console.nextLine());     
        while(!f.canRead())
        {
            System.out.print("Non Found, What is the file name:");
            f = new File(console.nextLine()); 
        }
        return f.getName();
    }
    public static void self_check17(File f) throws FileNotFoundException
    {
        Scanner input = new Scanner(f);
        int maxLength = 0;
        if(f.length()>0)
        {
            // get the longgest space 
            while(input.hasNextLine())
            {
                String line = input.nextLine();
                if(line.length()>maxLength)
                {
                    maxLength = line.length();
                }
            }
            input = new Scanner(f);  
        }


    }
    
}