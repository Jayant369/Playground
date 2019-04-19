
#include <stdio.h>
int main()
{
  int n1,n2,n3;
  scanf("%d%d%d",&n1,&n2,&n3);
  printf("%d",great(n1,n2,n3));
  	return 0;
}
int great(int n1,int n2,int n3)
{
  int g,greatest;
  if(n1<n2)
  {
    g=n2;
  }
  else
  {
    g=n1;
  }
  if(g<n3)
  {
    greatest=n3;
  }
  else
  {
    greatest=g;
  }
  return greatest;
}
