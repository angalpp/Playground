
#include<stdio.h>
int main()
{	
	int n,count;
    scanf("%d",&n);
 
  
	for(int starcount = 1 ; starcount <= n ; starcount++) 
        {
		   printf("%d",starcount);
      count=count+1;
      if(count%3==0)
      {
        printf(",");
        count=0;
		  		
		}
  }
     return 0;
}