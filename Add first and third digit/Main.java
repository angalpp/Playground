#include<stdio.h>
int main()
{
int a,b,c,sum;
  scanf("%d",&a);
  b=a%10;
  c=a/100;
  sum=c+b;
  printf("%d",sum);
  return 0;
}