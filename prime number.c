#include<stdio.h>
int main()
{
   long int n,i,j,k;
   int count=0;
    scanf("%ld",&n);
    for(i=2;i<n;i++)
    {
       for(j=1;j<=i;j++)
        {
            if(i%j==0)
            {
            count++;
        }
        }
        if(count==2)
        {
            printf("%ld ",i);
        }
        count=0;

    }
    return 0;
}
