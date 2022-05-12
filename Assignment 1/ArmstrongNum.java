// print all Armstrong numbers between 100 to 999 using while loop.
public class ArmstrongNum{
public static void main(String[]args){
int i=100,arm,c,a;
System.out.println("Armstrong num betweem 100 to 999");
while(i<999)
{
c=i;
arm=0;
while(c>0)
{
a=c%10;
arm=arm+(a*a*a);
c=c/10;
}
if(arm==i)
System.out.println(i);
i++;
}
}
}
