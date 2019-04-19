#include<stdio.h>
int main()
{
 int n,f,t,sum;
  scanf("%d",&n);
  f=(n/100);
  t=(n%10);
  sum=(f + t);
  printf("%d",sum);
  return 0;
}