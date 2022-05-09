import java.util.*;
class rainfall
{
public static void main(String args[])
{
int april ,may,june;
double avrage;
Scanner sc=new Scanner(System.in);
april=sc.nextInt();
may=sc.nextInt();
june=sc.nextInt();
avrage=(april+may+june)/3;
System.out.println("Rainfall for april is \t "+april );
System.out.println("Rainfall for may is \t "+ may );
System.out.println("Rainfall for june is \t "+ june );
System.out.println("Avarage is  "+avrage );



}
}