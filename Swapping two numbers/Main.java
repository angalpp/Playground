import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
     int a,b,temp;
      Scanner br=new Scanner(System.in);
      a=br.nextInt();
      b=br.nextInt();
      temp=a;
      a=b;
      b=temp;
      System.out.println(a);
      System.out.println(b);
    }
}