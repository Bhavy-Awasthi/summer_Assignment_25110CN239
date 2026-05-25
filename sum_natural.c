#include <stdio.h>
int main() {
    int n, sum = 0;
    printf("Enter the number of natural numbers to be added : ");
    scanf("%d", &n);
    sum=(n*(n+1))/2;
    printf("The sum of first %d natural numbers is : %d", n, sum);
    return 0;
}