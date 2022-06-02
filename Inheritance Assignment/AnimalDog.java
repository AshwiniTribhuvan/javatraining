 
//1.inheritence 
//2.overriding cocepts 
//3.constructor without arugments 

class Animal {

Animal()
{

}

void eat()
{

System.out.println("Animal  ---> Eat Method Call  " ) ;

}

void sleep()
{

System.out.println("Animal ---> sleep method call ");
}


}

class Dog extends Animal {

Dog()
{



}

@Override
void eat()
{

System.out.println("Dog ----> Eat method call  --> Base class Method  ");

}

@Override
void sleep()
{

System.out.println("Dog   ---> sleep method call -> Base class Method  ");

}


void flay()
{

System.out.println("run ---> method call ");

}

}


public class AnimalDog {
public static void main(String args[])
{


Animal ob = new  Animal();
ob.eat();
ob.sleep();

Dog ob2 = new Dog();
ob2.eat();
ob2.sleep();
ob2.flay();

}
}