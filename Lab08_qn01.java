import java.util.Scanner;

public class Lab08_qn01 {

    public static void main(String args[]){
        CircleWithException c1 = new CircleWithException();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius");
        double radius = input.nextDouble();
        try{
            c1.setRadius(radius);
        }catch(Exception e){
            System.out.println("Exception caught");
            e.printStackTrace();
        }
        
        System.out.format("Area is: %.2f",c1.getArea());
    }
    
}
