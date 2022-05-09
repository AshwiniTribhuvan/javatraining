import java.util.*;
class finally8{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
try{
System.out.println("Enter 2 number");
int a=sc.nextInt();
int b=sc.nextInt();
int r=a/b;
System.out.println("result is "+r);
}
catch(ArithmeticException e)
{
System.out.println(e + " caught");
} 
finally{
System.out.println("Always ExECUTED");
}
}
}