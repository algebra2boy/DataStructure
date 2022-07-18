import java.util.*;
public class Exercise
{
    public static void main()
    {
        int[] Exercise1 = {74, 85,102,99,101,85,56};
        int value = lastIndexOf(Exercise1,85);
        System.out.println("Exercise1\n"+Arrays.toString(Exercise1)+"\nlast index of the value 85 is "+value+"\n");

        int[] Exercise2 = {36,12,25,19,46,31,22};
        int range = range(Exercise2);
        System.out.println("Exercise2\n"+Arrays.toString(Exercise2)+"\nrange is "+range+"\n");

        int[] Exercise3 = {13,1,22,17,36,7,-43,5};
        int count = countInRange(Exercise3,4,17);
        System.out.println("Exercise3\n"+Arrays.toString(Exercise3)+"\nnumber of the element between 4 and 17 is "+count+"\n");

        double[] Exercise4 = {-100,1,3,4,5,20};
        boolean sorted = isSorted(Exercise4);
        System.out.println("Exercise4\n"+Arrays.toString(Exercise4)+"\n"+sorted+"\n");

        int[] Exercise6 ={1,-2,4,-4,9,-6,16,-8,25,-10};
        double stdev = stdev(Exercise6);
        System.out.println("Exercise6\n"+Arrays.toString(Exercise6)+"\nstandard deviation is"+stdev);

        int[] Exercise7 = {74,85,102,99,101,56,84};
        int kth = kthLargest(Exercise7,2);
        System.out.println("Exercise7\n"+Arrays.toString(Exercise7)+"\n"+"second largest is "+kth+"\n");

        int[] Exercise8 ={3,5,23,124,5,1,6,23,6,2,-124};
        int median = median(Exercise8);
        System.out.println("Exercise8\n"+Arrays.toString(Exercise8)+"\nmedian is "+median+"\n");  

        int[] Exercise9 = {11,11,6,3,1};
        int gap = minGap(Exercise9);
        System.out.println("Exercise9\n"+Arrays.toString(Exercise9)+"\nthe minimum differenc is "+gap+"\n");

        int[] Exercise10 ={1,2,5,6,8,10,12};
        double even = percentEven(Exercise10);
        System.out.println("Exercise10\n"+Arrays.toString(Exercise10)+"\nthe precentage of even is "+even+"\n");

        int[] Exercise11 = {1,2,3,10,8,9,12,643,7};
        boolean unique = isUnique(Exercise11);
        System.out.println("Exercise11\n"+Arrays.toString(Exercise11)+"\nto check whether it is a unique number\n"+unique+"\n");

        //Exercise14
        int[] list1 ={1,6,2,2,1,6,7,0,8};
        int[] list2= {2,2,1,6,7,0};
        boolean contains = contains(list1,list2);
        System.out.println("Exercise14\n"+Arrays.toString(list1)+"\n"+Arrays.toString(list2)+"\n"+contains+"\n");

        int[]Exercise15 = {1,2,3,4,5};
        int[] newlist = collapse(Exercise15);
        System.out.println("Exercise15\n"+Arrays.toString(Exercise15)+"\nnew list"+Arrays.toString(newlist)+"\n");
    }

    public static int[] collapse(int[] list){
        int len = list.length,position=0;int[] array;
        int last = list[list.length-1];
        if(len%2==0){
            array = new int[len/2];
        }else{
            array = new int[len/2+1];
            array[array.length-1]= last;
        }
        for(int i=0;i<len-1;i=i+2){
            int sum=0;
            sum=list[i]+list[i+1];
            array[position] = sum;
            position++;
        }
        return array;
    }

    public static boolean contains(int[]list1,int[] list2)
    {
        int pos_list2=0,count=0;
        for(int i=0;i<list1.length;i++){
            if(list1[i]==list2[pos_list2]){
                count++;
                pos_list2++;
                if(count==list2.length){
                    return true;
                }
            }else{
                count=0;
                pos_list2=0;
            }
        }
        return false;
    } 

    public static int median(int a[]){
        Arrays.sort(a);
        return(a[a.length/2]);
    }

    public static double stdev(int a[]){
        double average = 0;
        for(int i=0;i<a.length;i++){
            average+=a[i];
        }
        average = average/a.length;
        double sum = 0;
        for(int i=0;i<a.length;i++){
            sum+=Math.pow((a[i]-average),2);          
        }
        return Math.sqrt(sum/a.length-1);
    }

    public static boolean isUnique(int list[]){
        int count = 0;
        for(int i=0;i<list.length;i++){//to get through every number
            for(int j=i+1;j<list.length;j++){//to see if one number for next other number match
                //j = i+1 because you don't compare the number you have now, you want to compare with next number
                if(list[i]==list[j]){
                    count++;
                }
            }
        }
        return (count==0);
    }

    public static double percentEven(int list[]){
        int count = 0;double precentage;
        for(int i=0;i<list.length;i++){
            if(list[i]%2==0){
                count++;
            }            
        }
        precentage = ((double)count/list.length)*100;
        return precentage;
    }

    public static int minGap(int list[]){
        Arrays.sort(list);
        if(list.length<=2){
            return 0;
        }else{
            int min = list[1]-list[0];
            for(int i=0;i<list.length-1;i++){
                if(list[i+1]-list[i]<min){
                    min = list[i+1]-list[i];
                }
            }
            return min;
        }
    }

    public static int kthLargest(int list[],int k){
        Arrays.sort(list);
        return (list[list.length-1-k]);
    }

    public static boolean isSorted(double list[]){
        for(int i=0;i<list.length-1;i++){
            return (list[i]<list[i+1]);           
        }
        return false;
    }

    public static int countInRange(int a[], int min,int max){
        int count = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]>=min && max>=a[i]){
                count++;
            }
        }
        return count;
    }

    public static int range(int[]a){
        int smallest = a[0],biggest = a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>biggest){
                biggest = a[i];
            }else{
                smallest = a[i];
            }
        }
        return(biggest-smallest+1);
    }

    public static int lastIndexOf(int[] a, int k)
    {
        int index=-1;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==k){
                index = i;
            }
        }
        return index;
    }
}