//single level programs
class Student{
private int id;
private String name;
Student(int id,String name)
{
this.id=id;
this.name=name;
}
int getId(){
return id;
}
String getName(){
return name;
}
}
class mark extends Student{
float M1,M2;
mark (int id,String name,float M1,float M2){
super(id,name);
this.M1= M1;
this.M2= M2;
}
void show(){
System.out.println("Id:"+getId());
System.out.println("Name:"+getName());
System.out.println(M1);
System.out.println(M2);
}
}
public class  DemoSingle{
public static void main(String[]args){
mark ob1;
ob1=new mark(1,"abc",90,89);
ob1.show();
}
}

