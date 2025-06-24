public class UPIStrategy implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("Paid by UPI");
    }
}
