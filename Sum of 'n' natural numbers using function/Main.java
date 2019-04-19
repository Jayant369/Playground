#include<stdio.h>
int main() 
{
  int n,sum;
  scanf("%d",&n);
  sum=summation(n);
  printf("%d",sum);
  	return 0;
}
summation(int a)
{
  int s=(a*(a+1))/2;
  return s;
}