public class Bank {
    public static void main(String[] args) {
        int balance = 2_000_000_000;
        int transaction = 500_000_000;
        int deposit = balance + transaction;
        System.out.println(deposit);
    }
}
