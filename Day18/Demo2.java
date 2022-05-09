class Test implements Runnable{
Thread t;
Test(string n){
t=new Thread(this);
t.setName(n);
t.start();
}
public void run(){
2for(int i=0;i<5;i++);
System.out.println("Child threat"+t.getNmae()+":"+i);
Thread.sleep(500);
}
}
catch(Exception e){
}
}
}
public class Demo2{
public static void main(String[]args){
Test t1=new Test("A");
Test t1=new Test("B");

Test t1=new Test("C");
try{
for(int i=0;i<5;i++){
System.out.println("main thread"+i);
Thread.sleep(1500);
}
}catch (InterruptedException e){
}
}
}

