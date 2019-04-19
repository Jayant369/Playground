#include<stdio.h>
int main()
{
  int n,largest;
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  largest=arr[0];
  for(int j=1;j<n;j++)
  {
    if(arr[j]>largest)
      largest=arr[j];
  }
  printf("%d",largest);
  return 0;
}