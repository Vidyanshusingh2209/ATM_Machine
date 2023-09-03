package ATM_Machine;

import java.util.HashMap;
import java.util.Map;

public class OperationImplement implements OperationInterface {
    ATM atm = new ATM();
    Map<Double,String> ministmt = new HashMap<>();
    @Override
    public void viewBalance() {
        System.out.println("Available Balance is :" +atm.getBalance());
        System.out.println();
        System.out.println();
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {

        if (withdrawAmount <= atm.getBalance()) {
            ministmt.put(withdrawAmount, "Amount Withdrawn");

            System.out.println("Withdrawl Successful...");
            System.out.println("Collect your Cash: " + withdrawAmount);
            atm.setBalance(atm.getBalance() - withdrawAmount);
            viewBalance();
            System.out.println();
            System.out.println();

        }else{
            System.out.println("Insufficient Balance....");
            System.out.println();
            System.out.println();

        }

    }

    @Override
    public void depositAmount(double depositAmount){
        ministmt.put(depositAmount, "Amount Deposited");

        System.out.println(depositAmount + " Rs. Deposited Successfully...");
        atm.setBalance(atm.getBalance() + depositAmount);
        viewBalance();
        System.out.println();
        System.out.println();

    }

    @Override
    public void viewMiniStmt() {
        for (Map.Entry<Double, String> m:ministmt.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println();
        System.out.println();


    }


}
 
