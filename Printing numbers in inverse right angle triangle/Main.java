#include <stdio.h>

int main()
{
    int i, j, n,c;
  scanf("%d",&n);
 int count=n;
  for(i=n;i>=1;i--)
  {
    for(j=count;j>=1;j--)
    {
      printf("%d",j);
 
    }
 
    printf("\n");
    count=count-1;
  }
  return 0;
}