import java.io.*;
public class DemoIO1{
public static void main(String[]args)throws Exception{
FileInputStream fin;
fin=new
FileInputStream("C:\\javatraining\\files\\test1.txt");
StringBuffer sb;
sb=new StringBuffer();
int x;
System.out.println(fin.available());
//read() will get next available byte
//from file.if no data present then it will
//return -1
//x=fin.read();
//System.out.println((char)x);
do{
x=fin.read();
if(x!=-1)
{
System.out.println((char)x);
}
}while(x!=-1);
fin.close();
System.out.println();

}
}