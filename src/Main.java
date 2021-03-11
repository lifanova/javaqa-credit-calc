public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double result = service.calculate();
        System.out.println(result);
    }
}
