class ReverseOrder
{
public static void main(String[] args)
{
int[] val = {0,1,2,3};
int temp;
System.out.println("Origin Array:"+ val[0]+" "+val[1]+" "+val[2]+" "+val[3]);
System.out.println("Reversed Array:");
for (int i =val.length-1;i>=0;i--)
{
System.out.print(" "+val[i]);
}
}
}