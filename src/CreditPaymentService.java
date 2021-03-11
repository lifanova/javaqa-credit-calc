public class CreditPaymentService {
    private static final int MONTHS = 12;

    public double calculate(double creditSum, int years, double percents) {
        double resultSum = 0;
        /**
         * Аннуитетный платеж = Сумма_кредита * ((i * (1 + i)^n) / (1 + i)^n - 1),
         *
         * где
         i — ставка в процентах по кредиту в месяц,
         например если кредит под 12% годовых, то получим 12/12/100 = 0.01 или 1 процент в месяц
         n — срок кредита, обычно в месяцах
         *
         * */

        int n = years * MONTHS;
        double i = percents / MONTHS / 100;
        double temp = i * Math.pow((1 + i), n) / (Math.pow((1 + i), n) - 1);

        resultSum = creditSum * temp;


        return resultSum;
    }
}
