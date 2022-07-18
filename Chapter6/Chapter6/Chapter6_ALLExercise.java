import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class Chapter6_ALLExercise {
    public static void main(String[] args) 
    throws FileNotFoundException  {
        /*Scanner console = new Scanner(System.in);
        Scanner input1 = new Scanner(new File("boyGirl.txt"));
        exe1(input1);

        Scanner input2 = new Scanner(new File("evenNumbers.txt"));
        exe2(input2);

        Scanner input3 = new Scanner(new File("negativeSum.txt"));
        System.out.println(exe3(input3));

        Scanner input4 = new Scanner(new File("cointCoins.txt"));
        exe4(input4);

        Scanner input5 = new Scanner(new File("collapseSpace.txt"));
        exe5(input5);

        Scanner input6 = new Scanner(new File("example.txt"));
        System.out.println(exe6(input6));

        Scanner input7 = new Scanner(new File("filpLines.txt"));
        exe7(input7);

        Scanner input8 = new Scanner(new File("doubleSpace.txt"));
        PrintStream output8 = new PrintStream(new File("doubleSpace2.txt"));
        exe8(input8,output8);

        Scanner input9 = new Scanner(new File("wordWrap.txt"));
        exe9(input9);

        Scanner input12 = new Scanner(new File("stripHtmlTags.txt"));
        exe12(input12);

        Scanner input13 = new Scanner(new File("stripComments.txt"));
        exe13(input13);

        Scanner input14 = new Scanner(new File("printDuplicates.txt"));
        exe14(input14);

        Scanner input15 = new Scanner(new File("coinFlip.txt"));
        exe15(input15);

        Scanner input16 = new Scanner(new File("mostCommonNames.txt"));
        exe16(input16);

        Scanner input17 = new Scanner(new File("inputStats.txt"));
        exe17(input17);

        Scanner input18 = new Scanner(new File("plusScores.txt"));
        exe18(input18);

        Scanner input19 = new Scanner(new File("leetSpeak.txt"));
        PrintStream output19 = new PrintStream(new File("leetSpeak2.txt"));
        exe19(input19,output19);
         */
    }

    public static void exe1(Scanner input)
    {
        int boyCount = 0, girlCount = 0, boySum = 0, girlSum = 0,gender=0;
        while(input.hasNext())
        {
            input.next();
            if(gender==0)
            {
                boyCount++;
                boySum+=input.nextInt();
                gender = 1;
            }else
            {
                girlCount++;
                girlSum+=input.nextInt();
                gender = 0;
            }
        }
        System.out.println(boyCount +" boys, "+girlCount+" girls");
        System.out.println("Difference between boys's and girls' sums: "+Math.abs(boySum-girlSum)+"\n");
    }

    public static void exe2(Scanner input)
    {
        int count = 0, sum = 0, even = 0;
        while(input.hasNextInt())
        {
            count++;
            int number =input.nextInt();
            if(number%2==0)
            {
                even++;
            }
            sum+=number;
        }
        System.out.println(count+" numbers, sum = "+ sum);
        System.out.println(even+" evens ("+((double)even/count)*100+"%)");
    }

    public static String exe3(Scanner input)
    {
        int sum = 0, count = 0;
        while(input.hasNextInt())
        {
            int number = input.nextInt();
            count++;
            sum+=number;
            if(sum<0)
            {
                return "sum of " + sum +" after "+ count +" steps"; 
            }          
        }
        return "no negative sum";
    }

    public static void exe4(Scanner input)
    {
        // must be double 
        double sum = 0.0;
        while(input.hasNext())
        {
            int amount = input.nextInt();
            String coin = (input.next()).toLowerCase();
            if(coin.equals("pennies"))
            {
                sum+=amount*0.01;
            }else if(coin.equals("quarters"))
            {
                sum+=(amount*0.25);
            }else if(coin.equals("nickels"))
            {
                sum+=(amount*0.05);
            }else
            {
                sum+=(amount*0.10);
            }
        }
        System.out.println("Total money: $"+Math.round(sum * 100.0)/ 100.0);
    }

    public static void exe5(Scanner input)
    {
        if(input.hasNext()){
            System.out.print(input.next());
            while(input.hasNext())
            {
                System.out.print(" "+input.next());
            }
        }
        System.out.println();
    }

    public static String exe6(Scanner input)
    {
        String text = "";
        while(input.hasNextLine())
        {
            text+=input.nextLine()+"\n";
        }
        return text;
    }

    public static void exe7(Scanner input)
    {
        while(input.hasNextLine())
        {
            String line = input.nextLine();
            if(input.hasNextLine())
            {
                System.out.println(input.nextLine());
            }
            System.out.println(line);
        }
    }

    public static void exe8(Scanner input, PrintStream output)
    {
        while(input.hasNextLine())
        {
            output.println(input.nextLine()+"\n");
        }
    }

    public static void exe9(Scanner input)
    {
        while(input.hasNextLine())
        {
            String line = input.nextLine();
            int startindex = 0,endindex = 0;
            for(int i = 0; i<line.length()/60;i++)
            {
                endindex+=60;
                System.out.println(line.substring(startindex,endindex));
                startindex+=60;
            }
            System.out.println(line.substring(endindex));
        }
    }

    public static void exe12(Scanner input)
    {
        while(input.hasNextLine())
        {
            String line = input.nextLine();
            int left = line.indexOf("<");
            while(left!=-1)
            {
                left = line.indexOf("<");
                int right= line.indexOf(">");
                if(left!=-1)
                {
                    line = line.replace(line.substring(left,right+1),"");
                }
            }
            System.out.println(line);
        }    
    }

    public static void exe13(Scanner input)
    {
        while (input.hasNextLine()) {
            String line = input.nextLine();
            if (!line.startsWith("/*")) {
                if (!line.contains("/*") && line.endsWith("*/")) {
                    line = "";
                } else if (line.contains("/*") && line.contains("*/")) {
                    line = line.substring(0, line.indexOf("/*")) + line.substring(line.indexOf("*/") + 2);
                } else if (line.contains("//")) {
                    line = line.substring(0, line.indexOf("//"));
                }
                System.out.println(line);
            }
        }

    }

    public static void exe14(Scanner input)
    {
        while(input.hasNextLine())
        {
            String line = input.nextLine();
            int count = 1;
            String word = "";
            Scanner tokenRead = new Scanner(line);
            while(tokenRead.hasNext())
            {
                String token = tokenRead.next();
                if(token.equals(word))
                {
                    count++; 
                }
                if(count>=2&&!token.equals(word)) // transition for two different words
                {
                    System.out.print(word+"*"+count+" ");
                    count = 1;
                }
                word = token;               
            }
            if(count>=2) // last word without transition 
            {
                System.out.print(word+"*"+count+" ");
            }
            System.out.println();
        }
    }

    public static void exe15(Scanner input)
    {
        while(input.hasNextLine())
        {
            int count = 0, head = 0;
            String line = input.nextLine();
            Scanner input2 = new Scanner(line);
            // to ensure we are not reading a empty line
            if(input2.hasNext()){
                while(input2.hasNext())
                {
                    String letter = input2.next();
                    if(letter.toLowerCase().equals("h"))
                    {
                        head++;
                    }
                    count++;
                }
                double percentage = ((double)head/count)*100;
                System.out.println(head+" heads ("+percentage+"%)");
                if(percentage>50)
                {
                    System.out.println("You win");
                }
            }
            System.out.println();
        }
    }

    public static void exe16(Scanner input)
    {
        while(input.hasNextLine())
        {
            String line = input.nextLine();
            Scanner readtoken = new Scanner(line);
            String prev ="",curr = "",mostCommon ="";int maxOccur = 1,occur = 1;

            while(readtoken.hasNext())
            {
                curr = readtoken.next();
                if(curr.equals(prev))
                {
                    occur++;
                }
                if(!curr.equals(prev))
                {
                    if(occur>maxOccur)
                    {
                        maxOccur = occur;
                        mostCommon = prev;
                    }
                    occur = 1;
                }
                prev = curr;
            }
            if(curr.equals(prev)) // last series of word
            {
                if(occur>maxOccur)
                {
                    mostCommon = prev;
                }
            }
            System.out.println("Most Common: "+ mostCommon);
        }
    }

    public static void exe17(Scanner input)
    {
        int LineCount = 0; String longestLine = "";
        while(input.hasNextLine())
        {
            LineCount++;
            String line = input.nextLine();
            if(line.length()>longestLine.length())
            {              
                longestLine = line;
            } 
            Scanner input2 = new Scanner(line);
            int tokenCount = 0, longest = 0;
            if(input2.hasNext())
            {
                while(input2.hasNext())
                {
                    int word = input2.next().length();
                    if(word>longest)
                    {
                        longest = word;
                    }
                    tokenCount++;
                }
            }           
            System.out.println("Line "+ LineCount+"  has "+
                tokenCount+" tokens (longest = "+longest+")");   
        }
        System.out.println("Longest Line: "+longestLine);
    }

    public static void exe18(Scanner input)
    {
        while(input.hasNextLine())
        {
            String name = input.nextLine();
            String line = input.nextLine();
            int plus = 0;
            for(int i = 0;i<line.length();i++)
            {               
                if(line.charAt(i)=='+')
                {
                    plus++;
                }
            }
            double percent = ((double)plus / line.length())*100;
            System.out.println(name+": "+
                percent+"% plus");
        }
    }

    public static void exe19(Scanner input,PrintStream output)
    {
        while(input.hasNextLine())
        {
            String line = input.nextLine();
            Scanner readLine = new Scanner(line);
            while(readLine.hasNext())
            {
                String token = readLine.next();
                String word = "";
                for(int i=0;i<token.length();i++)
                {
                    char ch = token.charAt(i);
                    if(ch=='o'){ word+="0";}
                    else if(ch=='l'){ word+="1";}                       
                    else if(ch=='e'){ word+="3";}
                    else if(ch=='a'){ word+="4";}
                    else if(ch=='t'){ word+="7";}
                    else if(i==token.length()-1&&ch=='s'){word+="Z";}
                    else            { word+=ch;}                 
                }
                output.print("("+word+")"+" ");
            }
            output.println();
        }
    }
}