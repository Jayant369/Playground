
#include <stdio.h>
int main()
{
  int n1,n2,n3;
  scanf("%d%d%d",&n1,&n2,&n3);
  printf("%d",gcd(n1,n2,n3));
	return 0;
}
int gcd(int n1, int n2,int n3)
{
  int min,gcd;
  if(n1<n2)
    min=n1;
  else
    min=n2;
  while(min>=1)
  {
    if(n1%min==0 && n2%min==0)
    {
      gcd=min;
      break;
    }
    else
    {
      min--;
    }
  }
  
  if(gcd<n2)
    min=gcd;
  else
    min=n2;
  while(min>=1)
  {
    if(gcd%min==0 && n2%min==0)
    {
      gcd=min;
      break;
    }
    else
    {
      min--;
    }
  }
  return gcd;
}