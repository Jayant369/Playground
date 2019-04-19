#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<n;i++)
  {
  scanf("%d",&arr[i]);
  }
  int e1,e2;
  scanf("%d%d",&e1,&e2);
  int m1=0,m2=0;
  for(int index=0;index<n;index++)
  {
    if(e1==arr[index])
    {
      m1=1;
      printf("%d\n",index);
    }
    if(e2==arr[index])
    {
      m2=1;
      printf("%d\n",index);
    }
  }
  if(m1==0)
    printf("-1");
  if(m2==0)
    printf("-1");
  return 0;
}