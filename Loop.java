import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

        // for (int t = -4; t >= -500; t--){
        // System.out.println(t);
        // }

        // int t = -4;
        // while (t >= -500){
        // System.out.println(t);
        // t--;
        // }

        Scanner Mr = new Scanner(System.in);
        char test;
        do {

            System.out.println("What is Your Name ? ");
            test = Mr.next().charAt(0) ;

            System.out.println("Yeah !!! Your Name is " + test);

        } while (test != 'x');

    }

}