
import java.util.Scanner;



public class Operators {
public static void main(String[] args){



    // Arithmatic Operators
    // %,-, +, /,*,

// assignment Operators
// =, -=,*=,/=,+=,%=

// Tenary


// Scanner haseena = new Scanner(System.in);
// boolean livingroom = true;
// boolean diningroom =false;
//  boolean presence = livingroom && diningroom;  

// String message = presence ? "presence": "abscence";
// System.out.println(message);

// System.out.println("Please enter a number ");
// int number = haseena.nextInt();

// boolean even = number % 2  ==0;
// String feedback = even? "even": "odd";
// System.out.println(feedback);

// boolean dgfryh = even && true;
// System.out.println(dgfryh );

// decrement and increment
// ++, --, +=,-=

// logical Operators
// Add  &, or ||, not!

// relational Operators
// ==,<,>,<=,>=, !=



// logical  Operator
// Scanner input = new Scanner(System.in);


// System.out.println("Enter first number");
// int num1 = input.nextInt();
// System.out.println("Enter second number");
// int num2 = input.nextInt();
// System.out.println("Enter third number");
// int num3 = input.nextInt();
// if (num1 > num2 && num1 >num3){
//     System.out.println(num1 + "is the greatest number");

// }
//  else if(num3 > num2 && num3 > num1)
//  {
// System.out.println(num3 + "is the greatest");
    
//  }
//   else if(num2 > num1 && num2 > num3){
//     System.out.println(num2 + "is the greatest");
//   }


// Scanner input1 =new Scanner(System.in);


// System.out.println("Enter first number");
// float number1 = input1.nextFloat();
// System.out.println("Enter second number");
// float number2 = input1.nextFloat();
// System.out.println("Enter third number");
// float number3 = input1.nextFloat();
// System.out.println("Enter fouth number");
// float number4 = input1.nextFloat();
// if(number1 > number2 && number1 > number3 && number1 > number4){
//    System.out.println(number1 + "is the biggest");

// }

// else if (number2 > number3 && number2 > number4 && number2 > number1 ){
//     System.out.println(number2 +" is the biggest");
// }
// else if (number3 > number4 && number3 > number1 && number3 > number2){
//  System.out.println(number3 + "is the bigger");

// }else if (number4 > number3 && number4 > number2 && number4 > number1){
//     System.out.println(number4 + " is the bigger");
// }


Scanner hope = new Scanner(System.in);

System.out.println("Enter first Number");
float first = hope.nextFloat();

System.out.println("Enter Operation To perform");
char op = hope.next().charAt(0);

System.out.println("Enter second Number");
float second = hope.nextFloat();


if (op == '+') {

    System.out.println("The Sum of " + first + " + " + second + " == " + (first + second));
}else if(op == '*'){

    System.out.println("The Product of " + first + " * " + second + " == " + (first * second));


 }else if(op == '-'){

    System.out.println("The Difference of " + first + " - " + second + " == " + (first - second));


}else if(op == '/'){

    System.out.println("The Division of " + first + " / " + second + " == " + (first / second));

    
}

}

}
