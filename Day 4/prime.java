// Write program to check a enter number is Prime number or not using while & for loop

import java.util.*;
class prime
{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
System.out.println("enter number  ");
int n=sc.nextInt();
int i,c=0;
for( i=2;i<=n;i++)
{if(n%1==0)

c=c+1;

}
if(c==2){
System.out.println("prime no is "+n);

}
else{
System.out.println("not prime number");
}
}}