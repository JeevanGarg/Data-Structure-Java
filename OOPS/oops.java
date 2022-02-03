
import java.util.Scanner;
import java.util.*;

import java.util.*;

public class oops {

   
    public static void main(String[] args)
    {
        /*oops   one example-below
        
        Q1) what is oop?  
        Sol:- oops is object oriented Programming is associated with the concept of class and object and 
              other concept revolve around this like Encapsulation,Abstraction,Inheritance,Polymorphism etc.
              Eg. class:-Fruit object:-Apple,Mango.

        Q2) What is Class?
        Sol:- class is blueprint for object which contain data member and member function within it.

        Q3) what is object?
        Sol:- Object is the instance for the class.

        Q4) what is getter and setter?
        Sol:- It is used to acces private member outside the class.

        Q5) why we use this keyword?
        Sol:- this keyword is used to specify current object.

        Q6) what is final Keyword?
        Sol:- It avoid to override existing value.

        Q7) what is Constructor?
        Sol:- Constructor is member function of the class having same name that of class name and is 
              automatically executed as soon as object of respective class is created.

        Q8) Name 4 pillars of oops?
        Sol:- Abstraction,Encapsulation,Polymorphism,Inheritance

        Q9) What is static Keyword?
        Sol:- we will create onle one instance of static member and that is shared across all instance of class.

        Q10) Whst is static function?
        Sol:- Static methods are the methods in Java that can be called without creating an object of class.
        
        Q11) what is Encapsulation?
        Sol:-

        Q12) what is Abstraction?
        Sol:-










        --------------------------------------------------------------------------------
        Fraction example
        num/dem + num/dem = ans - Adding two fraction

        1) Fraction.java

            package oops;

public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction(int numerator,int denominator){
        this.numerator=numerator;
        this.denominator=denominator;
        simplify();
    }

    private void simplify() {
        int gcd=1;
        int smaller=Math.min(numerator,denominator);

        for(int i=2;i<=smaller;i++)
        {
            if(numerator%i==0 && denominator%i==0){
                gcd=i;
            }
        }
         //System.out.println(gcd);
        numerator=numerator/gcd;
        denominator=denominator/gcd;
       // System.out.println(numerator+" "+denominator);
    }

    public void increment(){
        numerator=numerator+denominator;
    }

    public void add(Fraction f2){
        numerator=this.numerator*f2.denominator+this.denominator*f2.numerator;
        denominator=this.denominator*f2.denominator;
    }

    public static Fraction sum(Fraction f1,Fraction f2){
        int num=f1.numerator*f2.denominator+f1.denominator*f2.numerator;
        int denom=f1.denominator*f2.denominator;
        Fraction f3=new Fraction(num,denom);
        return f3;

    }

    public void print(){
        System.out.println(numerator+"/"+denominator);
    }


}

        2) FractionUse.java
        
        package oops;

public class FractionUse {
    public static void main(String[] args){
        Fraction f1=new Fraction(4,6);
        //f1.increment();
        //f1.print();
        Fraction f2=new Fraction(5,4);
        Fraction f3=Fraction.sum(f1,f2);
        f3.print();
    }
}
  
        
        */

        
        
    }
    
}
