#include <stdio.h>
#include <math.h>

//Question 1 ka 1 (Salary)
int Q1_1()
{
    float Basic_Salary;

    printf("\n Basic Salary: ");
    scanf("%f",&Basic_Salary);

    float HRA = (float) 20/100 * Basic_Salary;
    float DA = (float) 5/100 * Basic_Salary;
    float Gross_Salary = Basic_Salary + HRA + DA;
    float PF = (float) 5/100 * Gross_Salary;
    float Net_Salary = Gross_Salary - PF;

    printf("\n Net Salary: %f", Net_Salary);
}

//Question 1 ka 2 (Volume)
int Q1_2()
{
    float PI = 3.14;
    float r, h;

    printf("Enter the Values:\n Radius: ");
    scanf("%f",&r);
    printf(" Height: ");
    scanf("%f",&h);

    float Vcone = (float) 1/3 * PI * r * r *h;
    float Vcylinder = (float) PI * r * r * h;
    float Vsphere = (float) 4/3 * PI * r * r * r;

    printf("\n Volume of Cone: %f \n Volume of Cylinder: %f \n Volume of Sphere: %f", Vcone, Vcylinder, Vsphere);
}

//Question 2 ka 1 (Commission)
int Q2_1()
{
    float sales, commission;

    printf("\n Enter The Sales Amount: ");
    scanf("%f",&sales);

    if(sales<10000)
    commission = (float) 10/100 * sales;

    else if(sales>=10000 && sales<=50000)
    commission = (float) 15/100 * sales;

    else if(sales>50000)
    commission = (float) 20/100 * sales;

    printf("\n Commission Amount: %f", commission);
}

//Question 2 ka 2 (Character Identification)
int Q2_2()
{
    char x;

    printf("Any Single Value: ");
    scanf("%c",&x);

    if((int)x >=97 && (int)x <=122)
    printf("\n Lower Case Alphabet");

    else if((int)x >=65 && (int)x <=90)
    printf("\n Upper Case Alphabet");

    else if((int)x >=48 && (int)x <=57)
    printf("\n Digit");

    else if((int)x == 32)
    printf("\n Space");

    else
    printf("\n Special Symbol");

}

//Question 2 ka 3 (Tax)
int Q2_3()
{
    float Income, tax;

    printf("Enter The Annual Gross Income: ");
    scanf("%f",&Income);

    if(Income<=100000)
    tax = 0;

    else if(Income<=500000)
    tax= 1000 + (float)10/100 * (Income - 100000);

    else if(Income<=800000)
    tax = 5000 + (float)20/100 * (Income - 500000); 

    else
    tax = 10000 + (float)30/100 * (Income - 600000);

    printf("\n Tax Payable = %f",tax);
}

//Question 2 ka 4 (Year)
int Q2_4()
{
    int year;

    printf("\n Enter the year: ");
    scanf("%d",&year);

    if(year%100!=0 && year%4==0)
    printf("\n Leap Year");

    else if(year%100==0 && year%400==0)
    printf("\n Leap Year");

    else 
    printf("\n Not a Leap Year");
}

//Question 3 ka 1 (Factorial)
int Q3_1()
{
    int num, factorial=1;

    printf("\n Enter The Number: ");
    scanf("%d",&num);

    if(num==0)
    printf(" Factorial of %d is %d", num, factorial);

    else
    {
        for(int i=1; i<=num; i++)
        {
            factorial = factorial * i;
        }
        
        printf(" Factorial of %d is %d", num, factorial);
    }

}

//Question 3 ka 2 (Hexadecimal)
int Q3_2()
{
    int deci;

    printf("\n Enter The Decimal Number: ");
    scanf("%d",&deci);


    int conver[16];
    int i=0;
    while(i<=10)
    {
        conver[i]=48+i;
        i++;
    }

    i--;

    while(i<16)
    {
        conver[i]=65+(i-10);
        i++;
    }


    int remain[deci];
    i=0;
    while(deci>0)
    {
        remain[i] = deci % 16;
        deci = deci / 16;
        i++;
    }
    ~
    i--;

    while(i>=0)
    {
        printf("%c",conver[remain[i]]);
        i--;
    }
}

//Question 3 ka 3 (Prime)
int Q3_3()
{
    int a=2, i, flag;

    printf("\n Prime Numbers between 1 to 300: \n");

    while(a<=300)
    {
        i=2, flag=1;

        while(i<=sqrt(a))
        {
            if(a%i==0)
            flag=0;

            i++;
        }

        if(flag==1)
        printf("%d ",a);
        
        a++;
    }
}

//Question 4 ka 1 (Recursion Factorial)
int factorial(int n)
{
    if(n==0)
    return 1;

    else
    {
        int f = n * factorial(n-1);
        return f;
    }
}
int Q4_1()
{
    //Without Recursion
    int num;
    printf("\n (Without Recursion) Enter the number: ");
    scanf("%d",&num);

    int i=1, fact=1;
    while(i<=num)
    {
        fact = i*fact;
        i++;
    }
    printf("\n Factorial of %d is : %d",num,fact);



    //With Recursion
    int num1;
    printf("\n\n (With Recursion) Enter the number: ");
    scanf("%d",&num1);

    int answer = factorial(num1);
    printf("\n Factorial is: %d",answer);
}

//Question 4 ka 2 (Recursion Prime or not)
int Q4_2()
{
    //Without Recursion
    int n, flag=1;
    printf("\n (Without Recursion) Enter The Number:");
    scanf("%d",&n);

    int i=2;
    while(i<=sqrt(n))
    {
        if(n%i==0)
        flag=0;

        i++;
    }
    if(flag==1)
    printf("\n Prime Number");
    else
    printf("\n Not a Prime Number");



    //With Recursion
    int n1;
    printf("\n (With Recursion) Enter the Number: ");
    scanf("%d",&n1);


    
}

//Question 4 ka 3 (Recursion)

//Question 5 ka 1 (Array Marks)
int Q5_1()
{
    int a[5];

    printf("\n Enter the Marks of 5 papers: ");

    int i=0;
    while(i<=4)
    {
        printf("\n Subject%d: ",i+1);
        scanf("%d",&a[i]);
        i++;
    }

    i--;
    float average=0;
    while(i>=0)
    {
        average=a[i] + average;
        i--;
    }

    average = average / 5;
    printf("\n Average of marks is: %f",average);
}

//Question 5 ka 2 (Cyclic Permutation)

//Question 5 ka 3 (5 papers 5 learners 2D array)
int Q5_2()
{
    int N;
    printf("Number of Learners for 5 papers: ");
    scanf("%d",&N);

    int a[N][5];
    float average[N];


    printf("\n Enter the Learner number and Marks: ");

    for(int i=0; i<N; i++)
    {
        printf("\n Learner%d: \n",i+1);
        average[i]=0;

        for(int j=0; j<=4; j++)
        {
            printf("\t Subject%d: ",j+1);
            scanf("%d",&a[i][j]);
            average[i] = a[i][j] + average[i];
        }
        average[i]=average[i]/5;
    }

    int first, pass, fail;
    first=pass=fail=0;

    for(int i=0; i<N; i++)
    {
        if(average[i]>59)
        first++;
        else if(average[i]>39)
        pass++;
        else
        fail++;

        printf("\n Learner%d Average marks:%f",i,average[i]);
    }
    printf("\n\n Count:");
    printf("\n First Class: %d",first);
    printf("\n Pass Class: %d",pass);
    printf("\n Fail: %d",fail);

}

//Question 5 ka 4
//Question 5 ka 5
//Question 5 ka 6

//Question 6 ka 1
//Question 6 ka 2 (Count the length of the string)
int count(char *p)
{
    int len=0;
    while(*p!='\0')
    {
        len++;
        p++;
    }
    return len;
}
int Q6_2()
{
    char a[20];

    printf("\n Enter The String: ");
    scanf("%s",&a);

    char *p=a;

    int len=count(p);

    printf("\n Length of the string: %d",len);
}

//Question 6 ka 3
//Question 6 ka 4

//Question 7 ka 1 (Add 6*6 Matrices)
void add(int a[3][3], int b[3][3], int ans[3][3])
{
    for(int i=0; i<3; i++)
    {
        for(int j=0; j<3; j++)
        {
            ans[i][j]= a[i][j] + b[i][j];
        }
    }
}
int Q7_1()
{
    int a[3][3]={
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };
    int b[3][3]={
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };
    
    int ans[3][3];

    add(a, b, ans); 

    for(int i=0; i<3; i++)
    {
        for(int j=0; j<3; j++)
        {
            printf("%d ",ans[i][j]);
        }
        printf("\n");
    }   
}

//Question 7 ka 2 (Multiply 3*3 Matrices)


//Question 7 ka 3

//Question 8 ka 1
//Question 8 ka 2
//Question 8 ka 3
//Question 8 ka 4
//Question 8 ka 5

//Question 9 ka 1
//Question 9 ka 2

int main()
{
    
}