package JavaFilePart_2;
//Krunal Kevadiya
//21CE054
public class Part_2_5_MethodOverloading {

    int a;
    int b;
    int maths;

    void Maths(int x,int y)
    {
        a=x;
        b=y;

        maths=a+b;
        System.out.println("Your sum is "+maths);
    }
    void Maths(int x)
    {
        a=x;

       maths=a*a;
        System.out.println("your square is "+maths);
    }

    public static void main(String[] args) {
        Part_2_5_MethodOverloading A=new Part_2_5_MethodOverloading();
        A.Maths(4);
        A.Maths(4,5);
    }
}
