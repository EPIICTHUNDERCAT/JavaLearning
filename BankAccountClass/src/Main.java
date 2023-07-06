public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();


        bank.setAccountBalance(1000);
        bank.setEmail("ricky@gmail.com");
        bank.setAccountNumber("12345676");
        bank.setName("Ricky");
        bank.depositFunds(900.0);
        bank.widthdrawBalance(1000);
        bank.accountBalance();
        Bank bankTrans2 = new Bank();
        bankTrans2.setAccountBalance(1000);
        bankTrans2.setEmail("ricky@gmail.com");
        bankTrans2.setAccountNumber("12345676");
        bankTrans2.setName("Ricky");
        bankTrans2.widthdrawBalance(90);
        bankTrans2.widthdrawBalance(100);
        bankTrans2.accountBalance();
    }
}