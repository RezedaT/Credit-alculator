public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int summ = 1_000_000;
        int year;
        double percent = 9.99;

        int payment = service.calculate(summ, 1, percent);
        int payment2 = service.calculate(summ, 2, percent);
        int payment3 = service.calculate(summ, 3, percent);

        System.out.println(payment + " Ежемесячный платеж, кредит на 1 год");
        System.out.println(payment2 + " Ежемесячный платеж, кредит на 2 года");
        System.out.println(payment3 + " Ежемесячный платеж, кредит на 3 года");


    }
}