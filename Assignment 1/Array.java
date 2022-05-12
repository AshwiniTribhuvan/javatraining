//Write a program that take 5 num into array and print Square value of each num
import java.lang.Math.*;

class Array{
public static void main(String[]args){
int arr[]={1,2,3,4,5};
System.out.println("Square num of each num");
for(int p=0; p<arr.length; p++){
System.out.println(arr[p]+"=" +(int)Math.pow(arr[p],2));
}
}
}