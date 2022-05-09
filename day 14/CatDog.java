class CatDog{
public static void main(String[]args){
String str = "CatDog";
String ouput;
if(str.length() % 2 == 0)
{ 
output = str.subString(0, str.length()/2);
}
else{
output = null;
}
System.out.println("output");
}
}