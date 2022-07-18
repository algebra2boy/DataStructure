public class Chapter2Project8 {
  public static final int Size =10;
  public static void main(String[] args) {
    CaseTop();
    Top();
    CaseMiddle();
    Bottom();
    Case();
  }
  public static void CaseTop(){
    for(int i=1;i<=11;i++){
      System.out.print(" ");
    }
    Case();
    System.out.println();
    } 
    public static void Top(){
        for(int i=1;i<=10;i++){
            for(int j=0;j<11-i;j++){
            System.out.print(" ");
        }
            System.out.print("/");
            for(int j=0;j<-3*i+30;j++){
            System.out.print(" ");
            }
            System.out.print("___");
            System.out.print("/");
            for(int j=0;j<i-1;j++){
            System.out.print("__");
            System.out.print("/"); 
        }
            for(int j=0;j<i-1;j++){
            System.out.print("/");
        }
            System.out.println();
        }
    }
    public static void CaseMiddle(){
            Case();
            for(int j=1;j<=10;j++){
            System.out.print("/");
            }
            System.out.println();
    }
    public static void Case(){
            System.out.print("+");
            for(int i=1;i<=30;i++){
            System.out.print("-");
            }
            System.out.print("+");
            }
    public static void Bottom(){
          for(int i=1;i<=5;i++){
              System.out.print("|    Building Java Programs    |");
              for(int j=0;j<-2*i+12;j++){
              System.out.print("/");
        }
        System.out.println();
    }
}
}
          
         
 