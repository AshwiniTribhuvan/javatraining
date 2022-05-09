//Write a program that asks the user to enter two words. The program then prints out both words 
//on one line. The words will be separated by enough dots so that the total line length is 30:


import java.util.*;
class SeparateDots
{
public static void main(String args[])
{String first;
String second;
Scanner sc =new Scanner(System.in);
System.out .println("enter 2 words  ");

first=sc.next();
second=sc.next();
int x=30-(first.length()+second.length());
System.out.print(first);
for(int i=0;i<x;i++)
{


System.out.print("." );
}

System.out.print(second);
}}
