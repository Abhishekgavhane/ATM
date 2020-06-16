import java.text.NumberFormat;
import java.util.Scanner;


public class ATM {

    public static void main (String[] args){
        //create an account objects
        Account checking = new Account();
        checking.setType("checking");
        checking.setBalance(0.00);
        checking.setRate(0.00);

        Account savings = new Account();
        savings.setType("Savings");
        savings.setBalance(0.00);
        savings.setRate(2.00);

        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        Scanner sc= new Scanner(System.in); //create scanner object  to get user input.

        boolean session = true;
        while(session) {
            //user menu options
            System.out.println("\nATM Menu: \n \n"
                                                + "1. Deposit Money \n"
                                                + "2. Withdraw Money \n"
                                                + "3. Transfer Funds \n"
                                                + "4. Check Account Balance \n"
                                                + "5. End Session: ");

        }



    }
}
