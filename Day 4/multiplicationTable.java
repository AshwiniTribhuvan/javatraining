 //Write program to print multiplication table of a given number

import java.util.*;
class multiplicationTable
{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
System.out .println("enter  no ");
int n=sc.nextInt();
int i=1,a;
while(i<=10)
{ a=n*i;
System.out.println("Multiplication no" + a);
i=i+1;
}
}
}