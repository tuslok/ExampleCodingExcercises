package AccessModifiers;

public class Main {
    public static void main(String[] args) {

        Account timsAccount = new Account("Tim");
        timsAccount.deposit(1000);
        timsAccount.withdraw(500);
        timsAccount.withdraw(-250);
        timsAccount.withdraw(-60);
        timsAccount.calculateBalance();


        System.out.println("balance on account is " + timsAccount.getBalance());

    }
}
