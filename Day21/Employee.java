/*Create an ArrayList of Employee( id,name,address,sal) objects and search for particular Employee 
object based on id number*/
import java.util.*;
class Employee
{
int id;
String name;
String address;
double salary;
Employee(int id,String name,String address,double salary)
{
this.id=id;
this.name=name;
this.address=address;
this.salary=salary;
}
int getId()
{
return id;
}
public String toString()
{
return "("+id+","+name+","+address+","+","+salary+")";
}
}
class assign4
{
public static void main(String[]args)
{
ArrayList<Employee>ar;
ar=new ArrayList<>();
employyee e1=new employee(1,"ABC","aurangabad",1200.02);
employyee e2=new employee(2,"XYZ","delhi",1500.32);
ar.add(e1);
ar.add(e2);
Iterator<employee>it1;
it1=ar.iterator();
Scanner sc=new Scanner(System.in);
System.out.println("enter id to search");
int searchId=sc.nextInt();
while(it1.hasNext())
{
employee e=it1.next();
if(e.getId()==searchId)
System.out.println(e);
}
}
}

