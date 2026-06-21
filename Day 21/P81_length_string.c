#include <stdio.h>
int main()
{   char a[100];
   printf("Enter a string: "); 
   scanf("%s",a); // taking input of the string
        int i=0;
        int length = 0; // to count the length of the string
        while(1)
        {
            if(a[i] == '\0') 
                break; 
            length++;
            i++;
        }
       printf("\nLength of the string is: %d",length); // printing the length of the string
       return 0;
    }
