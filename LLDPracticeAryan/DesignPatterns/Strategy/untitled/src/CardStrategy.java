public class CardStrategy implements PaymentStrategy{

    @Override
    public void pay() {
        System.out.println("Payment by card");
    }
}
