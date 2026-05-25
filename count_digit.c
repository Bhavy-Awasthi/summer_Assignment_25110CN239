#include <stdio.h>
int main()
{
    int n,count=0;
    printf("Enter the number whose digits are to be counted : ");
    scanf("%d", &n);
    while(n>0)
    {
        count++;
        n=n/10;
    }
    printf("\n The number of digits in the given number is : %d", count);
    return 0;
}