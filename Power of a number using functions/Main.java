#include<stdio.h>
int main()
{
  int base,exponent;
  scanf("%d%d",&base,&exponent);
  printf("%d",power(base,exponent));
  	return 0;
}
int power(int base, int exponent)
{
  int power;
  power=(pow(base,exponent));
  return power;
}
