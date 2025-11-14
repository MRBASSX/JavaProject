
public class Functions {

    public static void main(String[] agrs) {


        int number = 4;

        SquareSize(number);

        RectangularSize(600,number);
         RectangularSize(200,200);
        trianglesize(950,2670);
   
    }

    public static void Mary() {
        System.out.println("Mary Nkrumah");
    }


    public static void SquareSize(float length){

       System.out.println("The size of the Square is " + (4 * length));
    }

    public static void RectangularSize(double length,double breath){

        System.out.println(" The size of the Rectangle is  " + ((2 * length)  +(2 * breath )));
    }

    public static void trianglesize(float height,float base){
        System.out.println("The size of the triangle is "+ (0.5) * (height * base));
    }

    

}
