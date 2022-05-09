class Sequence{
static Sequence obj=null;
static int counter;
private Sequence(){
counter=0;
}
static synchronized Sequence getInstance(){
if(obj==null){
obj= new Sequence();
}
return obj;
}
static synchronized int getCount(){
counter++;
return counter;
}
}
public class DemoSingle{
public static void main(String[] args){
Sequence s=Sequence.getInstance();
}
}
