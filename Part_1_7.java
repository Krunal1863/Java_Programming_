package JavaFilePart_1;
//made by Krunal kevadiya
//Id:-21ce054
public class Part_1_7 {
    public static void main(String[] args) {
        int n = 8;
        int k=0;
        int m=0;
        for (int i=1;i<=8;i++){ //for 8 time reapet layer
            for (int j=1;j<=8-i;j++) // make space from starting
            {
                System.out.print("   ");
            }
            for (int j=1;j<=i;j++){
                k=(int)Math.pow(2,(j-1));  //for print as file
                System.out.print(String.format("% 3d",k)); //for formate the degite
            }
            for (int j=i;j>1;j--){
                m=(int)Math.pow(2,(j-2));
                System.out.print(String.format("% 3d",m)); //for mirror image og above
            }
            System.out.println("");
        }
    }
}
