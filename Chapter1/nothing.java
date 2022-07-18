public class nothing{
  public static final int size=3;
  public static void main(String[] args) {
    Triangle();
    Case();
    Upbox();
    Downbox();
    Case();
    Downbox();
    Upbox();
    Case();
    Triangle();
    }
  public static void Case(){
    System.out.print("+");
    for(int i=1;i<=size*2;i++){
      System.out.print("=*");
    }
    System.out.print("+");
    System.out.println();
  }
  public static void Triangle(){
    for(int i=1;i<=(2*size-1);i++){
      for(int j=1;j<=-i+6;j++)
      System.out.print(" ");
      for(int j=1;j<=i;j++)
      System.out.print("/");
      System.out.print("**");
      for(int j=1;j<=i;j++)
      System.out.print("\\");
      System.out.println();
    }
  }
  public static void Upbox(){
    for(int i=1;i<=size;i++){
      System.out.print("|");
      for(int k=1;k<=2;k++){
      for(int j=1;j<=-i+3;j++)
      System.out.print(".");
      for(int j=1;j<=i;j++)
      System.out.print("/\\");
      for(int j=1;j<=-i+3;j++)
      System.out.print(".");
      }
      System.out.println("|");
    }
  }
  public static void Downbox(){
    for(int i=1;i<=size;i++){
      System.out.print("|");
      for(int k=1;k<=2;k++){
      for(int j=1;j<=i-1;j++)
      System.out.print(".");
      for(int j=1;j<=-i+4;j++)
      System.out.print("\\/");
      for(int j=1;j<=i-1;j++)
      System.out.print(".");
      }
      System.out.println("|");
    }
}
}