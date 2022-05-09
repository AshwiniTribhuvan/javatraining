// Write program to calculate power of number (a raise to b) using while & for loop


import java.util.*;
class power
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int r=1;

System.out.println("Enter no" );
int a=sc.nextInt();

System.out.println("Enter no power" );
int b=sc.nextInt();

for( int i=1; i<=b ;i++)
{
r=a*r;
}

System.out.println("power" +r );

}
}
