import java.util.Scanner;
public class Statement {

public static void main(String[] args) {
    
    // if else  Statement
if (20>=31){
    System.out.println("true");
    
}else{
    System.out.println("false");
        
}

if (1000>=200){
    System.out.println(1000+" is great");
}else{
    System.out.println(1000+" is not great");
}

if  (50>=10){
    System.out.println(50 +" is greatest");

}else{
    System.out.println(10 +" is lesser");
} 

if (2>=1){
   System.out.println(2 + " is blue" + " is actually the greatest");
}else{
    System.out.println(1 + " is red"+ " is actually the lesser");
}

if (1>0){
    System.out.println(1 + " is in the room");
}
else{
    System.out.println(0 +" is in the room");
}

String output =  1 > 0 ? 1 + " is in the room.... " :  0 + " is in the room...." ;
System.out.println(output);
// else if Statement

// Nested If Statement
boolean OutSideSensor = true;
boolean Insidesensor = true;
int count = 0;

if(OutSideSensor){

    if (Insidesensor) {
       
        count = count + 1;

    }
}

if(Insidesensor){

    if (OutSideSensor) {
       
         if (count  <= 0 ) {
        
            count = 0;
         }else{

            count = count - 1;
         }

    }
}


if (count > 0) {
    
    System.out.println("Light On");
}else{

    System.out.println("Light Out");
}


// Switch Case

Scanner lada = new Scanner(System.in);

System.out.println("input first number");
float first = lada.nextFloat();


System.out.println("input operation");
char oper = lada .next().charAt(0);

System.out.println("input second number");
float second = lada.nextFloat();


switch (oper) {

    case '+' -> System.out.println("The Sum of " + first + " + " + second + " == " + (first + second));

    case '-' -> System.out.println("The Difference of " + first + " - " + second + " == " + (first - second));

    case '*' -> System.out.println("The Product of " + first + " * " + second + " == " + (first * second));

    case '/' -> System.out.println("The Division of " + first + " / " + second + " == " + (first / second));

    default -> System.out.println("Wrong Input try Again");
    
}





}
}
