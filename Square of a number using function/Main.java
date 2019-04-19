#include<stdio.h>
int main()
{
  int n,square;
  scanf("%d",&n);
  square=sqr(n);
  printf("%d",square);
   return 0;
}
sqr( int a)
{
  int s=(a*a);
  return s;
}