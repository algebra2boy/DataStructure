import java.util.*;

public class Chap11_Map_Exercises
{
    public static void main()
    {
        /* Exercise 12:
         *   
         * OUTPUT:
        abc  abc  def  ghi  abc  def  
        mapWords.keySet() =  [abc, def, ghi]
        mapWords.values() =  [3, 2, 1]
        MapExercise12_contains3(letters1) = true

        abc  abc  def  ghi  def  
        mapWords.keySet() =  [abc, def, ghi]
        mapWords.values() =  [2, 2, 1]
        MapExercise12_contains3(letters2) = false
         */
        String letters1[] = {"abc","abc","def","ghi","abc","def"};
        String letters2[] = {"abc","abc","def","ghi","def"};        
        System.out.println(" MapExercise12_contains3(letters1) = " + MapExercise12_contains3(letters1));
        System.out.println(" MapExercise12_contains3(letters2) = " + MapExercise12_contains3(letters2));        
        System.out.println("\n\n");

    } // main
    // =========================================================
    public static boolean MapExercise12_contains3(String words[])
    {
        Map<String,Integer> mapWords = new HashMap<String,Integer>();

        System.out.println("\n");
        for (String s: words)
        {
            System.out.print(s + "  ");            
            if(mapWords.containsKey(s)){
                mapWords.put(s,mapWords.get(s)+1);
            }else
            {
                mapWords.put(s,1);
            }
        }
        System.out.println();

        System.out.println("mapWords.keySet() =  " + mapWords.keySet());
        System.out.println("mapWords.values() =  " + mapWords.values());         
        
        for(String s: mapWords.keySet())
        {
            if(mapWords.get(s)>=3)
            {
                return true;
            }
        }
        return false;
    } // MapExercise1
} // Chap11_Map_Exercises
