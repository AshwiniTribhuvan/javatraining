class A{
int i;
A()
{
i=10;
System.out.println("In A");
}
}
class B extends A{
int i;
B(){
i=20;
System.out.println("In B");
}
void add(){
System.out.println(i+1);
}
}
public class DemoInheritance
{
public static void main(String[]args)
{
B ob = new B();
ob.add();
}
}