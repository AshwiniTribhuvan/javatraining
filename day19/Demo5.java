class Test implements Runnable{

Thread t;
Test(String n,int p){
t=new Thread(this);
t.setName(n);
t.setPriority(P);
t.start();
}
@Override
public void run(){
try{
for (int i=0;i<5;i++){
System.out.println("child thread" +.getNmae()+":"+i);
Thread.sleep(500);
}
}
catch (Exception e){
}
}
}public class Demo6{
public static void main(String[]args){
Test t1=new Test("A", Thread.MIN_PRIORITY);
Test t2=new Test("B", Thread.NORM_PRIORITY);
Test t3=new Test("C", Thread.MAX_PRIORITY);
try{
for(int i=0;i<9;i++){
System.out.println("Main thread" +i);
Thread.sleep(1500);
}
}
catch(InteruptedException e){
}
}
}
