public class BankAccount {

    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private String phoneNumber;


    public BankAccount() {
        System.out.println("Constructor Called Here");
        this.accountBalance = 0.00;
    }

    public BankAccount(String accountNumber, double accountBalance, String customerName, String customerEmail, String phoneNumber) {
        this.accountBalance = accountBalance;
        this.phoneNumber = phoneNumber;
        this.accountNumber = accountNumber;
        this.customerEmail = customerEmail;
        this.customerName = customerName;
    }

    public void depositFunds(double amountDeposited) {
        this.accountBalance += amountDeposited;
        System.out.println("Deposit of: " + amountDeposited + " made. New balance is: " + this.accountBalance);
    }


    public void withdrawFunds(double withdrawAmount) {

        if (this.accountBalance - withdrawAmount < 0) {
            System.out.println("Only Balance available: " + this.accountBalance + " available. Withdrawal not Processed");
        } else {
            this.accountBalance -= withdrawAmount;
            System.out.println("Withdrawal of: " + withdrawAmount + " Processed. Your New Balance is: " + this.accountBalance);
        }

    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
