#include <stdio.h>
int main() 
{
  int n;
  scanf("%d",&n);
  for(int row=1;row<=n;row++)
  {
    for(int space=1;space<=(n-row);space++)
    {
      printf(" ");
    }
    for(int col_no=1;col_no<=(2*row-1);col_no++)
    {
      printf("*");
    }
    printf("\n");
  }
  return 0;
}