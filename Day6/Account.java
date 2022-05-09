class Account
{
int id;
string name;
int balance;
Account (int id,string name,int balance)
{
this.id=id;
this.name=name;
this. balance=balance;
System.out.println("constructor with args call");
Account();
{
id =1;
name="abc";
balance=0;
System.out.println("constructor without argument");
}
void deposit(int amt);
{
balance+ =amt;
}
void withDraw(int amt)
{
balance=amt;
}
void print()
{
System.out.println("**********");
System.out.println("Id:+id);
System.out.println("name:"+name);
System.out.println("Balance:"+balance);
System.out.println("*********");
}
}
class Democonstructor
{
public static void main(String[]args)
{
Account ob1=new Account();
Account ob2=new Account(2,"xyz",1000);
ob2.deposit(3000);
ob1.deposit(1500);
ob1.print();
ob2.withDraw(2000);
ob2.print();
}
}

