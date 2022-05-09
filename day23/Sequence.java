class Sequence{
static Sequence obj=null;
static int count;
private Sequence(){
count=0;
}
static synchronized sequence getInstance(){
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
Sequence=s=Sequence.getInstance();
}
}
