package JavaFilePart_2;
//krunal Kevadiya
//21CE054
import java.sql.SQLOutput;

public class Part_2_1_circle {
    double r=1;
    double Area;
   double Perimeter;


    Part_2_1_circle(){
        Area=3.14*r*r;

    }
    Part_2_1_circle(int x)
    {
        r=x;

    }
    void getArea()
    {
        Area=3.14*r*r;

        System.out.println("Your Area is "+Area);


    }
    void getPerimeter()
    {
        Perimeter=2*3.14*r;

        System.out.println("Your perimeter is "+Perimeter);

    }

    public static void main(String[] args) {

        Part_2_1_circle A=new Part_2_1_circle();
        A.getArea();
        A.getPerimeter();

        int n=4;
        Part_2_1_circle A1=new Part_2_1_circle(n);
        A1.getPerimeter();
        A1.getArea();



    }
}
