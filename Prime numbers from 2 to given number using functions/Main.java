#include<stdio.h>
int is_print(int m);
int main()
{
  int n;
  scanf("%d",&n);
  for(int i=2;i<=n;i++)
  {
    if(is_prime(i))
    {
      printf("%d\n",i);
    }
  }
    return 0;
}
int is_prime(int m)
{
  int is_prime=1;
  for(int num=2;num<=m/2;num++)
  {
    if(m%num==0)
    {
      is_prime=0;
      break;
    }
  }
  return is_prime;
}