public class CreditPaymentService {
    public int calculate(int summ, int year, double percent) {
        double monthPercent = percent / 100 / 12; //процентная ставка за месяц
        int periodInMonth = year * 12; //срок оплаты в месяцах
        double payment = summ * ((monthPercent * Math.pow((1 + monthPercent), periodInMonth)) / (Math.pow((1 + monthPercent), periodInMonth)-1));
        return (int) payment;
    }
}