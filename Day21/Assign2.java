//*Create an ArrayList which will be able to store only Strings. Create a printAll method which will print all elements using Iterator.
import java.util.*;
class Assign2
{
public static void main(String[]args){
ArrayList<String>ar;
ar=new ArrayList<>();
ar.add("A");
ar.add("B");
ar.add("C");
ar.add("D");
ar.add("E");
Iterator it1;
it1=ar.iterator();
//system.out.println("Forward....");
while(it1.hasNext())
{
System.out.println(it1.next());
}
}
}
