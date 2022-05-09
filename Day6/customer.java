class customer
{
private String Fname;
private String Lname;
void Selfname(String Fname)
{
this .Fname=Fname;
}
void setlname(String lname)
{
this.Lname=Lname;
}
String getlname()
{
return Lname;
}
class Account{
int balance;
customer cust;
void showAccount()
{
System.out.println("fname:"+cust.getname);
System.out.println("lname:"+cust.getname);
System.out.println("balance:"+cust.balance);
}
Account (customer c,int balance)
{
this.cust=c;
this.balance=balance;
}
}
public class DemoAssig3
{
public static void main(String[]args)
{
customer ob1=new customer();
ob1.setfname("abc");
ob1.setlname("xyz");
int x=1000;
Account.acc1=new Account(ob1,x);
Account.acc2=new Account(ob1,2000);
}
}

}