class Test
{
int i;
static int j;
Test();
   int  i=i+1;
    int  j=j+1;
}
void Show()
{
System.out.println(i);
System.out.println(j);
}
}
public class DemoClass3
{
public static void main(String[]args){
Test t1 =new Test();
Test t2 =new Test();
Test t3 =new Test();
t1.show();
t2.show();
t3.show();
}
}