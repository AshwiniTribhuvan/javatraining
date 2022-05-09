//write a program the content of one file to another by using CHAR IO classes. 
import java.io.*;
class CopyDataFiletoFile
{
public static void main(String[]args)throws Exception
{
FileInputStream Fread=new FileInputStream("C:\\Users\\HP\\Desktop\\test9.txt");
FileOutputStream Fwrite=new FileOutputStream("C:\\Users\\HP\\Desktop\\blank.txt");
System.out.println("File is copied");
int c;
while((c=Fread.read())!=-1)
Fwrite.write((char)c);
Fread.close();
Fwrite.close();
}
}