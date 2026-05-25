#include <stdio.h>
int main()
{
    int n,i,f=1;
    printf("Enter the number whose factorial is required : ");
    scanf("%d", &n);
    for(i=1;i<=n;i++)
    {
        f=f*i;
    }
    printf("The factorial of %d is :  %d", n,f);
    return 0;

}