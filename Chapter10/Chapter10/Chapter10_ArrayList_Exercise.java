import java.util.*;
public class Chapter10_ArrayList_Exercise
{
    public static void main(){
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("apple");
        list1.add("orange");
        System.out.println("#1 OP="+averageVowels(list1)+"\n");

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("apple");
        list2.add("orange");
        list2.add("haha");
        list2.add("wow");

        ArrayList<String> list3 = new ArrayList<String>();
        list3.add("BJS");
        list3.add("what");
        list3.add("Hug");
        System.out.println("#3 OP="+removeEvenLength(list3)+"\n");

        ArrayList<String> list4 = new ArrayList<String>();
        list4.add("BJS");
        list4.add("what");
        list4.add("Hug");

        System.out.println("#8 OP="+doubleList(list4)+"\n");

        ArrayList<Integer> list5 = new ArrayList<Integer>();
        list5.add(4);
        list5.add(1);
        list5.add(2);
        list5.add(0);
        list5.add(3);
        System.out.println("#5 OP="+scalebyK(list5)+"\n");

        ArrayList<Integer> list6 = new ArrayList<Integer>();
        list6.add(3);
        list6.add(8);
        list6.add(92);
        list6.add(4);
        list6.add(2);
        System.out.println("#6 OP="+minToFront(list6)+"\n");

        ArrayList<String> list7 = new ArrayList<String>();
        list7.add("be");
        list7.add("happy");
        list7.add("be");
        list7.add("not");
        list7.add("happy");
        System.out.println("#7 OP="+removeDuplicates(list7)+"\n");

        ArrayList<Integer> list8 = new ArrayList<Integer>();
        list8.add(0);
        list8.add(7);
        list8.add(2);
        list8.add(0);
        list8.add(0);
        list8.add(4);

        System.out.println("#8 OP="+removeZeros(list8)+"\n");

        ArrayList<Integer> list9 = new ArrayList<Integer>();
        list9.add(7);
        list9.add(2);
        list9.add(0);
        list9.add(0);
        list9.add(4);
        list9.add(0);
        System.out.println("#9 OP="+rangeBetweenZero(list9)+"\n");

        ArrayList<String> list10 = new ArrayList<String>();
        list10.add("to");
        list10.add("be");
        list10.add("or");
        list10.add("not");
        list10.add("to");
        list10.add("be");
        list10.add("that");
        list10.add("is");
        list10.add("the");
        list10.add("questions");
        System.out.println("#10 removeInrange "+removeInrange("free","rich",list10)+"\n");
        
        ArrayList<String> list11 = new ArrayList<String>();
        list11.add("BJS");
        list11.add("what");
        list11.add("Hug");

        System.out.println("#11 OP="+stutter(list11,3)+"\n");

        ArrayList<String> list12 = new ArrayList<String>();
        list12.add("code");
        list12.add("wha");
        list12.add("Hassam");

        System.out.println("#12 OP="+markLength4(list12)+"\n");

        ArrayList<Integer> list13 = new ArrayList<Integer>();
        list13.add(5);
        list13.add(1);
        list13.add(2);
        list13.add(8);
        list13.add(1);
        list13.add(0);
        list13.add(7);

        System.out.println("#13 OP="+reverse3(list13)+"\n");

        ArrayList<String> list14 = new ArrayList<String>();
        list14.add("four");
        list14.add("score");
        list14.add("and");
        list14.add("seven");
        list14.add("years");
        list14.add("agos");

        System.out.println("#14 OP="+removeShorterStrings(list14)+"\n");

        ArrayList<Integer> list15 = new ArrayList<Integer>();
        list15.add(5);
        list15.add(1);
        list15.add(2);
        list15.add(8);
        list15.add(1);
        list15.add(0);
        list15.add(7);
        System.out.println("#15 OP="+filterRange(list15,1,7)+"\n");

        ArrayList<String> list16 = new ArrayList<String>();
        list16.add("four");
        list16.add("score");
        list16.add("and");
        list16.add("seven");
        System.out.println("#16 OP="+clump(list16)+"\n");

    }
    //#1
    public static double averageVowels(ArrayList<String> list){
        if(list.size()==0){
            return 0.0; 
        }
        int count = 0;
        for(int i=0;i<list.size();i++){
            String s = list.get(i);
            for(int j=0;j<s.length();j++){
                char c = s.charAt(j);
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                    count++;
                }
            }
        }
        return (double)count/list.size();
    }
    //#2
    public static ArrayList<String> swapPairs(ArrayList<String>a ){
        for(int i=0;i<a.size();i+=2){
            String temp = a.get(i);
            a.set(i,a.get(i+1));
            a.set(i+1,temp);
        }
        return a;
    }
    //#3
    public static ArrayList<String> removeEvenLength(ArrayList<String> list){
        for(int i=0;i<list.size();i++){
            String s = list.get(i);
            if(s.length()%2==0){
                list.remove(i);
                i--;
            }
        }
        return list;
    }
    //#4
    public static ArrayList<String> doubleList(ArrayList<String> list){
        for(int i=0;i<list.size();i++){
            list.add(i,list.get(i));
            i++;
        }
        return list;
    }
    //#5
    public static ArrayList<Integer> scalebyK(ArrayList<Integer> list){
        for(int i=0;i<list.size();i++){
            int number =list.get(i);
            if(number!=0){
                for(int j=1;j<number;j++){
                    list.add(i,number);
                    i++;
                }
            }else{
                list.remove(i);
                i--;
            }
        }
        return list;  
    }
    //#6
    public static ArrayList<Integer> minToFront(ArrayList<Integer> list){
        int min =list.get(0),pos=0;
        for(int i=0;i<list.size();i++){
            int number = list.get(i);
            if(number<min){
                min=number;
                pos=i;
            }
        }
        list.remove(pos);
        list.add(0,min);
        return list;
    }

    //#7
    public static ArrayList<String> removeDuplicates(ArrayList<String>a ){
        for(int i=0;i<a.size()-1;i++){
            for(int j=i+1;j<a.size();j++){
                if(a.get(i)==a.get(j)){
                    a.remove(j);
                    j--;
                }
            }
        }
        return a;
    }

    //#8
    public static ArrayList<Integer> removeZeros(ArrayList<Integer> list){
        for(int i=0;i<list.size();i++){
            if(list.get(i)==0){
                list.remove(i);
                i--;
            }
        }
        return list;
    }
    //#9
    public static int rangeBetweenZero(ArrayList<Integer> a){
        int count = 0;
        for(int i=0;i<a.size();i++){
            if(a.get(i)==0){
                count++;
            }
        }
        if(count<=1){
           return count;
        }
        return a.lastIndexOf(0)-a.indexOf(0);      
    }
    public static ArrayList<String> removeInrange
    (String start,String end,ArrayList<String>a)
    {
        int index = 0;
        while(index<a.size())
        {
            if(a.get(index).charAt(0)>=start.charAt(0)
            &&a.get(index).charAt(0)<=end.charAt(0))
            {
                a.remove(index);
                index--;
            }
            index++;
        }
        return a;
    }
    //#11
    public static ArrayList<String> stutter(ArrayList<String> list,int k){
        if(k>0){
            for(int i=0;i<list.size();i++){
                for(int j=1;j<k;j++){
                    list.add(i,list.get(i));
                    i++;
                }
            }
        }else if(k<=0){
            list.clear();
        }
        return list;
    }
    //#12
    public static ArrayList<String> markLength4(ArrayList<String> list){
        String a = "****";
        for(int i=0;i<list.size();i++){
            if(list.get(i).length()==4){
                list.add(i,a);
                i++;
            }
        }
        return list;
    }
    //#13
    public static ArrayList<Integer> reverse3(ArrayList<Integer> list){
        for(int i=0;i<list.size()/3;i++){
            int first = 3*i,end = 3*i+2,temp = list.get(first);
            list.set(first,list.get(end));
            list.set(end,temp);
        }
        return list;
    }
    //#14
    public static ArrayList<String> removeShorterStrings(ArrayList<String> a){
        for(int i=0;i<a.size()-1;i++){
            if(a.get(i).length()>a.get(i+1).length()){
                a.remove(i+1);
                i--;
            }else if(a.get(i).length()<a.get(i+1).length()){
                a.remove(i);
                i--;
            }
        }
        return a;
    }
    //#15
    public static ArrayList<Integer> filterRange(ArrayList<Integer> list,int min,int max){
        for(int i=0;i<list.size();i++){
            if(list.get(i)<=max&&list.get(i)>=min){
                list.remove(i);
                i--;
            }
        }
        return list;
    }
    //#16
    public static ArrayList<String> clump(ArrayList<String> a){
        for(int i=0;i<a.size()-1;i++){
            String word= "("+a.get(i)+" "+a.get(i+1)+")";
            a.remove(i+1);
            a.set(i,word);
        }
        return a;
    }
}
