#include <stdio.h>
int main() 
{
	int f,l,n,s=0;
  scanf("%d",&n);
  

  l=n%10;
  while(n>=10)
  {
    n=n/10;
   
  }

  s=n+l;
  printf("%d",s);
	return 0;
}