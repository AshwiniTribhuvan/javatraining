class Test1{
int i,j;
void add(){
System.out.println(i+j);
}
Test(int x,int y);
{
i=x;
j=y;
}
}
public class Demo2
{
public static void main(String[]args)
{
Test t1=new Test();
t1.setij(10,20);
Test t2=null;
t2=t1;
t2.setj(30,40);
t1.add();
t2.add();
}
]