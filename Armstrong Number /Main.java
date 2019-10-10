#include <stdio.h>
#include <math.h>
int main() {
	int n,temp=0,c=0,sum,n1=0;
  scanf("%d",&n);
  temp=n;
  
  while(n>0)
  {
    int r=n%10;
    c++;
    n=n/10;
  }
  n1=temp;
 
  while(n1>0)
  {
    int r1=n1%10;
     
    sum=sum+pow(r1,c);
    
    n1=n1/10;
  }
  if(sum==temp)
  {
    printf("Armstrong Number");
  }
  else
  {
    printf("Not an Armstrong Number");
  }

	return 0;
}