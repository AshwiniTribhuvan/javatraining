//run time polymorphism
//dynamic method dispatch
class A{
void read(){
System.out.println("Read from HDD");
}
}
class B extends A{
void read(){
System.out.println("Read from USB");
}
}
class c extends B{
void read(){
System.out.println("Read from Network");
}
}
class Demo{
public static void main(String[]args){
A ob1=new A();
B ob2=new B();
c ob3=new c();
show(ob1);
show(ob2);
show(ob3);
}
static void show(A r){
r.read();
}
}
