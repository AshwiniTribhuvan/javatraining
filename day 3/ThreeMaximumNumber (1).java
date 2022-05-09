// find maximum between three numbers
import java.util.Scanner;
{

public class ThreeMaximumNumber(1) 
{
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        int a,b,c,max;
        System.out.println("Enter three numbers :");
        a = ob.nextInt();
        b = ob.nextInt();
        c = ob.nextInt();
        max = a>b?a:b;
        max = max>c?max:c;
        System.out.println("Maximum number is : "+max );
    }
}
