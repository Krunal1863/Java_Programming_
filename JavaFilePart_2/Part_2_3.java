package JavaFilePart_2;
import java.util.Locale;
import java.util.Objects;
//KRUNAL KEVADIYA
//21CE054
import java.util.Scanner;
public class Part_2_3 {
    public static void main(String[] args) {
        String accno;
        String[] accounts = {"AC001", "AC002", "AC003", "AC004", "AC005", "AC006", "AC007", "AC008", "AC009", "AC010"};
        Scanner sc = new Scanner(System.in);
        int itr = 0;
        while (itr == 0) {
            accno = sc.nextLine();
            for (int i = 0; i < 10; i++) {
                if (Objects.equals(accno, accounts[i])) {
                    itr = 1;
                }
            }
                if (itr == 1) {
                    System.out.println("1.\tBalance inquiry \n" + "2.\tWithdraw money [Maintain minimum balance 300₹]\n" + "3.\tDeposit money \n"+"4.\tMoney Transfer \n"+"5.\tCreate Account \n"+"7.\tExit \n");

                } else {
                    System.out.println("enter correct id ");

                }
            }

        }
    }

