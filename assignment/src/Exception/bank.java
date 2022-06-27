package Exception;

public class bank {
    public static void main(String[] args) {
        savings_ac cust1=new savings_ac(101,20000);
        System.out.println("Your account created succesfully with your ID "+cust1.getID()+ " and your current balance is "+cust1.getBalance());
       
        try {
            cust1.withdraw(45000);
        }
        catch (InsufficientBalanceException e){
            System.out.println("Insufficient Funds: Unfortunately, You Don't have Sufficient Balance in your account");
        }
        catch (illeagalBankTransactionException f){
            System.out.println(" Illegal Entry: This is technically an illegal amount, You cannot withdraw in negative numbers");
        }
    }
}

