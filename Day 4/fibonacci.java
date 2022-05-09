// Write program to print Fibonacci series


import java.util.*;
class fibonacci
{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
System.out .println("enter  no ");
int c=sc.nextInt();
int a=0,b=1,sum,i;
for(i=2;i<=c;i++)
{ sum=a+b;


System.out.println(sum );
a=b;
b=sum;
}
}}
