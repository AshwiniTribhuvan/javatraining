import java.util.*;
class input {
	public static void main(String args[])
	{
   String name ;
   int age;
   System.out.println("Your name is ");
   System.out.println("Your age is ");

   Scanner sc=new Scanner(System.in);
   name=sc.next();
   age=sc.nextInt();
		System.out.println("Your name is "+name + ".your  and age"+age);
	}
}