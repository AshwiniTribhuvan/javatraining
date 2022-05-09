class Demo
{
int i,j;
void add()
{
System.out.println(i+j);
}
Demo(int x,int y)
{
i=x;
j=y;
}
}

class Test
{
public static void main(String[]args)
{
Demo t1=new Demo(10,20);
Demo t2=new Demo(30,40);
Demo t3=null;
//t2=t1;
t1.add();
t2.add();
t3.add();
}

}
