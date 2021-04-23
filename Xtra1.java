import java.util.Scanner;

  public class Xtra1{
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("please enter word");
      String s=sc.nextLine();
     int []a =new int[91];
     char []ch=s.toCharArray();
     for(int i=0;i<ch.length;i++)
     {
       for(int j=i+1;j<ch.length;j++)
       {
         if(ch[i]>ch[j])
         {
           char temp=ch[i];
           ch[i]=ch[j];
           ch[j]=temp;
         }
       }
     }
     for(int i=0;i<ch.length;i++)
     {
       System.out.print(ch[i]);
     }
    }
      } 
