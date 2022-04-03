public class Main {
    public static void main(String[] args) {
        int balance = 120;
        int payment = 1200;
        int minDiscountPayment = 1000;
        int discountAmount = 100;

        balance = balance + payment;

        if (payment >= minDiscountPayment) {
            balance = balance + payment/discountAmount;
        }

        System.out.println("Итоговая сумма на вашем счёте " + balance);

    }
}
