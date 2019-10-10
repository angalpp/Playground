import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	int a,b;
      Scanner br=new Scanner(System.in);
      a=br.nextInt();
      b=br.nextInt();

      if(a>b)
      {
       System.out.println("num1 is the greatest number");
      }
      else
      {
           System.out.println("num2 is the greatest number");
	}
    }
}