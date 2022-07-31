package JavaFilePart_1;
//made by Krunal kevadiya
//21Ce054

import java.util.Scanner;

public class Part_1_4_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int []array = new int[n];
        boolean as=false;


        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();


        }

        for(int i=0;i<n;i++)
        {
            // array[i]=sc.nextInt();
            if(array[i]==1){
                i++;
                if(array[i]==2){
                    i++;
                    if(array[i]==3);{
                        as=true;
                    }
                }

            }

        }
        // System.out.println("false");

        System.out.println(as);


    }
}


