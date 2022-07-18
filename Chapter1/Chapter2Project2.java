public class Chapter2Project2 {
  public static void main(String[] args) {
    Case();
    Up();
    Down();
    Case();
    Down();
    Up();
    Case();
  }
  public static void Case(){
    System.out.print("+");
    for(int i=1;i<=9;i++){
      System.out.print("-");
    }
    System.out.print("+");
    System.out.println();
    }
  public static void Up(){
    for(int i=1;i<=4;i++){
      System.out.print("|");
      for(int j=0;j<-i+5;j++)
      System.out.print(" ");
      for(int j=0;j<i-1;j++)
      System.out.print("/");
      System.out.print("*");
      for(int j=0;j<i-1;j++)
      System.out.print("\\");
      for(int j=0;j<-i+5;j++)
      System.out.print(" ");
      System.out.print("|");
      System.out.println();
    }
  }
   public static void Down(){
    for(int i=1;i<=4;i++){
      System.out.print("|");
      for(int j=0;j<i;j++)
      System.out.print(" ");
      for(int j=0;j<-i+4;j++)
      System.out.print("\\");
      System.out.print("*");
      for(int j=0;j<-i+4;j++)
      System.out.print("/");
      for(int j=0;j<i;j++)
      System.out.print(" ");
      System.out.print("|");
      System.out.println();
    }
}
}