import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      int r,p,q,a,b;
      
   Scanner br=new Scanner(System.in);
      a= br.nextInt();
      b=br.nextInt();
      p=a*b;
      r=a/b;
      q=a%b;
      System.out.println(p);
       System.out.println(r);
       System.out.println(q);
      
      
    }
}