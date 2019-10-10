import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      int option;
      Scanner shape=new Scanner(System.in);
      option=shape.nextInt();
      switch(option)
      {
        case 1:
          int side=shape.nextInt();
          int square=side*side;
          System.out.println(square);
          break;
        case 2:
         int length=shape.nextInt();
          int breadth=shape.nextInt();
          int area=length*breadth;
          System.out.println(area);
          break;
        case 3:
            int  base=shape.nextInt();
          int height=shape.nextInt();
          int tri=(base*height)/2;
          System.out.println(tri);
          break;
        case 4:
          double pi=3.1399999999999999d;
          double radius=shape.nextInt();
          double rad=pi*(radius*radius);
          System.out.println(rad);
          break;
        default:
            System.out.println("invalid input");
          break;
      }
            
    }
}