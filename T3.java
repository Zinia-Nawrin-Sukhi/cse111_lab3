import java.util.Scanner;

  public class T3{
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("please enter word");
      String s=sc.nextLine();
      for( int i=0;i< s.length(); i++ ){
       char ch=s.charAt(i);
     int codeForch= (int )ch;
      System.out.println(ch+":"+codeForch);
    }
    }
    
}