#include <stdio.h>
int main()
{
int n;int i;
printf("Enter the number whose table is required : ");
scanf("%d", &n);
for(i=1;i<=10;i++)
printf("%d X %d = %d\n", n,i,n*i);
return 0;    
}