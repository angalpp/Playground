#include<stdio.h>
int main()
{
    int i,j,n,c;
  scanf("%d",&n);
    int count=1;
   for(i=1;i<= n;i++)
   {
	    for(j=1;j<=n-i;j++)
	    {
	    printf(" ");
	    }
	    for(c=1;c<=i;c++)
	    {
		    printf("%d ",count);
          count++;
	    }
        
		
	    printf("\n");
    }
    return 0;
}