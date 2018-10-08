#include<stdio.h>
int main()
{
char a[10]={'P','R','O','G','R','A','M'};
int i,j,m[100][100];
int n=7,k;
k=n;
for(i=0;i<=n-1;i++)
{
for(j=0;j<=n-1;j++)
{
if(i==j)
{
m[i][j]=a[i];
printf("%c",m[i][j]);

}
else if(j==n-1)
{
m[i][j]=a[j];
printf("%c",m[i][j]);

}
else
{
printf(" ");


}

}
printf("\n");
n--;
}
for(i=4;i<=k-1;i++)
{
for(j=0;j<=k-1;j++)
{
if(i==j)
{
m[i][j]=a[i];
printf("%c",m[i][j]);

}
else if(j==k-1-i)
{
m[i][j]=a[j];
printf("%c",m[i][j]);
}
else
{
printf(" ");


}
}
printf("\n");
}
}



