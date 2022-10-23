public class Main {
    public static void main(String[] args) {


        VipCustomer president = new VipCustomer("Joe Biden", "JoeBiden@Presidentialemail.com");

        System.out.println(president.getCreditLimit());

        VipCustomer justinAlvarez = new VipCustomer("Justin M Alvarez", 5000.00, "therealjustinalvarez@gmail.com");
        System.out.println("Your Credit Limit is: " + justinAlvarez.getCreditLimit());

//        BankAccount bankAccount = new BankAccount();
//        BankAccount bankAccount1 = new BankAccount("1234", 0.00d, "bob brown", "myemail@email.com", "3109558804");
//        System.out.println( bankAccount1.getAccountNumber());
//
//        bankAccount.setAccountBalance(2000);
//        bankAccount.setAccountNumber("12324534");
//        bankAccount.setCustomerName("Ricardo Villalobos");
//        bankAccount.setCustomerEmail("email@gmail.com");
//        //  bankAccount.depositFunds(2000);
//        bankAccount.withdrawFunds(1500);
//        bankAccount.depositFunds(1000);
//        System.out.println(bankAccount.getAccountBalance());
//        bankAccount.withdrawFunds(1500);
//        bankAccount.withdrawFunds(122);

//
//        Person person = new Person();
//
//        person.setFirstName("");   // firstName is set to empty string
//        person.setLastName("");    // lastName is set to empty string
//        person.setAge(10);
//        System.out.println("fullName= " + person.getFullName());
//        System.out.println("teen= " + person.isTeen());
//        person.setFirstName("John");    // firstName is set to John
//        person.setAge(18);
//        System.out.println("fullName= " + person.getFullName());
//        System.out.println("teen= " + person.isTeen());
//        person.setLastName("Smith");    // lastName is set to Smith
//        System.out.println("fullName= " + person.getFullName());
    }
}