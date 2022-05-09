import java.util.*;
class Max
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out .println("enter 3 no ");
int a,b,c;
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if(a>=b && a>=c)
{
System.out .println("A is max ");
}
else if(b>=a && b>=c)
{
System.out .println("B is max ");
}
else if(c>=a && c>=b)
{
System.out .println("C is max ");
}
else{}
}
}
