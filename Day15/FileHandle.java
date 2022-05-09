import java.io.*;
public class FileHandle{
public static void main(String[]args)throws Exception{
FileInputStream fin;
fin=new FileInputStream("C:\\users\\CIVIL LAB\Desktop\\capgemini\\day15_stringbuffer\\demo.txt");
StringBuffer sb;
sb=new StringBuffer();
 int x;
 System.out.println(fin.availabale());
 do{
 x=fin.read();
 if(x!=-1)
 {
 sb.append(char)x;
 }
 }
 while(x!=-1);
 System.out.println(sb.toString());
 fin.close();
 System.out.println();
 }
 }