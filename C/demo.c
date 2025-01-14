#include<stdio.h>
int prime(int n);

int main()
{
    int n1;
    printf("\n (With Recursion) Enter the Number: ");
    scanf("%d",&n1);

    int a=prime(n1);

    printf("%d",a);

}

int prime(int n)
{
    if(n==0)
    return 2;
    
    else
    return n*prime(n-1);
}