public class Bank {

    private String name;
    private String accountNumber;
    private double accountBalance;
    private String email;
    private String phoneNumber;


    public double accountBalance() {

        System.out.println("This is your balance: $" + accountBalance);

        return this.accountBalance;
    }

    public double widthdrawBalance(double amountWidthdrawn) {
        double totalBalance = this.accountBalance - amountWidthdrawn;

        if (accountBalance - amountWidthdrawn >= 0) {
            System.out.println("Your New Balance is: $" + totalBalance);
            setAccountBalance(totalBalance);
        }
        if (accountBalance - amountWidthdrawn < 0) {
            System.out.println("Not Enough funds to widthdraw, your account balance is: $" + this.accountBalance);
            setAccountBalance(accountBalance);
        }
        return totalBalance;
    }

    public void depositFunds(double depositAmount){
        this.accountBalance += depositAmount;
        System.out.println("Deposit of $" +depositAmount + " made. New balance is $" +accountBalance );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
