package ATM_Machine;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        OperationImplement op = new OperationImplement();
        // User Validation
        int UserAtmNo = 12345;
        int UserAtmPin = 123;
        Scanner in = new Scanner(System.in);
        System.out.println(" --------------------------------------------------------------------");
        System.out.println("|                                                                    |");
        System.out.println("|                                                                    |");
        System.out.println("|                                                                    |");
        System.out.println("|                         WELCOME TO A.T.M.                          |");
        System.out.println("|                                                                    |");
        System.out.println("|                                                                    |");
        System.out.println("|                                                                    |");
        System.out.println(" --------------------------------------------------------------------");

        System.out.println("Please Enter The ATM no. : ");
        int Atmno = in.nextInt();
        System.out.println("Enter your ATM PIN : ");
        int Atmpin = in.nextInt();
        if ((Atmno == UserAtmNo) && (Atmpin == UserAtmPin)){
            while (true){

                System.out.println("1. View Available Balance");
                System.out.println("2. Withdraw Amount");
                System.out.println("3. Deposit Amount");
                System.out.println("4. View Mini-Statement");
                System.out.println("5. Exit");
                System.out.println("Enter Choice: ");
                int ch = in.nextInt();
                switch (ch){
                    case 1:
                        op.viewBalance();
                        break;
                    case 2:
                        System.out.println("Enter Amount to Withdraw: ");
                        double withdrawAmount = in.nextDouble();
                        op.withdrawAmount(withdrawAmount);
                        break;
                    case 3:
                        System.out.print("Enter Amount to Deposit: ");
                        double deposit = in.nextDouble();
                        op.depositAmount(deposit);
                        break;

                    case 4:
                        op.viewMiniStmt();
                        break;
                    case 5:
                        System.out.println("Collect Your Card.... Thank You ....");
                        return ;
                    default:
                        System.out.println("Invalid input");
                        System.out.println();
                        System.out.println();

                }
            }
//            System.out.println("Validation Successful");
        }else {
            System.out.println("Invalid Credentials");
//            System.exit(0);
        }


    }
                    }
