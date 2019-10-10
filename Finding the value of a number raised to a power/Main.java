import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      int base,expo;
      Scanner val=new Scanner(System.in);
      base=val.nextInt();
      expo=val.nextInt();
      int pow=1;
      for(int i=1;i<=expo;i++)
      {
        pow=pow*base;
      }
      System.out.println(pow);
    }
}