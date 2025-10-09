import java.util.Scanner;


public class Operators {
public static void main(String[] args){



    // Arithmatic Operators
    // %,-, +, /,*,

// assignment Operators
// =, -=,*=,/=,+=,%=

// Tenary


Scanner haseena = new Scanner(System.in);
boolean livingroom = true;
boolean diningroom =false;
 boolean presence = livingroom && diningroom;  

String message = presence ? "presence": "abscence";
System.out.println(message);

System.out.println("Please enter a number ");
int number = haseena.nextInt();

boolean even = number % 2  ==0;
String feedback = even? "even": "odd";
System.out.println(feedback);

boolean dgfryh = even && true;
System.out.println(dgfryh );

// decrement and increment
// ++, --, +=,-=

// logical Operators
// Add  &, or ||, not!

// relational Operators
// ==,<,>,<=,>=, !=





}

    
}
