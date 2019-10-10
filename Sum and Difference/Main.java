import java.util.Scanner;
import java.util.*;
class Main
{
    	public static void main(String args[])
        {
          int a,b,sum=0,dif;
          
           Scanner br=new Scanner(System.in);
          a=br.nextInt();
          b=br.nextInt();
          sum=a+b;
          dif=a-b;
          System.out.println(sum);
           System.out.println(dif);
        }
}