#include <stdio.h>
int main() 
{
   int n,num=0;;
  scanf("%d",&n);
  for(int row=1;row<=n;row++)
  {
    for(int space=1;space<=(n-row);space++)
    {
      printf(" ");
    }
    for(int col=1;col<=row;col++)
    {
      num++;
      printf("%d ",num);
    }
    printf("\n");
  }
	return 0;
}