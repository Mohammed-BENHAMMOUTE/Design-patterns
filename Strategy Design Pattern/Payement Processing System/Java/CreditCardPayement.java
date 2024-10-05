public class CreditCardPayement implements PayementStrartegy{
    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditCardPayement(String name, String cardNumber, String cvv, String dateOfExpiry){
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public boolean Pay(float amount) {
        System.out.println("For brevity, we are not validating the credit card details");
        System.out.println("Payment of " + amount + " made with credit card");
    }

}