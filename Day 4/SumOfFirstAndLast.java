import java.util.*;
public class SumOfFirstAndLast{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Number");
int number=sc.nextInt();
int firstDigit = 0;
int lastDigit = 0;
int count = 0;
int sum;

lastDigit=number%10;
System.out.println("Last digit:"+lastDigit);
int n =number;
while(n!=0)
{
count++;
n = n/10;
}
firstDigit=number/(int)Math.pow(10,count-1);
System.out.println("First digit:"+firstDigit);
sum=lastDigit+firstDigit;
System.out.println("sum of first and last Digit is : "+sum);
}
}