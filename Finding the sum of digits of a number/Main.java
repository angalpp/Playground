#include <stdio.h>
int main() {
int t,n,r,s;
  scanf("%d",&n);
  t=n;
  while (t!=0)
  {
    r=t%10;
    s=s+r;
    
   t=t/10;
  }
  printf("%d",s);
   
	return 0;
}