#include <stdio.h>
#include <math.h>

//Swapping 2 Variables
int swap1()
{
  int a=10, b=20;

  printf("\n Before swapping Values: a=%d  b=%d",a,b);

  a=a+b;
  b=a-b;
  a=a-b;

  printf("\n After swapping Values: a=%d  b=%d",a,b);
}

//Swapping 3 Variables
int swap2()
{
  int a=10, b=20;

  printf("\n Before swapping Values: a=%d  b=%d",a,b);

  int t=a;
  a=b;
  b=t;

  printf("\n After swapping Values: a=%d  b=%d",a,b);
}

//Check Prime Numbers
int prime()
{
  int a;

  printf("\n Enter the Number: ");
  scanf("%d",&a);

  int i=2;
  while(i<=sqrt(a))
  {
    if(a%i==0)
    {
      printf("\n Not a Prime Number");
      return 0;
    }
    i++;
  }

  printf("\n Prime Number");
}

//Armstrong
//Narcisstic
//Fibonaci
//
int main()
{
  float a=5.98682678;

  printf("%f",a);
  printf("\n %2f",a);
}