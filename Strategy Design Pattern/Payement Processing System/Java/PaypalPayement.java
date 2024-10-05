public class PaypalPayement implements PayementStrategy{
    private String email;
    private String password;

    public PaypalPayement(String email, String password){
        this.email = email;
        this.password = password;
    }

    @Override
    public boolean Pay(float amount) {
        System.out.println("For brevity, we are not validating the paypal details");
        System.out.println("Payment of " + amount + " made with paypal");
        return true;
    }
}