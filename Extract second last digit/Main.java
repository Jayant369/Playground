#include<stdio.h>
int main()
{
 int n,second_last_digit;
  scanf("%d",&n);
  second_last_digit=((n/10)%10);
  printf("%d",second_last_digit);
  return 0;
}