package Bank;

public class BankMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("65432165465744165", 652.74, "Bob", "bob@test.com", "+45 465 135 742");
        System.out.println(bankAccount.getAccountNumber());
        System.out.println("Username: " + bankAccount.getCustomerName());
        System.out.println("User's email: " + bankAccount.getEmail());
        System.out.println("Phone number: " + bankAccount.getPhoneNumber());

        bankAccount.withdrawFunds(200);
        System.out.println("Balance: " + bankAccount.getBalance());
        bankAccount.withdrawFunds(200.00);
        System.out.println("Balance: " + bankAccount.getBalance());
        bankAccount.depositFunds(200);
        bankAccount.withdrawFunds(1300);
        bankAccount.withdrawFunds(1200);
        bankAccount.depositFunds(21.37);

        BankAccount timAccount = new BankAccount("Tim", "tim@email.com", "000000000");
        System.out.println(timAccount.getPhoneNumber() + " name " + timAccount.getCustomerName());

        VipCustomer vip1 = new VipCustomer();
        System.out.println(vip1.getName());

        VipCustomer vip2 = new VipCustomer("Bob", 2060.00);
        System.out.println(vip2.getName());
        System.out.println(vip2.getCreditLimit());

        VipCustomer vip3 = new VipCustomer("Mark", 150.00, "bob@test.com");
        System.out.println(vip3.getName());
        System.out.println(vip3.getCreditLimit());


    }

}
