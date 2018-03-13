package pack1;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("welcome to java");

//integer data types
int a=13;
short s=457;
long l=67777777;

//decimal point

float f=67.0f;
double d =3.5;

char c='t';
boolean bool=true;
String S="hello";

//System.out.println(a+"\t"+s+"\t"+l);
//System.out.println(f+"\t"+d);
//System.out.println(c+"\t"+bool+"\t"+s);

//block a  runs all statements with in {} at a time and local variables in block cant be accessible outside 
//ab variable can't be accessible after block completion

a: {
	int ab=23;
System.out.println(a);
System.out.println(f);
}

// if else block is basic control in java 
// if takes single statement or block 
// if , if else , if else if , if else ladder are different varieties in control structure
//if(a%2==0)
//{
//	System.out.println(a +" is even number");
//	a=a+2;
//}
//else 
//{
//	System.out.println(a+ " is odd number ");
//a=a+1;
//}
//System.out.println(a);
//
////if condition accept only boolean expression or boolean values 
//if(true)
//	System.out.println("true "+bool);
//c='a';
//// switch is equivalent to multiple equality if condition [(if(a==1) or (if(a==2)]
//// in switch statement all statements will be executed once the condtion is met 
//// we have to use break to come out of switch block 
//switch(c)
//{
//	case 'a':{System.out.println("ovel "+c);break;}
//	case 'e':{System.out.println("ovel "+c);break;}
//	case 'i':{System.out.println("ovel "+c);break;}
//	case 'o':System.out.println("ovel "+c);break;
//	case 'u':System.out.println("ovel "+c);break;
//	default:System.out.println("this is other character than ovel ");
//	
//	}
//a=10;
////in this below case  it will print three times if a==20
//
//switch(a)
//{
//case 10:System.out.println("number is"+a);
//case 20:System.out.println("number is"+a);
//case 30:System.out.println("number is"+a);
//case 40:System.out.println("number is"+a);
//}


	//loops
//int i=1;
//
//while(i<10)
//{
//	System.out.println(i);
//	++i;
//	}
//int j=10;
//do {
//	System.out.println(j);
//	--j;
//}while(j>=1);
//System.out.println("for loop ");
//for(int k=0 ; k<=10;k++)
//{
//if(k==5) continue;
//System.out.println(k);	
//}
//
//for(int k=0 ; k<=10;k++)
//{
//if(k==5)break;
//}

//Scanner sc = new Scanner(System.in);
//System.out.println("please enter a string ");
//String instr=sc.next();
//System.out.println("input string is"+instr);
//sc.close();

//Object creation 

//we can create object for any class in main method including self object 
// object for First class 

First f1 = new First();
System.out.println(f1.add(12, 23));

Second se = new Second();
int 
result1=se.addconstant(12);
int result2 = se.add(12,13);
System.out.println("adding constant to given number " +result1);
System.out.println("adding two numbers"+result2);
// to access private variable p we have to use getters
// to access default or public variable we can directly access using object.variable

System.out.println(se.a+"   "+se.getP());

Third t = new Third();
//t object has access to all public methods of second and third and public plus protected variables and setters and getters
t.display();
System.out.println("Calling add()"+t.add(23, 34)+"\n calling add constant"+t.addconstant(34)+"\n"+t.getP());
Fourth fo = new Fourth(); 
System.out.println("calling add constant from addextra method  passing 23"+fo.addextra(23));
	}
	
	//Method or function definition 
	//Function  has two parts Function signature and Function  definition   follows as below 
//Signature is having five parts 1) access specifier 2)storage specifier  3)return type 4)function name and 5)input parameters with datatypes
//	definition is block {} of statements  followed by return statement

public int add(int a,int b) {
	return a+b;
	
}
}



////Access specifiesrs public private protected 
//Public means accessed from any class 
//Private means only from with in the class and can be acessed by other classes using getters and setter 
//Protected is accessed directly by child class which inherit parent variables and other classes can access using setters and getters 
//// with out setter and getter we can't access private variables 
////this is called abstraction :abstracting or hiding actual variable access from outside class
////encapsulation : class has methods and propeties  holding  these two together in class is encapsulation 
////inheritance : creating a child class by extending parent class 
////Child class has all access on Parent class methods and public and protected properties excpet private 
//

class Second{
	
	public int a=10;
	private int p=23;
	protected int pr=233;
	
	public int getP() {
		return p;
	}
	public void setP(int p) {
		this.p = p;
	}
	
	public int addconstant(int in1)
	{
		return in1+a;
	}
	public int add(int i,int j) {
		return i+j;
	}
	}

////inheritance is extending other class to access the methods and properties of that class
////third classs is called child class and Second is called class 
class Third extends Second{
	public int aa=344;
	protected int prt=55;
	private int p1=4;
	//getter for reading variable 
	public int getP1() {
		return p1;
	}
	public int getPrt() {
		return prt;
	}
	
	//setter for assaigning  value to variable 
	
	public void setPrt(int prt) {
		this.prt = prt;
	}
	public void setP1(int p1) {
		this.p1 = p1;
	}
	public void display()
	{
		System.out.println("this is third class ");
		System.out.println(pr);
	}
	//add (int,int) is already defined in parent class 
	//redefining same thing will oveeride the definition
	// child function def will ovverie parent finc def
	public int add(int i,int j) {
		System.out.println("calling add () from child");
		return i+j;
	}
}
//
////mutli level inheritance 
//// Third is extending Second  Fourth is extending Third ...Fourth has Second as well as Third class access
////in java we have multi level inheritance 
//// at a time we can extend only one class 
//
////Java has avoided multiple inheritance( extending mutiple classes ) because of diamond problem
class Fourth extends Third{
	
	public int addextra(int a) {
		return addconstant(a) ;
		
	}
	//POLY MORPHISM
	
	//same name different functionality
	//functional polymorphism means same function name with diferent parameter types is called polymorphism
	//two typesof polymorphism one is overloading and second one is overriding 
	
	//overloading having two methods with same name in the same class 
	//ex add(int,int) add(float ,float)
	
	
	public float addextra(float a) {
		return a+20;
		
	}
	
	
}
