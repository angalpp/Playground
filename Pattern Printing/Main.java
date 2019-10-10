import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      int n;
      Scanner pattern=new Scanner(System.in);
      n=pattern.nextInt();
      for(int i=n;i>0;i--)
      {
        for(int j=n;j>0;j--)
        {
          if(i<=j)
          {
            System.out.print(j);
          }
          else
          {
            System.out.print(i);
          }
        }
        System.out.println();
      }
    }
}