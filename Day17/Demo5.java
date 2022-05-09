//RandomAccessFile
import java.io.*;
public class Demo5{
public static void main(String[]args)throws Exception{
RandomAccessFile ob;
ob = new RandomAccessFile ("C:\\Users\\HP\\Documents\\day16\\test8.txt","rw");
ob. seek(5);
ob.seek(0);
int x;
do{
x=ob.read();
if(x!=-1){
System.out.print((char)x);
}
}
while (x!=-1);
ob.close();
System.out.println();
}
}
