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
  moving(n,arr);
  for(int i=0;i<n;i++)
  {
    printf("%d ",arr[i]);
  }
  return 0;
}
void moving (int n,int arr[])
{
  int zero_count=0;
  int zero[n];
  int zero_size=0;
  int arr2[n];
  int arr2_size=0;
  for(int i=0;i<=n;i++)
  {
    if(arr[i]!=0)
    {
      arr2[arr2_size]=arr[i];
      arr2_size++;
    }
    else
    {
      zero[zero_size]=arr[i];
      zero_size++;
    }
  }
  int arr_index=0;
  for(int i=0;i<arr2_size-1;i++)
  {
    arr[arr_index]=arr2[i];
    arr_index++;
  }
  for(int i=0;i<=zero_size-1;i++)
  {
    arr[arr_index]=zero[i];
    arr_index++;
  }
}

