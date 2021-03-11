public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double creditSum = 1_000_000;
        int creditPeriod = 1; //Годы
        double percents = 9.99;

        double result = service.calculate(creditSum, creditPeriod, percents);
        System.out.printf("Срок кредита (годы) %d. Сумма ежемесячного платежа =  %.0f рублей\n", creditPeriod, result);

        creditPeriod = 2;

        result = service.calculate(creditSum, creditPeriod, percents);
        System.out.printf("Срок кредита (годы) %d. Сумма ежемесячного платежа =  %.0f рублей\n", creditPeriod, result);

        creditPeriod = 3;

        result = service.calculate(creditSum, creditPeriod, percents);
        System.out.printf("Срок кредита (годы) %d. Сумма ежемесячного платежа =  %.0f рублей\n", creditPeriod, result);
    }
}
