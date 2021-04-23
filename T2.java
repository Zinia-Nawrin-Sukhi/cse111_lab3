import java.util.Scanner;

  public class T2{
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("please enter word");
      String s=sc.nextLine();
      for(int i=0;i<=s.length();i++){
    char a=s.charAt(i);
      System.out.println(a);
    }
    
}
  }