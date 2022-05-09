import java.util.*;
class Exercise
{
public static void main(String []args)
{
int[] val={13,-4,82,17};
int[]twice=new int[val.length];
System.out.println("Original Array:"+val[0]+" "+val[1]+" "+val[2]+" "+val[3]);

for(int i=0;i<val.length;i++)
{
twice[i]=val[i];
System.out.println(twice[i]*2 + " ");
};
}
}