#include<stdio.h>
int main()
{
 int year,f=0;
  scanf("%d",&year);

    if (year % 4 == 0)
    {
        if (year % 100 == 0)
        {
            if (year % 400 == 0)
                f=1;
          else
            f=0;
        }
        else
      f=1;
    }
  else
    f=0;
 if(f==1)
    printf( "Leap year");
  else
      printf( "Not Leap year");
 
  return 0;
}