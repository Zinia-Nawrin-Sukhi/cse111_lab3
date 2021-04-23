import java.util.Scanner;
public class Task6{
  public static void main (String []args){
    String myName;
    Scanner sc=new Scanner (System.in);
    myName= sc.nextLine();
    System.out.println (myName);
    myName=myName.concat("==THE END==");
    System.out.println (myName);
  }
}
     