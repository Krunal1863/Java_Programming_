package JavaFilePart_1;
// made by krunal kevadiya-
//21CE054
import java.util.Scanner;

public class Part_1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        a = a%10;//for finding reminder
        b = b%10;
        boolean c = a==b;
        System.out.println(c);
    }
}
